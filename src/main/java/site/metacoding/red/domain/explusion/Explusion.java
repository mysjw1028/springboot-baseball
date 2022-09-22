package site.metacoding.red.domain.explusion;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Explusion {
	private Integer id;
	private String reason;
	private String playername;
	private Integer playerid;
	private String name;
	private Timestamp createDate;
}
