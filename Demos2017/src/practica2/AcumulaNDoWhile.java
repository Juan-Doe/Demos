/**
 * AcumulaNv2.java
 * Programa que pide serie de números enteros
 * por teclado, los suma y muestra el resultado.
 * Utiliza el valor cero para terminar la entrada de datos.
 * ajp - 2017.10.23
 */

import java.util.Scanner;

public class AcumulaNDoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int sumaAcumulada = 0;
		int valorEntrada;

		System.out.println("Escribe números para sumar, con cero termina. ");

		do {
			System.out.print("Escribe un número: ");
			valorEntrada = teclado.nextInt();
			sumaAcumulada += valorEntrada;
		} while (valorEntrada  != 0);

		System.out.println("Suma acumulada...." + sumaAcumulada) ;
	}

}
