package site.metacoding.red.domain.player;

import java.util.List;

import site.metacoding.red.domain.team.Team;

public interface PlayerDao {
	public void insert();
	public Player findById(Integer id);
	public List<Player> findAll();
	public void update(Player player); // DTO 생각해보기
	public void delete(Integer id);
}
