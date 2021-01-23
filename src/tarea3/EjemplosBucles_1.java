package tarea3;

import java.util.Scanner;

public class EjemplosBucles_1 {

	public static void main(String[] args) {

		/*
		 * ======== T A R E A : Hacer el ejercicio de la clase EjemploTarea con un bucle do-while. + Agregar validación en caso el numero
		 * ingresado de fibonacci es 1 
		 * 
		 * Ejercicio: Generar una secuencia Fibonacci
		 * { 1, 1, 2, 3, 5, 8, 13, 21, 34 ..... }
		 * Vamos a generar la secuencia dependiendo del numero ingresado por el usuario.
		 * rango [ 0 - 20 ]
		 * 
		 */
		
		boolean condicion = true;
		int numero = 0;
		System.out.println("Por favor ingrese un numero");
		while ( condicion ) {
			
			Scanner scanner = new Scanner(System.in);
			numero = scanner.nextInt();
			
			if ( numero > 20 || numero < 0 ) {
				System.out.println("Por favor ingrese un numero dentro del rango [ 0 - 20 ]");
			} else {
				condicion = false;
			}
						
		}
		
		int[] fibonacci = new int[numero];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		for ( int i = 2; i < numero; i++ ) {
			
			fibonacci[i] = fibonacci[ i - 1 ] + fibonacci[ i - 2 ];
			
		}
		
		String out = "";
		for ( int a: fibonacci) {
			out += a + ", ";
		}
		
		System.out.println("La secuencia fibonacci generada de " + numero + " es igual a: " + "{ "  + out.substring(0, out.length()-2) + " }");

	}

}
