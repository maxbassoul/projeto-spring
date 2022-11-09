package com.unicid.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servicos")
public class ServicosController {
	
	@GetMapping("/servicos")
	public String servicos() {
		return "/servicos/servicos";
	}

}
