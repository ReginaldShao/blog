package me.shaojie.frame;

import org.restlet.Application;
import org.restlet.Context;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public abstract class RestApplication extends Application{
	protected Router router;
	public RestApplication(Context context) {
		super(context);
	}
	
	@Override
	public Restlet createInboundRoot() {
		router = new Router(getContext());
		this.attach();
		return router;
	}

	protected abstract void attach();
}
