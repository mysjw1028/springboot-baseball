package site.metacoding.red.domain.stardium;

import java.util.List;

public interface StarDiumDao {
	public void insert(); // DTO 생각해보기
	public StarDium findByIdStarDium(Integer id);
	public List<StarDium> findAllStarDiums();
	public void update(StarDium stardDium); // DTO 생각해보기
	public void delete(Integer id);
}
