
public class ej2 {



	  public static void main(String[] args) throws InterruptedException {
			long inicio = System.currentTimeMillis();

	        
			for (int i=1;i<122;i++) {
				if(i%2!=0) {
				System.out.println(i);
		         
		        Thread.sleep(1000);
		         
		      
				}
			}
			  long fin = System.currentTimeMillis();
	        double tiempo = (double) ((fin - inicio)/1000);

	        System.out.println(tiempo +" segundos");

		}
	}

