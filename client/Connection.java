package client;

import java.io.BufferedReader;

/* Simple client connection class */

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connection{
	private Socket s = null;
	private BufferedReader DIS = null;
	private DataOutputStream DOS = null;
	public Connection(String address, int port){
		try{
			s = new Socket(address, port);
			DIS = new BufferedReader(new InputStreamReader(System.in));
			DOS = new DataOutputStream(s.getOutputStream());

		}catch(UnknownHostException e){
			System.out.println("Unknown host");
		}catch(IOException e){
			System.out.println("IO Exception");
		}

		String next = "";

		while(!next.equals("terminate_")){
			try{
				next = DIS.readLine();
				DOS.writeUTF(next);
			}catch(IOException e){
				System.out.println("IO Exception");
			}
		}


		// Close connection
		
		try{
			s.close();
			DIS.close();
			DOS.close();
		}catch(IOException e){
			System.out.println("IO Exception");
		}
	}
}
