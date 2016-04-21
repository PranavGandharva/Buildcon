package com.BuildCon.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class State {

	@Id
	@GeneratedValue
	private int state_id;
	
	private String State_name;

	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public String getState_name() {
		return State_name;
	}

	public void setState_name(String state_name) {
		State_name = state_name;
	}
	
	
}

