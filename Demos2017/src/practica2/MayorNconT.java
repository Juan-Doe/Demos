/**
 * AcumulaNFor.java
 * Programa que pide serie de números enteros
 * por teclado, los suma y muestra el resultado.
 * Utiliza el valor cero para terminar la entrada de datos.
 * ajp - 2017.10.23
 */

import java.util.Scanner;

public class MayorNconT {

	public static void main(String[] args) {
		final int MIN_CANTIDAD_DATOS = 2;
		
		Scanner teclado = new Scanner(System.in);

		boolean finalPrograma  = false;
		int contadorValidos = 0;
		int elMayor = 0;
		int elMenor = Integer.MAX_VALUE;
		
		while (!finalPrograma) {
			
			System.out.println("Dame un número...");
			int dato = teclado.nextInt();

			// Tratamiento control...
			
			if (dato == 0) {
				System.out.println("Saliendo...");
				System.out.println("Confirma: pulsa T para terrminar...");
				String tecla = new Scanner(System.in).nextLine();
				if (tecla.equalsIgnoreCase("T")) {
					finalPrograma = true;
				}
			}	
			else {
			
				// Tratamiento datos normales...
				contadorValidos++;
				if (dato > 0) {
					// Comprobar mayor.
					if (dato > elMayor ) {
						elMayor = dato;
					}
					
					// Comprobar menor.
					if (dato < elMenor ) {
						elMenor = dato;
					}
				}
				else {
					System.out.println("Dato incorrecto, no puede ser negativo...");					
				}	
			}
		
		} // while

		System.out.println("Resultados:");
		
		if (contadorValidos >= MIN_CANTIDAD_DATOS) {
			System.out.println("El mayor: " + elMayor);
			System.out.println("El menor: " + elMenor);
		}
		else {
			System.out.println("No se han introducido dato...");
		}
	}
}
