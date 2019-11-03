package establecimientoGanadero;

public class Camion {
	public Camion(int capacidad, String raza, int pesominimo, int edadminima) {
		setCapacidad(capacidad);
		setRaza(raza);
		setPesominimo(pesominimo);
		setEdadminima(edadminima);
	}

	private int capacidad;
	private String raza;
	private int pesominimo;
	private int edadminima;
	
	

	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getPesominimo() {
		return this.pesominimo;
	}

	public void setPesominimo(int pesominimo) {
		this.pesominimo = pesominimo;
	}

	public int getEdadminima() {
		return this.edadminima;
	}

	public void setEdadminima(int edadminima) {
		this.edadminima = edadminima;
	}
	
}
