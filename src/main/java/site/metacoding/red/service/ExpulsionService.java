package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.explusion.Explusion;
import site.metacoding.red.domain.explusion.ExpulsionDao;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.web.dto.request.explusion.ExpulsionResDto;
import site.metacoding.red.web.dto.request.explusion.UpdateDto;

@RequiredArgsConstructor
@Service
public class ExpulsionService {
	private final ExpulsionDao expulsionDao;

//	public ExpulsionResDto 게시글목록보기() {
//		return ExpulsionResDto;
//	}
	
	public void 퇴출사유수정하기(Integer id, UpdateDto updateDto) {
		Explusion expulsionPS = expulsionDao.findById(id);
		
		expulsionPS.update(updateDto);
		expulsionDao.update(expulsionPS);
	}
	
	
	public void 퇴출사유삭제하기(Integer id) {
		Explusion explusionPS = expulsionDao.findById(id);
		if(explusionPS == null) {
		}
		expulsionDao.delete(id);
	}

	public void 퇴출사유등록(ExpulsionResDto expulsionResDto, Player principal) {
		expulsionDao.insert(expulsionResDto.toEntity(principal.getId()));
	}
}
