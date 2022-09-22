package site.metacoding.red.domain.stardium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StarDium {
	private Integer id;
	private String name;
	private Integer bulid;
	private Timestamp createDate;
}
