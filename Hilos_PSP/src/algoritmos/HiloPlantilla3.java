package algoritmos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HiloPlantilla3 extends Thread{
	  static JPanel panel;
	  int array[];
	  
	  public HiloPlantilla3(JPanel panel, int[] array)
	  {
		        this.panel = panel;
		        this.array = array;
	  }
	//Método de ordenación
			public void run() {
				
				
				quicksort(array, 0, (array.length)-1);

			}
			void quicksort(int[] array2, int primero, int ultimo)
			{
			int i, j, central;
			double pivote;
			central = (primero + ultimo)/2;
			pivote = array2[central];
			i = primero;
			j = ultimo;
			do {
			while (array2[i] < pivote) i++;
			while (array2[j] > pivote) j--;
			if (i <= j)
			{
			int tmp;
			tmp = array2[i];
			array2[i] = array2[j];
			 ((JButton) panel.getComponent(j)).setText(Integer.toString(array2[j]));
				((JButton)panel.getComponent(j)).setBackground(Color.pink);
			array2[j] =  tmp; /* intercambia a[i] con a[j] */
			 
			i++;
			j--;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			}while (i <= j);
			if (primero < j)
			quicksort(array2, primero, j); /* mismo proceso con sublista izqda */
			if (i < ultimo)
			quicksort(array2, i, ultimo); /* mismo proceso con sublista drcha */
			
		
			
}
		
}
