package org.dxc.ioc.Junit_Test;

import java.util.Scanner;

import org.dxc.ioc.model.Client;
import org.dxc.ioc.service.LoginService;

/**
 * Hello world!
 *
 */
public class App 
{
   
	public static void main( String[] args )
    {
       Scanner s=new Scanner(System.in);
       Client client=new Client();
       System.out.println("enter the username");
       client.setUserName(s.nextLine());
       System.out.println("enter the password");
       client.setPassword(s.nextLine());
      LoginService login=new LoginService();
      
      boolean result=login.validateClient(client);
      
      if(result)
    	  System.out.println("username and password are correct");
      else
    	  System.out.println("username and password are wrong");
      
      
       
    }
}
