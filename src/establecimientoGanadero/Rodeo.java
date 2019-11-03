package establecimientoGanadero;

import java.util.ArrayList;

public class Rodeo extends GrupoAnimal{
	
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public int getCantAnimales() {
		return animales.size();
	}
	
	public double getPromEdad() {
		int prom=0;
		for(Animal i : animales) {
			prom+=i.getEdad();
		}
		prom=prom/animales.size();
		return prom;
	}
	public int getPesoTotal() {
		int cont=0;
		for (Animal i : animales) {
			cont+=i.getEdad();
		}
		return cont;
	}
	
	public double getPromPeso() {
		int prom=0;
		for(Animal i : animales) {
			prom+=i.getPeso();
		}
		prom=prom/animales.size();
		return prom;
	}
	
	public void deletAnimal(Animal animal) {
		animales.remove(animal);
	}
}
