package com.acmors.festa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConvidadosController {
	 
	@GetMapping("/convidados")
	public String listar() {
		
		return "list de convidados.";
	}
}
