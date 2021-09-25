package examen.finall;

public class Auto implements Comparable<Auto> {

	private String marca;
	private String modelo;
	private String placa;
	private int kilometraje;
	private int anioFabricaion;

	public int compareTo(Auto o) {
		if (this.anioFabricaion < o.getAnioFabricaion()) {
			return -1;
		} else if (this.anioFabricaion == o.getAnioFabricaion()) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " - Modelo: " + modelo + " - Placa: " + placa + " - Kilometraje: " + kilometraje
				+ " - Fabricaion: " + anioFabricaion + "\n";
	}

	// METODOS SET Y GET
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAnioFabricaion() {
		return anioFabricaion;
	}

	public void setAnioFabricaion(int anioFabricaion) {
		this.anioFabricaion = anioFabricaion;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

}
