package site.metacoding.red.web.dto.request.explusion;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateDto {
	private Integer id;
	private String playername;
	private String reason;
}
