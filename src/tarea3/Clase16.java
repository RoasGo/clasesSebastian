package tarea3;

import java.util.Scanner;

public class Clase16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		while( numero > 0 ) {
			System.out.println(cuadrado_dos_numeros(numero));
			numero = scanner.nextInt();
		}
		
	}
	
	/*
	 * 1. Leer un n�mero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un n�mero
			negativo.
	 * 2. Leer un n�mero e indicar si es positivo o negativo. El proceso se repetir� hasta que se introduzca
		  un 0.
	 * 3. Leer un numero e indicar si es par o impar. El proceso se repetir� hasta que ingresen 5 numeros.
	 * 4. Realizar un juego para adivinar un n�mero. Para ello pedir un n�mero N, y luego ir pidiendo
		  n�meros indicando �mayor� o �menor� seg�n sea mayor o menor con respecto a N. El proceso termina
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
	 * 1. Leer un numero y decir si es divisible entre 5. El proceso se repetir� hasta que se ingrese un numero negativo.
	 * 2. Leer un numero y decir si es mayor o menor a 40. El proceso se repetir� solo 4 veces.
	 * 3. Escribir todos los operadores que hay en Java. Significado y ejemplos.
	 * 4. Pedir n�meros hasta que se teclee uno negativo, y mostrar cu�ntos n�meros se han introducido.
	 * 
	 */
	
}
