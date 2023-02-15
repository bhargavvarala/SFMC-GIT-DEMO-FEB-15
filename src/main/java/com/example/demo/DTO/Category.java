package com.example.demo.DTO;

import java.io.Serializable;

public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + "]";
	}
}
