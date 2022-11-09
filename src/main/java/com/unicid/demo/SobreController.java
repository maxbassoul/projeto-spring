package com.unicid.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sobre")
public class SobreController {
	@GetMapping("/sobre")
	public String sobre() {
		return "/sobre/sobre";
	}
}
