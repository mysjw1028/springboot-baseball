package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;

@RequiredArgsConstructor
@RestController
public class ExpulsionController {
	//돌아감
	@GetMapping("/Expulsion")
	public String Expulsion() {
		return "<h1>Expulsion</h1>";
	}
}
