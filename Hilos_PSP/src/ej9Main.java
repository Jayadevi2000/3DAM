
public class ej9Main extends Thread {

	public static void main(String[] args) {
		int []notas= {1,2,3,4,5,6,7};
		ej9 e1=new ej9(notas,"Juan");
		Thread t1 = new Thread(e1);
	    
	    t1.start();	}

}
