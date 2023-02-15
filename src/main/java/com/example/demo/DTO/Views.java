package com.example.demo.DTO;

import java.io.Serializable;

public class Views implements Serializable{
	private static final long serialVersionUID = 1L;
	Subjectline subjectline;
	Html html;
	
	public Html getHtml() {
		return html;
	}

	public void setHtml(Html html) {
		this.html = html;
	}

	public Subjectline getSubjectline() {
		return subjectline;
	}

	public void setSubjectline(Subjectline subjectline) {
		this.subjectline = subjectline;
	}

	@Override
	public String toString() {
		return "Views [html=" + html + "]";
	}

	
	
	
}