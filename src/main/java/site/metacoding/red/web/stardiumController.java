package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class stardiumController {
	//돌아감
	@GetMapping("/stardium")
	public String stardium() {
		return "<h1>stardium</h1>";
	}
}
