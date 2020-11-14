package Hilos;


public class Main{
public static void main(String[] args) {
		
	System.out.println("Empieza ejecucion");
	Runtime runtime = Runtime.getRuntime();
	int ncores = runtime.availableProcessors();
	System.out.println("numero de procesadores : "+ncores);
	Hilo arrayHilos[] = new Hilo[ncores];
	for(int i=0; i< arrayHilos.length; i++) {
		arrayHilos[i]= new Hilo();
		arrayHilos[i].setIdentificador(i);
		arrayHilos[i].start();
	}
	for(int i=0; i< arrayHilos.length; i++) {
		try {
		arrayHilos[i].join();
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		/*Hilo h1 = new Hilo();
		Hilo h2 = new Hilo();
		
		h1.setName("Primer hilo");
		h2.setName("Segundo hilo");
		h1.setPriority(Thread.MAX_PRIORITY);
		h2.setPriority(Thread.MIN_PRIORITY);
		
		h1.start();
		try{
			h1.join(); //interrumpe y hasta que no termine no empieza otro
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		

		h2.start();
		try{
			h2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}*/
		
		System.out.println("Termina ejecucion");
	}
}