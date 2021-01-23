package tarea3;

import java.util.Scanner;

public class EjerciciosBucles {

	public static void main(String[] args) {

		/*
		 * Vamos a crear un arreglo dependiendo del digito ingresado por consola Si el
		 * digito esta fuera del rango indicado ( 0-99 ) entonces pediremos que ingrese
		 * un numero válido.
		 * 
		 * Y como retorno vamos a imprimir el mismo arreglo pero con los elementos
		 * elevados al cuadrado.
		 * 
		 */

		boolean condicion = false;
		int numeroArreglo = 0;
		System.out.println("Ingrese un número :) ");
		while (!condicion) {

			Scanner scanner = new Scanner(System.in);
			numeroArreglo = scanner.nextInt();
			
			if (numeroArreglo > 99 || numeroArreglo < 0) {
				System.out.println("Por favor, ingrese un número dentro del rango [ 0 - 99 ]");
			} else {
				condicion = true;
			}

		}

		int[] arreglo = new int[numeroArreglo];
		for (int i = 0; i < numeroArreglo; i++) {

			arreglo[i] = (int) Math.pow(i, 2);
			System.out.println("El valor del arreglo en la posicion: " + i + " es igual a: " + arreglo[i]);
			
		}

	}

}
