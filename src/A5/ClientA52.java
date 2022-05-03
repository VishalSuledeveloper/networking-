//package A5;
//
//import java.io.*;
//import java.net.*;
//
//public class ClientA52 {
//
//	public static void main(String[] args) throws IOException, IOException {
//		// TODO Auto-generated method stub
//
//		Socket s=new Socket("localhost",7777);
//		System.out.println("Connection ready for Client2 ...");
//		
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter message Client2: ");
//
//		String str1=br.readLine();//to read input
//		
//		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
//		
//		dout.writeUTF(str1);//to send server site
//		br.close();
//		dout.close();
//	}
//}
