package me.shaojie.frame;

import java.util.LinkedList;
import java.util.List;

public class PagingResult<T> {
	private List<T> data = new LinkedList<T>();
	private int total;
	private int step;
	private int begin;
	
	public List<T> getData() {
		return data;
	}
	public void addData(T d) {
		this.data.add(d);
		this.step++;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getStep() {
		return step;
	}
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
}
