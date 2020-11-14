import java.util.Arrays;

public class ej9 implements Runnable{
	private int[]notas;
	private String nombre;
	public ej9(int[] notas, String nombre) {
		this.notas = notas;
		this.nombre = nombre;
	}
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "ej9 [notas=" + Arrays.toString(notas) + ", nombre=" + nombre + "]";
	}
	@Override
	public void run() {
		double promedio;
		for (int i=0;i<notas.length;i++) {
			System.out.println(notas[i]);	
		}
		
	}
	
}
