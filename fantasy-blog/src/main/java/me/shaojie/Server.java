package me.shaojie;

import org.restlet.Component;
import org.restlet.data.Protocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.shaojie.blog.app.BlogApplicaiton;

public class Server {
    public static void main( String[] args ) {
    	Logger logger = LoggerFactory.getLogger("app");
    	Component cmp = new Component();
    	cmp.getServers().add(Protocol.HTTP, 8182);
    	cmp.getDefaultHost().attach("/blog",new BlogApplicaiton(cmp.getContext()));
    	try {
			cmp.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	logger.debug("start success");
    }
}
