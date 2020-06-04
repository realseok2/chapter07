package echo_TS;

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

	// Server와 Client간의 채팅 프로그램 코드입니다.

	public static void main(String[] args) throws IOException {

		// ServerSocket 객체 생성-------------------------------------------------1번
		ServerSocket serverSocket = new ServerSocket();

		// bind 연결-----------------------------------------------------------------2번
		// InetSocketAddress에는 "" 안에 아이피 주소를 넣고 뒤에 포트번호를 넣습니다.
		serverSocket.bind(new InetSocketAddress("192.168.0.121", 10001));

		// serverSocket.accept()를 통하여 클라이언트와의 연결을 허용합니다.----5번
		System.out.println("<서버시작>");
		System.out.println("================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		Socket socket = serverSocket.accept();

		System.out.println("[클라이언트와 연결되었습니다.]");

		// server가 메세지 수신 Stream------------------------------------------7번
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		// server가 메세지 발신 Stream------------------------------------------8번
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		// server의 메세지 수신 발신 반복문
		while (true) {

			// server가 메세지 수신
			// 코드를 간단하게 작성하기 위해서 msg에 br.readLine()을 담아줍니다.
			String msg = br.readLine();
			System.out.println("받은 메세지 : " + msg);

			// msg가 null값을 받으면 break합니다.
			if (msg == null) {
				System.out.println("클라이언트 접속 종료");
				break;
			}

			// server가 메세지 발신
			// br.write(msg)를 통하여 메세지를 작성합니다.
			// br.newLine()을 통하여 새로운 줄로 이동합니다.
			// br.flush()를 통하여 강제로 푸쉬합니다.
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
