package site.metacoding.red.domain.stardium;

import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface StarDiumDao {
	public void insert(StarDium starDium); //야구장 추가
	public StarDium findById(Integer id);//야구장 아이디 찾기
	public List<StarDium> findAll();//야구장목록보기
	public void update(StarDium stardDium); // 야구장 수정
	public void delete(Integer id);//야구장 삭제
	public StarDium findByDetail();//야구장 세세한

}
