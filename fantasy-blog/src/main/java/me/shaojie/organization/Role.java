package me.shaojie.organization;

import java.util.List;

public class Role {
	private int id;
	private String name;
	private List<Role> parents;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Role> getParents() {
		return parents;
	}
	public void setParents(List<Role> parents) {
		this.parents = parents;
	}
}
