package site.metacoding.red.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Team {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private Timestamp createdAt;
}
