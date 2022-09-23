package site.metacoding.red.web.dto.request.stardium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stardium.StarDium;

@Setter
@Getter
public class StarDiumReqDto {
	private String name;
	private Integer bulid;
	
//	public StarDium toEntity(Integer starDiumId) {
//		StarDium starDium = new StarDium(this.name, this.bulid,starDiumId);
//		return starDium;
//	}
}
