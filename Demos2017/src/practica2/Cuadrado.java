import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		int tamaño;
		String lineaCompleta = "";
		String lineaHueca = "";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe tamaño del cuadrado: ");
		tamaño = teclado.nextInt();
		
		for (int i = 0; i < tamaño ; i++) {
			lineaCompleta += "* ";
		}
		
		lineaHueca += "*";
		for (int i = 0; i < tamaño-2 ; i++) {
			lineaHueca += "  ";
		}
		lineaHueca += " *";
		
		System.out.println(lineaCompleta);
		for (int i=0; i < tamaño-2; i++) {
			System.out.println(lineaHueca);
		}
		System.out.println(lineaCompleta);

	}

}
