package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.121", 10001));

		// serverSocket.accept()를 통하여 클라이언트와의 연결을 허용합니다.
		System.out.println("<서버시작>");
		System.out.println("====================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		Socket socket = serverSocket.accept();

		System.out.println("[클라이언트가 연결되었습니다.]");

		// 서버가 메세지 받기 Stream================================================
		// 클라이언트가 보낸 메세지를 받는 용도이기 때문에 Input을 사용합니다.
		// readLine()은 한 줄 한 줄을 읽어들이는 작업을 합니다.
		// 코드를 간단하게 작성하기 위해서 str에 br.readLine()을 담아줍니다.
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		// 서버가 메세지 보내기 Stream================================================

		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		while (true) {

			// 서버가 메세지 받기
			String msg = br.readLine();
			System.out.println("받은 메세지 : " + msg);

			if (msg == null) {
				System.out.println("클라이언트 접속 종료");
				break;
			}

			// 서버가 메세지 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();

		}

		System.out.println("<서버 종료>");

		bw.close();
		br.close();
		serverSocket.close();

	}

}
