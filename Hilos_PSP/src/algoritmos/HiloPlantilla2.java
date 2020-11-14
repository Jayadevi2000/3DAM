package algoritmos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HiloPlantilla2 extends Thread{
	  static JPanel panel;
	  int array[];
	  int id;
	  
	  public HiloPlantilla2(JPanel panel, int[] array)
	  {
		        this.panel = panel;
		        this.array = array;
	  }
	//Método de ordenación
			public void run() {
				int i, j;
				int aux;
				for (i = 1; i < array.length; i++)
				{
				/* indice j explora la sublista a[i-1]..a[0] buscando la
				posicion correcta del elemento destino, lo asigna a a[j] */
				j = i;
				aux = array[i];
				/* se localiza el punto de inserción explorando hacia abajo */
				while (j > 0 && aux < array[j-1])
				{
				/* desplazar elementos hacia arriba para hacer espacio */
					array[j] = array[j-1];
				j--;
				}
				try {
					 ((JButton) panel.getComponent(j)).setText(Integer.toString(array[j]));
						((JButton)panel.getComponent(j)).setBackground(Color.YELLOW);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				array[j] = aux;
				
				}
				}
			
}
