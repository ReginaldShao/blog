package me.shaojie.blog;

import java.util.List;

import me.shaojie.organization.Group;

public class ArticleGroup extends Group{
	private List<Blog> blog;

	public List<Blog> getBlog() {
		return blog;
	}
	public void setBlog(List<Blog> blog) {
		this.blog = blog;
	}
}
