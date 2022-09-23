package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.web.dto.request.player.UpdateDto;

@NoArgsConstructor
@Setter
@Getter
public class Player {
	private Integer id;
	private Integer teamid;
	private String name;
	private String POSITION;
	private Timestamp createDate;

	public Player(Integer id, Integer teamid, String name, String POSITION) {
		this.id = id;
		this.teamid = teamid;
		this.name = name;
		this.POSITION = POSITION;
	}
	public void update(UpdateDto updateDto) {
		this.id = updateDto.getId();
		this.teamid= updateDto.getTeamid();
		this.POSITION = updateDto.getPositon();
	}
}
