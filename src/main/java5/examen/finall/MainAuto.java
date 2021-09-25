package examen.finall;

import java.util.Arrays;
import java.util.Scanner;

import proyecto.finall.biblioteca.Libro;

public class MainAuto {

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
					for (int j = 5000; j <= 10000; j++) {
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
						baseAmbacar[j] = AutoN;

					}
				}
			case 2:
				System.out.println("Ingrese numero de placa del auto del auto: ");
				String numeroPlaca = lee.next();

				boolean resultado = false;

				for (int i = 0; i < 10000; i++) {

					Auto busqueda = baseAmbacar[i];
					String placaBuscar = busqueda.getPlaca();
					boolean resultadoLocal = numeroPlaca.equals(placaBuscar);
					;

					if (resultadoLocal == true || resultadoLocal2 == true) {
						resultado = true;
					}

				}
				if (resultado == true) {

					String lista = Arrays.toString(baseDatosLibro);
					System.out.println("LIBROS: ");
					System.out.println(lista);

				} else {

				}
			}
		} while (opcion != 5);

	}

}
