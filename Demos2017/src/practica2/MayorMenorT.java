import java.util.Scanner;

public class MayorMenorT {

	

	public static void main(String[] args) {
		 
		final int MIN_DATOS_VALIDOS = 2;
		 
		Scanner teclado = new Scanner(System.in);

		int contadorDatosValidos = 0;	
		int elMayor = 1;
		int elMenor = Integer.MAX_VALUE;
		boolean noFinPrograma = true;

		do {
			System.out.println("Teclea dato");
			int datoEntrada = teclado.nextInt();

			if (datoEntrada == 0) {
				if (contadorDatosValidos >= MIN_DATOS_VALIDOS) {
					System.out.println("Pulsa la tecla T para salir");
					String tecla = new Scanner(System.in).nextLine();

					if (tecla.equalsIgnoreCase("T")) {
						noFinPrograma = false;
					}
				}
				else {
					System.out.println("Error: hacen falta dos datos válidos como mínimo...");
				}
			}

			if (datoEntrada > 0) {
				if (datoEntrada > elMayor) {
					elMayor = datoEntrada;
				}

				if (datoEntrada < elMenor) {
					elMenor = datoEntrada;
				}
				contadorDatosValidos++;
			}

			if (datoEntrada < 0) {
				System.out.println("Error: El dato debe ser positivo");
			}

		} while (noFinPrograma);


		System.out.println("Resultados: ");
		System.out.println("el mayor " + elMayor);
		System.out.println("el menos " + elMenor);
		System.out.println("el contador " + contadorDatosValidos);
	}

}
