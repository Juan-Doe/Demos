

/**
 * PideOcho.java
 * Lee por teclado 8 números enteros y muestra su suma.
 * ajp - 2017.10.11
 */

import java.util.Scanner;
public class PideOcho {
	
	static final int CANTIDAD_DATOS = 8;

	public static void main(String[] args) {	
		
		Scanner teclado = new Scanner(System.in);
		
		int datoEntrada;
		int sumaAcumulada = 0;
		
		int contador = CANTIDAD_DATOS;
		
		while (contador >= 1) {
			System.out.print("Escribe un número: ");
			datoEntrada = teclado.nextInt();
			sumaAcumulada += datoEntrada;	
			contador--;
		}
		System.out.print("Resultado: " + sumaAcumulada);
	}

}

