package establecimientoGanadero;

import java.util.Date;

public class Animal{
	private int id;
	private int edad;
	private int peso;
	private String raza;
	private String sexo; //PREGUNTAR
	private boolean capado;
	private int paridos;
	
	public Animal(int id,int edad,int peso,String raza,String sexo,boolean capado,int paridos) {
		this.id=id;
		setEdad(edad);
		setPeso(peso);
		this.raza=raza;
		this.sexo=sexo;
		this.capado=capado;
		this.paridos=0;
		setParidos(paridos);
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
	public void setCapado() {
		this.capado=true;
	}
	public void setParidos(int	paridos) {
		this.paridos=+paridos;
	}
	public int getId() {
		return this.id;
	}
	public int getEdad() {
		return this.edad;
	}
	public int getPeso() {
		return this.peso;
	}
	public String getRaza() {
		return this.raza;
	}
	public String getSexo() {
		return this.sexo;
	}
	public boolean isCapado() {
		return this.capado;
	}
	public int getParidos() {
		return this.paridos;
	}
}
