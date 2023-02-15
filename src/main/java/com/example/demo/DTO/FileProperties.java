package com.example.demo.DTO;

import java.io.Serializable;

public class FileProperties implements Serializable{
	private static final long serialVersionUID = 1L;
	String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "FileProperties [fileName=" + fileName + "]";
	}
}
