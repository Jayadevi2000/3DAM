package Hilos;


public class Hilo extends Thread{
	
	private int identificador;
	private static Object obj = new Object();
	private static int contador = 0;
	public void run() {
		synchronized (obj){
			while(contador != getIdentificador()) {
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				System.out.println("se esta ejecutando el hilo: "+this.getIdentificador());
				contador ++;
				obj.notifyAll();

			
		}
	}
	
	public void method1() {
		System.out.println("se inicia el hilo +this.getid()+ con el nombre +this.getnomnbre()");
		for (int i = 0; i < 10; i++) {
			System.out.println("Se ejecuta "+this.getId()+" con nombre "+this.getName()+" vuelta numero " + (i+1));
			
			try{
				sleep(40);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println("Finaliza "+this.getId()+" de nombre "+this.getName());
		}
	}
	
	public void method2(){
		synchronized (obj){
			if (contador == getIdentificador()) {
				System.out.println("se esta eejecutando el hilo: "+this.getIdentificador());
				contador ++;
				obj.notifyAll();
				
			}else {
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public static Object getObj() {
		return obj;
	}

	public static void setObj(Object obj) {
		Hilo.obj = obj;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Hilo.contador = contador;
	}
	
}