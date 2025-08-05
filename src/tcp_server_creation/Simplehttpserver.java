package tcp_server_creation;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.io.IOException;
public class Simplehttpserver {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 ServerSocket server= new ServerSocket(8080);
		System.out.println("port is listening 8080");
		while(true) {
		try(Socket socket=server.accept()){
			Date today=new Date();
			String httpResponse="HTTP/1.1 200 OK\r\n\r\n"+today;
			socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
			 }
		}
	}

}
