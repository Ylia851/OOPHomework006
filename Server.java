package Server;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Server {
    public static void main(String[] args) {

    private final String WW = 'D:\JAVAHomeworks\OOPHomework005\Server\server.txt';

        try {
    ServerSocket serverSocket = new ServerSocket(808);for(;;)
    {
                try(Socket socket = ServerSocket.accept()){
                
                System.out.println("Client connected");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));

                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                }
                while (!reader.ready())

                String[] items = {"", "", ""};
                if(reader.ready()){
                    String line = reader.readLine();
                    System.out.println(line);
                    items = line.split("/");
                }
                    ;
                while (reader.ready()) {
                    System.out.println(reader.readline())
                }

                Path filePath = Path.of(WW, items[i]);
                if(Files.exists(filePath)) && (!Files.isDirectory(filePath)){
                    writer.println("HTML/1.1 200 OK");
                    writer.println("Content-Type: text/html; charset = utf-8");
                    writer.println();
                    try(Buffered br = Files.newBufferedReader(filePath)){
                        br.transferTo(writer);
                    }
                    writer.flush();
                    continue;
                }else if(Files.isDirectory(filePath)){
                    writer.println("HTML/1.1 200 OK");
                    writer.println("Content-Type: text/html; charset = utf-8");
                    writer.println();

    public boolean accept(File dir, String name) {
        String f = new File(name).getName();
        return f.indexOf(filePath) != -1;
    }}

    writer.flush();continue;}

    writer.println("HTML/1.1 200 OK");writer.println("Content-Type: text/html; charset = utf-8");writer.println();writer.println("<h1> Hello world! </h1>");writer.flush();

    }

    }catch(

    IOException e)
    {
            throw new RuntimeException(e);
        }
}

}