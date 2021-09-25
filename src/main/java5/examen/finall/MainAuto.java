package examen.finall;

import java.util.Scanner;

public class MainAuto {

	public static void main(String[] args) {

		Auto auto = new Auto();
		Scanner leeInt = new Scanner(System.in);
		Scanner lee = new Scanner(System.in);
		int opcion;
		char opcionAuto;
		do {
			System.out.println("CONCESIONARIA AMBACAR, elija una opcion");
			System.out.println("1.  Ingrese Auto");
			System.out.println("2.  Consultar Auto");
			System.out.println("3.  Actualizar kilometraje");
			System.out.println("4.  Imprimir reporte");
			System.out.println("5.  SALIR");
			opcion = leeInt.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Escoja tipo de auto");
				System.out.println("a)  Auto nacional");
				System.out.println("b)  Aunto importado");
				opcionAuto = lee.next().charAt(0);

				if (opcionAuto == 'a' ) {
					System.out.println("Marca: ");
					auto.setMarca(lee.next());
					System.out.println("Modelo: ");
					auto.setModelo(lee.next());
					System.out.println("Año fabricacion: ");
					auto.setAnioFabricaion(leeInt.nextInt());
					System.out.println("Placa: ");
					auto.setPlaca(lee.next());
					System.out.println("Kilometraje: ");
					auto.setKilometraje(leeInt.nextInt());
					System.out.println("Codigo nacional: ");
				}else {
					
					System.out.println("Marca: ");
					auto.setMarca(lee.next());
					System.out.println("Modelo: ");
					auto.setModelo(lee.next());
					System.out.println("Año fabricacion: ");
					auto.setAnioFabricaion(leeInt.nextInt());
					System.out.println("Placa: ");
					auto.setPlaca(lee.next());
					System.out.println("Kilometraje: ");
					auto.setKilometraje(leeInt.nextInt());	
				}
			}
		} while (opcion != 5);

	}

}
