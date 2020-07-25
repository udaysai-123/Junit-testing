package org.dxc.ioc.service;

import org.dxc.ioc.model.Client;

public class LoginService {
	public boolean validateClient(Client client) {
		if(client.getUserName().equals(client.getPassword()))
          return true;
          return false;
		
	}

}
