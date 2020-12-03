package com.mini.board.dto;

public class Board {
	private int boardCode;
	private String boardTitle;
	private String boardContents;
	private String writerId;
	private String writer;
	private int countView;
	private String writeDate;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int boardCode, String boardTitle, String boardContents, String writerId, String writer, int countView,
			String writeDate) {
		super();
		this.boardCode = boardCode;
		this.boardTitle = boardTitle;
		this.boardContents = boardContents;
		this.writerId = writerId;
		this.writer = writer;
		this.countView = countView;
		this.writeDate = writeDate;
	}



	public int getBoardCode() {
		return boardCode;
	}

	public void setBoardCode(int boardCode) {
		this.boardCode = boardCode;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContents() {
		return boardContents;
	}

	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getCountView() {
		return countView;
	}

	public void setCountView(int countView) {
		this.countView = countView;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	
}
