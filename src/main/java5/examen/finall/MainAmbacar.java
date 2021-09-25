package examen.finall;

import java.util.Arrays;
import java.util.Scanner;

public class MainAmbacar {

	public static void main(String[] args) {

		Auto auto = new Auto();
		AutoNacional AutoN = new AutoNacional();
		AutoImportado AutoI = new AutoImportado();

		Scanner leeInt = new Scanner(System.in);
		Scanner lee = new Scanner(System.in);

		int opcion;
		char opcionAuto;

		Auto baseAmbacar[] = new Auto[10000];

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

				if (opcionAuto == 'a') {
					for (int i = 0; i <= 5000; i++) {
						System.out.println("Marca: ");
						AutoN.setMarca(lee.next());
						System.out.println("Modelo: ");
						AutoN.setModelo(lee.next());
						System.out.println("Año fabricacion: ");
						AutoN.setAnioFabricaion(leeInt.nextInt());
						System.out.println("Placa: ");
						AutoN.setPlaca(lee.next());
						System.out.println("Kilometraje: ");
						AutoN.setKilometraje(leeInt.nextInt());
						System.out.println("Codigo nacional: ");
						AutoN.setCodigoNacional(lee.next());
						baseAmbacar[i] = AutoN;
					}
				} else {
					for (int i = 5000; i < 10000; i++) {
						System.out.println("Marca: ");
						AutoI.setMarca(lee.next());
						System.out.println("Modelo: ");
						AutoI.setModelo(lee.next());
						System.out.println("Año fabricacion: ");
						AutoI.setAnioFabricaion(leeInt.nextInt());
						System.out.println("Placa: ");
						AutoI.setPlaca(lee.next());
						System.out.println("Kilometraje: ");
						AutoI.setKilometraje(leeInt.nextInt());
						System.out.println("Codigo importacion: ");
						AutoI.setCodigoImportacion(lee.next());
						System.out.println("Valor de importacion: ");
						AutoI.setValorImportacion(lee.next());
						baseAmbacar[i] = AutoN;

					}
				}
				break;
			case 2:
				System.out.println("Ingrese numero de placa del auto del auto: ");
				String numeroPlaca = lee.next();

				boolean resultado = false;

				for (int i = 0; i < 10000; i++) {

					Auto busqueda = baseAmbacar[i];
					String placaBuscar = busqueda.getPlaca();
					boolean resultadoLocal = numeroPlaca.equals(placaBuscar);

					if (resultadoLocal == true) {
						resultado = true;
					}

				}
				if (resultado == true) {

					String listaAutos = Arrays.toString(baseAmbacar);
					System.out.println("AUTO: ");
					System.out.println(listaAutos);

				} else {
					System.out.println("No se ha encontrado el informacion del Auto");
				}
				break;

			case 3:
				System.out.println("Ingrese numero de placa del auto del auto: ");
				String numeroPlaca2 = lee.next();

				boolean resultado2 = false;
				String placaBuscar;

				for (int i = 0; i < 10000; i++) {

					Auto busqueda = baseAmbacar[i];
					placaBuscar = busqueda.getPlaca();
					boolean resultadoLocal2 = numeroPlaca2.equals(placaBuscar);

					if (resultadoLocal2 == true) {
						resultado = true;
					}

				}
				if (resultado2 == true) {
					System.out.println("Ingrese nuevo Kilometraje: ");
					int nuevoKilometraje = leeInt.nextInt();

					auto.setKilometraje(nuevoKilometraje);

				} else {
					System.out.println("No se ha encontrado el Auto");
				}
				break;

			case 4:

				String listaAmbacar = Arrays.toString(baseAmbacar);
				System.out.println("TODOS LOS AUTOS: ");
				System.out.println(listaAmbacar);
				break;
			}

		} while (opcion != 5);

		System.out.println("GRACIAS, QUE TENGA UN BUEN DIA");

	}

}
