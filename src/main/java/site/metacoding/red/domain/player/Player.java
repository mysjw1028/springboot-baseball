package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Player {
private Integer id;
private Integer teamid;
private String name;
private String position;
private Timestamp createDate;
}
