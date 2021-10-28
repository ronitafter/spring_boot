package com.ronit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MySingleton {
	private int id = (int) (Math.random() * 10001);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "MySingleton [id=" + id + "]";
	}

	
}
