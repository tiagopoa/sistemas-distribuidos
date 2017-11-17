import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JOptionPane;

public class UDPClient{
    public static void main(String args[]){ 
	// args give message contents and server hostname
	DatagramSocket aSocket = null;
	  try {
		aSocket = new DatagramSocket(); 
		String mensagem = JOptionPane.showInputDialog("Mensagem:");
				
		byte [] m = mensagem.getBytes();
		InetAddress aHost = InetAddress.getByName("localhost");
		int serverPort = 6789;		                                                 
		DatagramPacket request = new DatagramPacket(m,  mensagem.length(), aHost, serverPort);
		aSocket.send(request);			                        
		byte[] buffer = new byte[1000];
		DatagramPacket reply = new DatagramPacket(buffer, buffer.length);	
		aSocket.receive(reply);
		System.out.println("Reply: " + new String(reply.getData()));	
	  }catch (SocketException e){System.out.println("Socket: " + e.getMessage());
	  }catch (IOException e){System.out.println("IO: " + e.getMessage());
	}finally {if(aSocket != null) aSocket.close();}
   } 
}
