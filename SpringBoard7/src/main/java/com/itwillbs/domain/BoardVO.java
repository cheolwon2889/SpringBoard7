package com.itwillbs.domain;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class BoardVO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private int wiewcnt;
	private Timestamp regdate;
	
}
