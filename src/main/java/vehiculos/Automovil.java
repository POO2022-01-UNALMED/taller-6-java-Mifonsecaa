package vehiculos;

public class Automovil extends Vehiculo{
	
	private int puestos;
	private static int automoviles = 0;

	public Automovil(String placa, int puertas, String nombre, int precio, float peso,
			Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		
		this.puestos = puestos;
		automoviles++;
		
	}
	
	public int getPuestos() {return puestos;}
	public void setPuestos(int puestos) {this.puestos = puestos;}
	
	public static int getAutomoviles(){return automoviles;}
	
}