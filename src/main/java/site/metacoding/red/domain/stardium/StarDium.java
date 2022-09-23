package site.metacoding.red.domain.stardium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.web.dto.request.stardium.UpdateDto;

@NoArgsConstructor
@Setter
@Getter
public class StarDium {
	private Integer id;
	private String name;
	private Integer bulid;
	private Timestamp createDate;

//	public StarDium(String name, Integer bulid, Integer id) {
//		this.id = id;
//		this.name = name;
//		this.bulid = bulid;
//	}
//
//	public void update(UpdateDto updateDto) {
//		this.id = updateDto.getId();
//		this.name = updateDto.getName();
//		this.bulid = updateDto.getBulid();
//	}

}
