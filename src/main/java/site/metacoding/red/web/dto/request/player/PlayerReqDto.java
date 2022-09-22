package site.metacoding.red.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlayerReqDto {
	private Integer teamId;
	private String name;
	private String position;
}
