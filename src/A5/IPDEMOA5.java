package A5;

import java.io.*;
import java.net.*;

public class IPDEMOA5 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Website URL");

		String web =br.readLine();
		//IP
		InetAddress in=InetAddress.getByName(web);
		System.out.println("IP address is :"+in);
		
		//local host
		InetAddress local=InetAddress.getLocalHost();
		System.out.println("Local Machine Info :"+local);
		
		//equals
		InetAddress address1=InetAddress.getByName("103.228.50.115");
		InetAddress address2=InetAddress.getByName("www.mitaoe.ac.in");
		System.out.println("Address1 and Address 2 Comparision :"+address1.equals(address2));
		
		//getAllByName
		InetAddress address3=InetAddress.getByName(web);
		System.out.println("getAllByName result is: "+address3);
		
		
	}

}
