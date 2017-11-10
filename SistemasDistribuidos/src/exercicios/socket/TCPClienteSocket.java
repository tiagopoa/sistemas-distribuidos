package exercicios.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TCPClienteSocket {

    public static void main(String[] args) {
        Socket socketCliente = null;
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
            
            String valor = JOptionPane.showInputDialog("Valor: ");
            dos.writeUTF(valor);
            System.out.println("Enviando "+valor);
            
            String mensagem1 = dis.readUTF();
            System.out.println("Mensagem recebida: "+mensagem1);
            JOptionPane.showMessageDialog(null, mensagem1);
            
            
        } catch (IOException ex) {
            Logger.getLogger(TCPClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                if(socketCliente != null)
                    socketCliente.close();
            } catch (IOException ex) {
                Logger.getLogger(TCPClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
