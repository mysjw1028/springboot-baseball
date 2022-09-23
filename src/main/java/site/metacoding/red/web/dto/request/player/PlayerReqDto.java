package site.metacoding.red.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.explusion.Explusion;
import site.metacoding.red.domain.player.Player;

@Setter
@Getter
public class PlayerReqDto {
	private Integer teamId;
	private String name;
	private String position;

	public Player toEntity(Integer playerId) {
		Player player = new Player(this.teamId, playerId, this.position,this.name);
		return player;
	}

	
}
