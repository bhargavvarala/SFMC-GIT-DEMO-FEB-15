package com.example.demo.DTO;

import java.io.Serializable;

public class Subjectline implements Serializable{
	private static final long serialVersionUID = 1L;
	String content;
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Subjectline [content=" + content + "]";
	}
	

}