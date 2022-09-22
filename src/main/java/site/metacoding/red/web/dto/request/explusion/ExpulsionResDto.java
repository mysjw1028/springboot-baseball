package site.metacoding.red.web.dto.request.explusion;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExpulsionResDto {
	private String reason;
	private String playername;
	private Integer playerId;
	private String name;
}
