package me.shaojie.blog.resource;

import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

public class BlogResource extends ServerResource {
	@Override
	protected Representation post(Representation entity) throws ResourceException {
		// TODO Auto-generated method stub
		return super.post(entity);
	}
	
	@Override
	protected Representation get() throws ResourceException {
		// TODO Auto-generated method stub
		return new JacksonRepresentation<Integer>(1);
	}
}
