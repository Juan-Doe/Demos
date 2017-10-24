/**
 * AcumulaNWhile.java
 * Programa que pide serie de números enteros
 * por teclado, los suma y muestra el resultado.
 * Utiliza el valor cero para terminar la entrada de datos.
 * ajp - 2017.10.23
 */

import java.util.Scanner;

public class AcumulaNWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int sumaAcumulada = 0;
		int valorEntrada;

		System.out.println("Escribe números para sumar, con cero termina. ");
		System.out.print("Escribe un número: ");
		valorEntrada = teclado.nextInt();
		
		while (valorEntrada != 0) {
			System.out.print("Escribe un número: ");
			valorEntrada = teclado.nextInt();
			sumaAcumulada += valorEntrada;
		} 

		System.out.println("Suma acumulada...." + sumaAcumulada) ;
	}

}
