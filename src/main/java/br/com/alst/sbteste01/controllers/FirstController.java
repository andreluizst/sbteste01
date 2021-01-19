package br.com.alst.sbteste01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping(method = RequestMethod.GET, path = "ola")
	public String ola() {
		return "Olá Spring Boot!!!!!";
	}
	
	@GetMapping
	public String index() {
		return "Página inicial";
	}
	
	@GetMapping(path = {"ola2", "saudacao"})
	public String ola2() {
		return "Olá! Seja bem vindo!"; 
	}
}
