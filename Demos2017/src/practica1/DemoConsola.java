package practica1;

/**
 * DemoConsola.java
 * Programa que pide nombre, apellidos y edad mostrándolos después.
 * Utiliza un objeto Console.
 * ajp - 2017.09.22
 */

import java.io.Console;

public class DemoConsola {

	public static void main(String[] args) {

		Console consola; 			// E/S de texto.

		String nombre = "";
		String apellidos = "";
		int edad;

		// Conecta con la consola del sistema.
		consola = System.console();

		if (consola != null) {

			// Lee líneas de texto desde teclado
			consola.printf("%s", "Escribe tu nombre: ");
			nombre = consola.readLine();

			consola.printf("%s","Escribe tus apellidos: ");
			apellidos = consola.readLine();

			// Lee texto y lo convierte en entero
			consola.printf("%s","Escribe tu edad: ");
			edad = Integer.parseInt(consola.readLine());

			// Muestra texto leido
			consola.printf("%s","Tu nombre es: " + nombre);
			consola.printf("%s","Tus apellidos es: " + apellidos);
			consola.printf("%s","Tu edad es: " + edad);
		}
	}
}