package site.metacoding.red.domain.player;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import site.metacoding.red.domain.team.Team;
import site.metacoding.red.web.dto.response.listDto;

public interface PlayerDao {
	public void insert(Player player );
	public Player findById(Integer id);
	public List<Player> findAll(@Param("playerId")Integer playerId, @Param("principalId") Integer principalId);
	public void update(Player player); // DTO 생각해보기
	public void delete(Integer id);
	public Player findByDetail(@Param("playerId")Integer playerId, @Param("principalId") Integer principalId);
}
