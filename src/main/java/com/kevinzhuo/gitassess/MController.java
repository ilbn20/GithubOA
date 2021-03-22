package com.kevinzhuo.gitassess;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MController {

	@GetMapping("/convert/{s}")
	public Message convert(@PathVariable String s) {
		Message msg = new Message(s);
		msg.calc();
		return msg;
	}
	
	@GetMapping("/binaryreverse/{s}")
	public Message2 reverse(@PathVariable String s) {
		Message2 msg = new Message2(s);
		msg.calc();
		return msg;
	}
}
