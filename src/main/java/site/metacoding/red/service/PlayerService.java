package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.explusion.Explusion;
import site.metacoding.red.domain.explusion.ExpulsionDao;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.web.dto.request.player.PlayerReqDto;
import site.metacoding.red.web.dto.request.player.UpdateDto;
import site.metacoding.red.web.dto.response.listDto;

@RequiredArgsConstructor
@Service
public class PlayerService {

	private final PlayerDao playerDao;


	public List<Player> 선수목록보기(Integer id, Integer principalId) {
		return playerDao.findAll(id, principalId);
	}

	public Player 선수상세보기(Integer id, Integer principalId) {
		return playerDao.findByDetail(id, principalId);
	}

	public Player 선수수정화면데이터가져오기(Integer id) {
		Player player = playerDao.findById(id);
//		if(player == null) {
//		throw new MyException(id + "의 선수목록을 찾을 수 없습니다.");
//		}

		return null;
	}

	public void 선수수정하기(Integer id, UpdateDto updateDto) {
		Player playerPS = playerDao.findById(id);

//		if(playerPS == null) {
//			throw new RuntimeException();
//}
		playerPS.update(updateDto);
		playerDao.update(playerPS);

	}

	public void 선수삭제하기(Integer id) {
		Player playerPS = playerDao.findById(id);
		if (playerPS == null) {
		}
		playerDao.delete(id);
	}

	public void insert(PlayerReqDto playerReqDto) {
		Player player = playerReqDto.toEntity(null);
		playerDao.insert(player);
	}

//	public void insert(PlayerReqDto playerReqDto) {
//		playerDao.insert(playerReqDto.toEntity());
//	}



}
