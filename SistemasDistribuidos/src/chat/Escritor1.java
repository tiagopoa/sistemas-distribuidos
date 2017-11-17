package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Escritor1 {

    public static void main(String[] args) {
        Socket socketCliente = null;
Boolean onLine = true;
        
		
        try {
        	int porta = Integer.parseInt(JOptionPane.showInputDialog("Porta: "));
            socketCliente = new Socket("localhost", porta);
            System.out.println("Conectado ao Servidor!");
            DataInputStream dis = new DataInputStream(
                    socketCliente.getInputStream());
            DataOutputStream dos = new DataOutputStream(
                    socketCliente.getOutputStream());
            
            
            //String nome = JOptionPane.showInputDialog("Nome: ");
            //dos.writeUTF(nome);
            //System.out.println("Enviando "+nome);
            
            //String mensagem = dis.readUTF();
            //System.out.println("Mensagem recebida: "+mensagem);
            //JOptionPane.showMessageDialog(null, mensagem);
            
            
            while (onLine) {   
            String msg = JOptionPane.showInputDialog("Mensagem: ");
            dos.writeUTF(msg);
        	}
            //System.out.println("Enviando "+msg);
            
            //String msgback = dis.readUTF();
            //System.out.println("Mensagem recebida: "+msgback);
            //JOptionPane.showMessageDialog(null, msg);
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Escritor1.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                if(socketCliente != null)
                    socketCliente.close();
            } catch (IOException ex) {
                Logger.getLogger(Escritor1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
