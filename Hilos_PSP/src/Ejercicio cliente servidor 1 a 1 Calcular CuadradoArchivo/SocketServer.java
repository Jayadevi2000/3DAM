package Socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {//10.0.2.15

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket s1=new ServerSocket(2019);
			Socket cliente=s1.accept();
			PrintWriter pw=new PrintWriter(cliente.getOutputStream(),true);
			BufferedReader bf=new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			
			int num=0,aux=0;
			do {
				num=(int) Math.pow(Integer.parseInt(bf.readLine()), 2);
				aux++;
			}while(aux!=1);
			
			System.out.println("Enviando resultado "+num);
			pw.println(num);
			cliente.close();
			pw.close();
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
