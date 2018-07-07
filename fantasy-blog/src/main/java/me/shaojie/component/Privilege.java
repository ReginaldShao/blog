package me.shaojie.component;

public class Privilege {
	private int id;
	private Resource resource;
	private int mask;
	private int inheritMask;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public int getMask() {
		return mask;
	}
	public void setMask(int mask) {
		this.mask = mask;
	}
	public int getInheritMask() {
		return inheritMask;
	}
	public void setInheritMask(int inheritMask) {
		this.inheritMask = inheritMask;
	}
}
