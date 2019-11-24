/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasenderudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author win10
 */
public class JavaSenderUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
 
        InetAddress ia = InetAddress.getByName("192.168.43.153");
        int Port = 2134;
        String s = "Acha Hisyam";
        byte[] b = s.getBytes();
        DatagramPacket dp = new DatagramPacket(b, b.length, ia, Port);
        DatagramSocket sender = new DatagramSocket();
        sender.send(dp);
        
        
    }
    
}
