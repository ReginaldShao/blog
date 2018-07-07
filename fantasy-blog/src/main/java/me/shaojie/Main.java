package me.shaojie;

import java.util.List;

import org.restlet.Client;
import org.restlet.data.Protocol;
import org.restlet.engine.Engine;
import org.restlet.engine.connector.ConnectorHelper;
import org.restlet.representation.Representation;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

public class Main extends ServerResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ConnectorHelper<Client>> clients = Engine.getInstance().getRegisteredClients();
		System.out.println("Connectors - "+clients.size());
		for(ConnectorHelper<Client> connectorHelper : clients) {   
		    System.out.println("connector = "+connectorHelper.getClass());
		}
		try {
			new org.restlet.Server(Protocol.HTTP, 8080,Main.class).start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected Representation get() throws ResourceException {
		// TODO Auto-generated method stub
		return super.get();
	}

}
