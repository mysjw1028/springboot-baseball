package site.metacoding.red.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateDto {
	private Integer id;
	private Integer teamid;
	private String positon;
}
