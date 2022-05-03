package A5;

import java.io.*;
import java.net.*;

public class ServerA5 {

	public static void main(String[] args) throws IOException {

		ServerSocket ss=new ServerSocket(7777);//1.Need to create Server Ready 
		System.out.println("Server Ready...");
		
		Socket s=ss.accept();//2.invoke accept method
		System.out.println("Connection Ready...");
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=(String)dis.readUTF();//to read msg
		System.out.println("Message from Client is: "+str);
		//Client2
		
		dis.close();
		s.close();
		ss.close();
	}

}
