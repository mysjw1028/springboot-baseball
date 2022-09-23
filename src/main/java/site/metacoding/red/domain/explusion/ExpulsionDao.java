package site.metacoding.red.domain.explusion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import site.metacoding.red.web.dto.response.listDto;

public interface ExpulsionDao {
	public void insert(Explusion expulsion);
	public Explusion findById(Integer id);
	public List<Explusion> findAll();
	public void update(Explusion explusion); // DTO 생각해보기
	public void delete(Integer id);
	public listDto findByDetail(@Param("playerId") Integer playerId, @Param("principalId") Integer principalId);
}
