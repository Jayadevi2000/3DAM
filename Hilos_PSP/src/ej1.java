
public class ej1 implements Runnable{
	private String nombre;
	private int d�a;
	private int hora;
	
	public ej1(String nombre, int d�a, int hora) {
		super();
		this.nombre = nombre;
		this.d�a = d�a;
		this.hora = hora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getD�a() {
		return d�a;
	}
	public void setD�a(int d�a) {
		this.d�a = d�a;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		return "ej1Main [nombre=" + nombre + ", d�a=" + d�a + ", hora=" + hora + "]";
	}
	
	@Override
	public void run() {
	if(hora>8) {
		System.out.println("Llegas tarde");
	}else {
		System.out.println("Llegas temprano");
	}
	}
}
