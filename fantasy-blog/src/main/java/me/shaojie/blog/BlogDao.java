package me.shaojie.blog;

import me.shaojie.frame.PagingResult;

public interface BlogDao {
	int insertBlog(int group,Blog blog);
	void updateBlog(int id,Blog blog);
	void delete(int id);
	Blog getBlogById(int id);
	PagingResult<Blog> getBlogs(int group,int begin,int step);
}
