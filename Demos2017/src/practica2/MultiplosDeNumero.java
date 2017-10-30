/**
 * MultiplosDeNumero.java
 * Muestra múltiplos de un NUMERO_BASE menores a un MULTIPLO_MAX
 * ajp - 2017.10.11
 */

public class MultiplosDeNumero {

	public static void main(String[] args) {	

		final int NUMERO_BASE = 3;
		final int MULTIPLO_MAX = 3000;
		int multiplo = NUMERO_BASE;                       

		System.out.println("Múltiplos de " + NUMERO_BASE 
				+ " menores de " + MULTIPLO_MAX + "...");

		while (true) {               	
			System.out.println(multiplo);       
			multiplo += NUMERO_BASE;
			if (multiplo <= MULTIPLO_MAX) {
				continue;
			}
			else {
				break;
			}
		}

		/*		
			while (true) {               	
			System.out.println(multiplo);       
			multiplo += NUMERO_BASE; 
			if (!(multiplo <= MULTIPLO_MAX)) {
				break;
			}
		}

		while (true) {               	
			System.out.println(multiplo);       
			multiplo += NUMERO_BASE; 
			if (multiplo > MULTIPLO_MAX) {
				break;
			}
		}

		while (multiplo <= MULTIPLO_MAX) {               	
			System.out.println(multiplo);       
			multiplo += NUMERO_BASE;                     
		}

		do {               	
			System.out.println(multiplo);       
			multiplo += NUMERO_BASE;                     
		} while (multiplo <= MULTIPLO_MAX);

		for (multiplo = NUMERO_BASE; multiplo <= MULTIPLO_MAX; 
				multiplo += NUMERO_BASE) {               	
			System.out.println(multiplo);       			                    
		}
		
		while (multiplo <= MULTIPLO_MAX) {               	
			System.out.println(multiplo);       
			multiplo += NUMERO_BASE;                     
		}

		do {               	
			System.out.println(multiplo);       
			multiplo += NUMERO_BASE;                     
		} while (multiplo <= MULTIPLO_MAX);

		for (multiplo = NUMERO_BASE; multiplo <= MULTIPLO_MAX; 
				multiplo += NUMERO_BASE) {               	
			System.out.println(multiplo);       			                    
		}

		for (; multiplo <= MULTIPLO_MAX; ) {               	
			System.out.println(multiplo);       
			multiplo += NUMERO_BASE;                     
		}

		for (; multiplo <= MULTIPLO_MAX; multiplo += NUMERO_BASE) {               	
			System.out.println(multiplo);                            
		}
		for (; multiplo <= MULTIPLO_MAX; ) {               	
			System.out.println(multiplo);       
			multiplo += NUMERO_BASE;                     
		}

		for (; multiplo <= MULTIPLO_MAX; multiplo += NUMERO_BASE) {               	
			System.out.println(multiplo);                            
		}
*/
	}
}