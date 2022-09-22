package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
public class PlayerController {

	//돌아감
	@GetMapping("/player")
	public String player() {
		return "<h1>player</h1>";
	}
}
