

import java.util.Scanner;

public class AcumulaOcho {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pide los datos por teclado
		System.out.print("Escribe 8 números separados por espacio: ");
		String textoEntrada = teclado.nextLine();
		int acumulador = 0;
		
		for (int i = 1; i <= 8; i++) {
			acumulador += new Scanner(textoEntrada).nextInt();
		}
		System.out.println("El valor acumulado es: " + acumulador);

	}

}
