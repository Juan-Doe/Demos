
import java.util.*;

/**
 * OrdenaTres.java
 * Programa que pide tres datos de tipo entero por teclado, 
 * los guarda y los muestra ordenados por pantalla sin estructura repetitiva.
 * Adicionalmente, si se introducen ya ordenados muestra el
 * mensaje "Los datos ya estaban ordenados"
 * ajp - 2017.10.11
 */

public class OrdenaTresv2 {	
	public static void main(String argumentos[]) {	
		
		Scanner teclado = new Scanner(System.in);

		int dato1, dato2, dato3;		// para la entrada.
		int aux;								// para el intercambio.
		
		// Pide los datos por teclado.
		System.out.print("Escribe el primer número: ");
		dato1 = teclado.nextInt();

		System.out.print("Escribe el segundo número: ");
		dato2 = teclado.nextInt();

		System.out.print("Escribe el tercer número: ");
		dato3 = teclado.nextInt();

		if (dato3 < dato2) {
			// Intercambia.
			aux = dato2;		
			dato2 = dato3;
			dato3 = aux;
		}

		if (dato2 < dato1) {
			// Intercambia.
			aux = dato2;
			dato2 = dato1;
			dato1 = aux;
			
		}

		if (dato3 < dato2) {
			// Intercambia.
			aux = dato2;
			dato2 = dato3;
			dato3 = aux;
		}
		
		String mensaje = "\nLos datos ordenados son:";	
		// Muestra datos ordenados.	
		System.out.println(mensaje);
		System.out.println(dato1);
		System.out.println(dato2);
		System.out.println(dato3);
		
	}
}
