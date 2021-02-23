package Socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketCliente {
//cliente servidor 1 a 1 Calcular Cuadrado
	public static void main(String[] args) {
		String num;
		System.out.println("Introduzca un número enteros");
		try {
			Socket s=new Socket("localhost", 2019);
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			BufferedReader bf=new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int aux=0;
			do {
				num=teclado.readLine();
				pw.println(num);
				aux++;
			}while(aux!=1);
			System.out.println("El resultado es "+bf.readLine());
			pw.close();
			bf.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
