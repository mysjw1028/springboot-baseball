package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;

@RequiredArgsConstructor
@RestController
public class TeamController {
	//돌아가는거 확인완료
	
	@GetMapping("/")
	public String team() {
		return "<h1>team</h1>";
	}
}
