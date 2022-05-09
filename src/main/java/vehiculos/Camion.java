package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	private static int camiones = 0;

	public Camion(String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso,
			String traccion, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		camiones++;
		
	}
	
	public int getEjes() {return ejes;}
	public void setEjes(int ejes) {this.ejes = ejes;}
	public static int getCantidadCamiones(){return camiones;}

}
	