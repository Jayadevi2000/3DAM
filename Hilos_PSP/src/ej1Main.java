import java.util.Scanner;

public class ej1Main extends Thread
{
    public static void main(String[] args) {
    	Scanner teclado=new Scanner(System.in);
    	String nombre=teclado.nextLine();
    	int d�a=teclado.nextInt();
    	int hora=teclado.nextInt();

    ej1 e1=new ej1(nombre,d�a,hora);
    Thread t1 = new Thread(e1);
    
    t1.start();
    }
}
