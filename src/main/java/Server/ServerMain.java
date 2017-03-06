package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain{
    public static void main(String[] args)throws IOException{
        ServerSocket server = new ServerSocket(8081);
        Socket socket = server.accept();

        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream((socket.getOutputStream()));


    }
}