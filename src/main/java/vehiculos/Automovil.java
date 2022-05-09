package vehiculos;

public class Automovil extends Vehiculo{
	
	private int puertas;
	private static int automoviles = 0;

	public Automovil(String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso,
			String traccion, Fabricante fabricante) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		
		this.puertas = puertas;
		automoviles++;
		
	}
	
	public int getPuertas() {return puertas;}
	public void setPuertas(int puertas) {this.puertas = puertas;}
	
	public static int getCantidadAutomovil(){return automoviles;}
	
}