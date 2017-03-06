package Server;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketMain {
    public static void main(String[] args) throws IOException{
        ServerSocket server = new ServerSocket(8081);
        Socket socket = server.accept();

        socket.close();
        server.close();

    }
}