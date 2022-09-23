package site.metacoding.red.web;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.PlayerService;
import site.metacoding.red.web.dto.request.player.PlayerReqDto;

@RequiredArgsConstructor
@RestController
public class PlayerApiController {
	
	private final PlayerService playerService;

	@PostMapping("/api/players/save")
	public String insert(PlayerReqDto PlayerReqDto) {
		playerService.insert(PlayerReqDto);
		return "선수 추가 완료";
	}

//	@GetMapping("/api/players")
//	public List<Player> findAll() {
//		List<Player> players = PlayerService.findAll();
//		return players;
//	}
//
//	@GetMapping("/api/players/team")
//	public List<TeamlistDto> findByTeam() {
//		List<TeamlistDto> players = playerService.findByTeam();
//		return players;
//	}
//
//	@GetMapping("/api/players/position")
//	public List<PositionlistDto> findByPosition() {
//		List<PositionlistDto> players = playerService.findByPosition();
//		return players;
//	}
//
//	@GetMapping("/api/players/{id}")
//	public ListDto findById(@PathVariable Integer id) {
//		ListDto player = playerService.findById(id);
//		return player;
//	}
//
//	@DeleteMapping("/api/players/{id}")
//	public String delete(@PathVariable Integer id) {
//		playerService.delete(id);
//		return "선수 삭제 완료";
//	}

}