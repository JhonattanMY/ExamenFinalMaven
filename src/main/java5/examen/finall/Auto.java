package examen.finall;

public  class Auto {

	private String marca;
	private String modelo;
	private String placa;
	private int kilometraje;
	private int anioFabricaion;

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
