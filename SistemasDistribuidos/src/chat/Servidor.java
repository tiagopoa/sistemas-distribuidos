package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Servidor {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket listenSocket = null;

        
        Boolean onLine = true;
        
        
        try {        	
            serverSocket = new ServerSocket(6789);
            System.out.println("Aguardando conexao...");
            listenSocket = serverSocket.accept();
            System.out.println("Cliente conectado!!");
            DataInputStream dis1 = new DataInputStream(
                    listenSocket.getInputStream());
            DataOutputStream dos1 = new DataOutputStream(
                    listenSocket.getOutputStream());
            
            serverSocket = new ServerSocket(6790);
            System.out.println("Aguardando conexao...");
            listenSocket = serverSocket.accept();
            System.out.println("Cliente conectado!!");
            DataInputStream dis2 = new DataInputStream(
                    listenSocket.getInputStream());
            DataOutputStream dos2 = new DataOutputStream(
                    listenSocket.getOutputStream());
            
            serverSocket = new ServerSocket(6791);
            System.out.println("Aguardando conexao...");
            listenSocket = serverSocket.accept();
            System.out.println("Cliente conectado!!");
            DataInputStream dis3 = new DataInputStream(
                    listenSocket.getInputStream());
            DataOutputStream dos3 = new DataOutputStream(
                    listenSocket.getOutputStream());
            
        	
            
            while(onLine){
            String msg1 = dis1.readUTF();
            System.out.println(msg1);
            
            String msg2 = dis2.readUTF();
            System.out.println(msg2);
            
            String msg3 = dis3.readUTF();
            System.out.println(msg3);
            }
            
            
            	//dos.writeUTF(dis.readUTF());
            
            
        
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(listenSocket != null){
                try {
                    listenSocket.close();
                    serverSocket.close();
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    }

