package A5;

import java.net.*;

//Demostrate URL CLASS

class URLDEMOA5 {

	public static void main(String[] args) throws MalformedURLException 
	{
		//create object of URL class
		URL ur= new URL("https://www.google.com/search?q=online+compiler+in+cpp&rlz=1C1CHBD_enIN875IN878&oq=&aqs=chrome.1.69i59i450l7.1044025967j0j7&sourceid=chrome&ie=UTF-8");
		
		System.out.print("Protocol is: "+ur.getProtocol());
		System.out.print("Host Name: "+ur.getHost());
		System.out.print("Port Name: "+ur.getPort());
		System.out.print("Path is: "+ur.getPath());
		

	}

}
