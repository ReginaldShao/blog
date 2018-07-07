package me.shaojie.blog.app;

import org.restlet.Context;

import me.shaojie.blog.resource.BlogCommentEleResource;
import me.shaojie.blog.resource.BlogCommentResource;
import me.shaojie.blog.resource.BlogEleResource;
import me.shaojie.blog.resource.BlogResource;
import me.shaojie.frame.RestApplication;

public class BlogApplicaiton extends RestApplication {
	
	public BlogApplicaiton(Context context) {
		super(context);
	}

	protected void attach() {
		this.router.attach("", BlogResource.class);
		this.router.attach("/{blog_id}", BlogEleResource.class);
		this.router.attach("/{blog_id}/comment", BlogCommentResource.class);
		this.router.attach("/{blog_id}/comment/{cmt_id}", BlogCommentEleResource.class);
	}
}
