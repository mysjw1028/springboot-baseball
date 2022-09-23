package site.metacoding.red.domain.explusion;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.web.dto.request.explusion.UpdateDto;

@NoArgsConstructor
@Setter
@Getter
public class Explusion {
	private Integer id;
	private String reason;
	private String playername;
	private Integer playerId;
	private Timestamp createDate;

	public Explusion(String reason, String playername, Integer playerId) {
		this.reason = reason;
		this.playername = playername;
		this.playerId = playerId;
	}

	public void update(UpdateDto updateDto) {
		this.id = updateDto.getId();
		this.reason = updateDto.getReason();
		this.playername = updateDto.getPlayername();
	}

}
