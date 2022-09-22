package site.metacoding.red.web.dto.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class listDto {
	private String stardiumname;//야구장 이름
	private Integer stardiumbulid;//야구장 개장일 
	private String teamname;// 팀 이름
	private Integer teambulid;//팀 창설일
	private String playername;//선수이름
	private String playerposition;//선수 포지션
	private String playereason;//퇴출사유
	private String playerasonname;//퇴출선수 이름
}
