/**
 * AcumulaNFor.java
 * Programa que pide serie de números enteros
 * por teclado, los suma y muestra el resultado.
 * Utiliza el valor cero para terminar la entrada de datos.
 * ajp - 2017.10.23
 */

import java.util.Scanner;

public class AcumulaNFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int sumaAcumulada = 0;
		int valorEntrada;

		System.out.println("Escribe números para sumar, con cero termina. ");
		System.out.print("Escribe un número: ");
		valorEntrada = teclado.nextInt()	;
		
		// El campo de inicialización y actualización del bucle for son opcionales.
		for (; valorEntrada != 0; ) {
			System.out.print("Escribe un número: ");
			valorEntrada = teclado.nextInt();
			sumaAcumulada += valorEntrada;
		} 

		System.out.println("Suma acumulada...." + sumaAcumulada) ;
	}

}
