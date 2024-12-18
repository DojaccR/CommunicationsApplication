/*
	This is the server.
*/

package server;

import java.net.*;
import java.io.*;

class Server{
	private static ServerSocket serverSocket;
	private static Socket[] clients;
	private static int clientCounter = 0;
	public static final int port = 4555;

	public static void main(String args[]){
		try{
			serverSocket = new ServerSocket(port);
		}catch(IOException e){
			System.out.println("Could not start server");
		}

		while(true){
			try{
				cliets[clientCounter] = serverSocket.accept();
				clientCounter++;
			}catch(IOException e){
				System.out.println("Could not connect client " + clientCounter);
			}
			new Client(client[clientCounter - 1]).start();	
		}
	}
}
