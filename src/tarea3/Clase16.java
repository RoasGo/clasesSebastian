package tarea3;

import java.util.Scanner;

public class Clase16 {

	public static void main(String[] args) {
		
		/*
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		while( numero > 0 ) {
			System.out.println(cuadrado_dos_numeros(numero));
			numero = scanner.nextInt();
		}
		*/
		System.out.println("Por favor adivine el numero");
		System.out.println("Ingrese un numero entero mayor a 0");
		System.out.println(adivinar_numero(80));
	}
	
	/*
	 * 1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
			negativo.
	 * 2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
		  un 0.
	 * 3. Leer un numero e indicar si es par o impar. El proceso se repetirá hasta que ingresen 5 numeros.
	 * 4. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
		  números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
		  cuando el usuario acierta. ---> PENDIENTE
	 * 
	 */
	
	static int cuadrado_dos_numeros( int numero ) {		
		
		int cuadrado = (int) Math.pow(numero, 2);
		
		return cuadrado;
	}
	
	static void cuadrado_dos_numeros_bucle() {		
		
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		while ( numero > 0 ) { // 8 > 0 -> true
			System.out.println((int) Math.pow(numero, 2)); //cuadrado = 64
			//pedir un nuevo numero
			numero = scanner.nextInt();
		}
		
	}
	
	/*
	 * Tarea: 
	 * 1. Leer un numero y decir si es divisible entre 5. El proceso se repetirá hasta que se ingrese un numero negativo.
	 * 2. Leer un numero y decir si es mayor o menor a 40. El proceso se repetirá solo 4 veces.
	 * 3. Escribir todos los operadores que hay en Java. Significado y ejemplos.
	 * 4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
	 * 
	 */
	
	/* EJERCICIO NUMERO 4:
	 * ENTRADA: Un numero entero
	 * PROCESO: 
	 *	- Pedir un numero por consola, utilizando la clase Scanner.
	 *	- Validar el numero, si es mayor o menor al parametro.
	 *		+ Si es mayor -> Pedir que se ingrese un numero mas pequeño.
	 *		+ Si es menor -> Pedir que se ingrese un numero mas grande.
	 *		+ Contar las veces que se vuelva a ingresar un numero.
	 *	- Volver a pedir un numero hasta que sea correcto.
	 * SALIDA: String con el texto "Felicidades, acertaste el numero en 'X' intentos" 
	 * 
	 */
	
	static String adivinar_numero( int numero ) { // numero = 50
		
		Scanner scanner = new Scanner(System.in);
		int numeroIngresado = scanner.nextInt(); // numeroIngresado = 25
		int contador = 1;
		
		// Tenemos que utilizar algun tipo de BUCLE!!
		do {
			if ( numeroIngresado < numero ) {	// true
				System.out.println("Ingrese un numero mas grande...");
				numeroIngresado = scanner.nextInt();	// numeroIngresado = 30
			} else {
				System.out.println("Ingrese un numero mas pequeño...");
				numeroIngresado = scanner.nextInt();
			}
			contador++;
		} while ( numeroIngresado != numero );
		
		/*
		 	while ( numeroIngresado != numero ) ) {
	 			if ( numeroIngresado < numero ) {	// true
					System.out.println("Ingresar un numero mas grande...");
					numeroIngresado = scanner.nextInt();	// numeroIngresado = 30
				} else {
					System.out.println("Ingresar un numero mas pequeño...");
					numeroIngresado = scanner.nextInt();
				}
				contador++;
		 	}
		 */
		
		return "Felicidades, acertaste el número!" + " en " + contador + " veces :D"; 
	}
	
}
