package Socket3;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPServer {
	final static int PUERTO = 5000;

	public static void main(String[] args) {
		byte[] buffer = new byte[1024];
		System.out.println("Arrancando servidor");
		DatagramSocket datagramSocket=null;

		try {
			InetSocketAddress addr=new InetSocketAddress("localhost",5555);
			datagramSocket=new DatagramSocket(addr);
			/*
			System.out.println("Inicializado servidor UDP");
			// Creamos el socket
			DatagramSocket socketUDP = new DatagramSocket(PUERTO);*/
			String mensaje;
			while (datagramSocket !=null) {

				// Creamos el contenedor del mensaje que vamos a recibir, UDP
				DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
				// Recibimos el mensaje
				datagramSocket.receive(peticion);
				System.out.println("Recibimos la petición del cliente");
				mensaje = new String(peticion.getData());

				int num=Integer.parseInt(mensaje.trim());
				
				int resultado=(int)Math.pow(num, 2);
				
				System.out.println(resultado);
				// Obtenemos los datos de la persona que nos ha mandado el paquete
			
				mensaje = String.valueOf(resultado);
				buffer = mensaje.getBytes();
				// Le enviamos una respuesta
				DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length,peticion.getAddress(),peticion.getPort());

				System.out.println("Enviamos información al cliente");
				datagramSocket.send(respuesta);

				System.out.println("Finalizado servidor UDP");

			}
			datagramSocket.close();
			// Cerramos el socket
			// socketUDP.close();
			// Estamos en un bucle infinito...
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
