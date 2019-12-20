package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServer {
	private ServerSocket server = null;
	private Socket s = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;

	private HTTPServer() throws IOException {

		try {
			System.out.println("HTTP Server is starting ...");
			server = new ServerSocket(80);

			while (true) {
				s = server.accept();
				System.out.println("New incoming request ....");
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));

				String request = "";
				int buffersize = 2000;
				char[] buffer = new char[buffersize];
				int amount = in.read(buffer, 0, buffersize);
				request = new String(buffer);
				request = request.substring(0, amount);

				out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

				String content = "";
				out.write("HTTP/1.1 200 OK\n");
				out.write("Server: Mein Server\n");

				if (request.contains("GET / ")) {
					System.out.println("HTTP GET request on main site");
					content += "<!DOCTYPE html>";
					content += "<html>";
					content += "<head></head>";
					content += "<body>";
					content += "<h1>Hello everybody</h1>";
					content += "</body>";
					content += "</html>";

				} else if (request.contains("GET /frank.html ")) {
					System.out.println("HTTP GET request on frank html");
					content += "<!DOCTYPE html>";
					content += "<html>";
					content += "<head></head>";
					content += "<body>";
					content += "<h1>FRANKY SITE</h1>";
					content += "</body>";
					content += "</html>";

				} else {
					content += "<!DOCTYPE html>";
					content += "<html>";
					content += "<head></head>";
					content += "<body>";
					content += "<h1>ELSE BLOCK</h1>";
					content += "</body>";
					content += "</html>";
				}
				out.write("Content-Length: " + content.getBytes().length + "\n");
				out.write("Content-Language: de\n");
				out.write("Connection: close\n");
				out.write("\n");
				out.write(content);

				out.flush();
				in.close();
				out.close();
				System.out.println("Incoming request resolved");

			}
		} finally {
			terminate();
		}
	}

	private void terminate() {
		System.out.println("Server terminated.");
		try {
			in.close();
		} catch (Exception e) {
		}
		try {
			out.close();
		} catch (Exception e) {
		}
		try {
			server.close();
		} catch (IOException e) {
		}
	}
	
	public static void main(String[] args) throws IOException {
		new HTTPServer();
	}
}
