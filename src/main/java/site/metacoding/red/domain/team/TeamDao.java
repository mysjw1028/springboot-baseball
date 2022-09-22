package site.metacoding.red.domain.team;

import java.util.List;

public interface TeamDao {
	public void insert(); // DTO 생각해보기
	public Team findByIdTeam(Integer id);
	public List<Team> findAllStarDiums();
	public void update(Team team); // DTO 생각해보기
	public void delete(Integer id);
}
