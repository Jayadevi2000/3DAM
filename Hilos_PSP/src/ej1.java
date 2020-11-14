
public class ej1 implements Runnable{
	private String nombre;
	private int día;
	private int hora;
	
	public ej1(String nombre, int día, int hora) {
		super();
		this.nombre = nombre;
		this.día = día;
		this.hora = hora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDía() {
		return día;
	}
	public void setDía(int día) {
		this.día = día;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		return "ej1Main [nombre=" + nombre + ", día=" + día + ", hora=" + hora + "]";
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
