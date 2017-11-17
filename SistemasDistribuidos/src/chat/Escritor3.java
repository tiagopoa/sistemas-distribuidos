package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Escritor3 {

    public static void main(String[] args) {
        Socket socketCliente = null;
Boolean onLine = true;
        
        while (onLine == true) {
        try {
            socketCliente = new Socket("localhost", 6789);
            System.out.println("Conectado ao Servidor!");
            DataInputStream dis = new DataInputStream(
                    socketCliente.getInputStream());
            DataOutputStream dos = new DataOutputStream(
                    socketCliente.getOutputStream());
            
            String nome = JOptionPane.showInputDialog("Nome: ");
            dos.writeUTF(nome);
            System.out.println("Enviando "+nome);
            
            String mensagem = dis.readUTF();
            System.out.println("Mensagem recebida: "+mensagem);
            JOptionPane.showMessageDialog(null, mensagem);
            
            while (onLine == true) {
                
            String msg = JOptionPane.showInputDialog("Mensagem: ");
            dos.writeUTF(msg);
            System.out.println("Enviando "+msg);
            
            String msgback = dis.readUTF();
            System.out.println("Mensagem recebida: "+msgback);
            //JOptionPane.showMessageDialog(null, msg);
            
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Escritor3.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                if(socketCliente != null)
                    socketCliente.close();
            } catch (IOException ex) {
                Logger.getLogger(Escritor3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }
}
