package site.metacoding.red.web.dto.request.explusion;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.explusion.Explusion;

@Setter
@Getter
public class ExpulsionResDto {
	private String reason;
	private String playername;
	private Integer playerId;
	private String name;

	public Explusion toEntity(Integer playerId) {
		Explusion expulsion = new Explusion(this.reason, this.playername, this.playerId);
		return expulsion;
	}
}
