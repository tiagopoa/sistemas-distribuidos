/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Client {
    public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.err.println("Usage: java EchoClient <host name> <port Number>");
			System.exit(1);
		}
        String hostName = "localhost";//args[0];
        int portNumber = 7896;//Integer.parseInt(args[1]);
        
        try (Socket echoSocket  = new Socket(hostName, portNumber);
        DataOutputStream out = new DataOutputStream(echoSocket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {
        String userInput;
        while ((userInput = stdIn.readLine()) != null){
            out.writeUTF(userInput);            
        }

        
        }catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);            
        }catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " + hostName);
            System.exit(1);
        }
    }
    
}