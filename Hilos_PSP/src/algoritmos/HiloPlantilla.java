package algoritmos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HiloPlantilla extends Thread
{
	  static JPanel panel;
	  int A[];
	//  int id;
	  
	  public HiloPlantilla(JPanel panel, int[] array)
	  {
		        this.panel = panel;
		        this.A = array;
	  }
	//Método de ordenación
			public void run() {

				int j, k, aux;
				String pasada = "";
				for (k = 0; k < A.length; k++) 
				{
					
					for (j = 1; j < A.length; j++)
					{
						
						if (A[j] < A[j - 1]) 
						{
							aux = A[j];
							
							A[j] = A[j - 1];
							A[j - 1] = aux;
							((JButton) panel.getComponent(j-1)).setText(Integer.toString(A[j-1]));
							((JButton)panel.getComponent(j-1)).setBackground(Color.CYAN);
							
							((JButton) panel.getComponent(j)).setText(Integer.toString(A[j]));
							((JButton)panel.getComponent(j)).setBackground(Color.CYAN);
						//	System.out.println("A[j]=" + A[j] + " A[j-1]=" + A[j - 1] + " AUX=" + aux);
							
							try {
								 
									
								Thread.sleep(300);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						/*	System.out.println("Arreglo A={" + pasada + " }");
							pasada = "";*/

						}

					}
				}

			
			}
		
}
