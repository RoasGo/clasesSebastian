package tarea3;

import java.util.Scanner;

public class Clase24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cantidad = 5;
		int[] arreglo = new int[cantidad];
		// 0,0,0,0,0
		String salida = "";
		String salidaReversed = "";
		for ( int i=0; i < cantidad; i++ ) {
			arreglo[i] = scanner.nextInt();
			salida += arreglo[i] + ", ";
		}
		salida = "{ " + salida.substring(0, salida.length()-2) + " }";
		System.out.println(salida);
		int[] arregloReversed = new int[cantidad];
		for ( int i=arreglo.length-1; i >= 0; i-- ) {
			salidaReversed += arreglo[i] + ", ";
		}
		salidaReversed = "{ " + salidaReversed.substring(0, salidaReversed.length()-2) + " }";
		System.out.println(salidaReversed);
		// { num1, num2, num3 }
		// gonzalo -> 2, 5 retorna: nzal
		/**
		 * TAREA: CREAR UN ARREGLO INVERSO AL ORIGINAL.
		 * 
		 * 
		 */
	}
}
