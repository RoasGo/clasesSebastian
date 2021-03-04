package tarea3;

import java.util.Scanner;

public class Clase22 {
	public static void main(String[] args) {
		/**
		 * 03_Pedir un número N, introducir N sueldos, 
		 * y mostrar el
		 * sueldo mayor y menor.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		/*
		 * Un for se utiliza tambien cuando quieres que se repita un bucle por N cantidad de veces.
		 * While se utiliza cuando quieres que se repita un bloque de codigo hasta que se cumpla una condicion especifica.
		 * 
		 */
		int cantidadSueldos = scanner.nextInt();
		int[] arregloSueldos = new int[cantidadSueldos];
		System.out.println("Ingrese " + cantidadSueldos + " sueldos [...]");
		for ( int i=1; i <= cantidadSueldos; i++ ) {
			int sueldo = scanner.nextInt();
			arregloSueldos[i-1] = sueldo;
			System.out.println("El sueldo numero " + i + " es: " + sueldo);
		}
	
		System.out.println("El sueldo mayor que se ha ingresado es: " + "sueldo");
		
		
	}
}
