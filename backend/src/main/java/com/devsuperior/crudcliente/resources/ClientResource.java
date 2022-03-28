package com.devsuperior.crudcliente.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.crudcliente.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L,"Maria Silva", "12345678901", 6500.0, 2));
		list.add(new Client(1L,"João Oliveira", "23456789101", 7000.0, 3));
		list.add(new Client(1L,"Leonardo Junior", "34567891201", 5525.0, 1));
		return ResponseEntity.ok().body(list);
	}
	
}
