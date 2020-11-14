import java.util.Scanner;

public class ej6 implements Runnable {
	private boolean elem;
	
	public ej6(boolean elem) {
		this.elem = elem;
	}
	

	public boolean isElem() {
		return elem;
	}


	public void setElem(boolean elem) {
		this.elem = elem;
	}

	@Override
	public void run() {
		 if(elem) {
		for (int i=1;i<101;i++) {
			if(i%2==0) {
			System.out.println(i);
	         
	         
	      
			}
		}	
			
		}else{
			char array[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
			for(int i=0;i<26;i++) {
				System.out.println(array[i]);
			}
		    }
		 }

	@Override
	public String toString() {
		return "ej6 [elem=" + elem + "]";
	}


	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("di verdadero mostrará los números pares comprendidos entre\r\n" + 
				"el 1 y el 100, inclusive o Falso mostrará el abecedario español sin la letra ñ");
    	boolean elem=teclado.hasNext();
    ej6 e1=new ej6(elem);
    Thread t1 = new Thread(e1);
    
    t1.start();
	}


	}


