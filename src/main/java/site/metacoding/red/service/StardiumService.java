package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.stardium.StarDium;
import site.metacoding.red.domain.stardium.StarDiumDao;
import site.metacoding.red.web.dto.request.stardium.StarDiumReqDto;
import site.metacoding.red.web.dto.request.stardium.UpdateDto;


@RequiredArgsConstructor
@Service
public class StardiumService {
	private final StarDiumDao starDiumDao;
	
//	public List<StarDium> 야구장목록보기(Integer id, Integer principalId) {
//		return starDiumDao.findAll(id, principalId);
//	}
//
//	public StarDium 야구장상세보기(Integer id, Integer principalId) {
//		return starDiumDao.findByDetail(id, principalId);
//	}

	public StarDium 야구장수정화면데이터가져오기(Integer id) {
		StarDium starDium = starDiumDao.findById(id);
//		if(player == null) {
//		throw new MyException(id + "의 선수목록을 찾을 수 없습니다.");
//		}

		return null;
	}

//	public void 야구장수정하기(Integer id,UpdateDto updateDto) {
//		StarDium StarDiumPS = starDiumDao.findById(id);
//
////		if(playerPS == null) {
////			throw new RuntimeException();
////}
//		StarDiumPS.update(updateDto);
//		starDiumDao.update(StarDiumPS);
//
//	}

	public void 야구장삭제하기(Integer id) {
		StarDium starDiumPS = starDiumDao.findById(id);
		if (starDiumPS == null) {
		}
		starDiumDao.delete(id);
	}

//	public void 야구장추가(StarDiumReqDto StarDiumReqDto, Player principal) {
//		starDiumDao.insert(StarDiumReqDto.toEntity(principal.getId()));
//	}

}
