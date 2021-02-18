package tarea3;

import java.util.Scanner;

public class Clase19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numeroIngresado = scanner.nextInt(); // 5
		int suma = 0;
		
		// 5 == 0 -> False || 7  || 0 != 0 -> false
		while( numeroIngresado != 0 ) { 
			//sumar numero
			suma += numeroIngresado;
			numeroIngresado = scanner.nextInt();
		}
		//retornar la suma
		// return suma
		System.out.println(suma);
	}
	
	/**
	 * 	++ -> sumar de uno en uno | += aumentar dependendiendo 
	 *  TANTO IF COMO WHILE VERIFICAN UNA CONDICION
	 *  IMPORTANTE: OPERADORES -> == ( Comparación ) || != ( Negación )
	 *  
	 *  if(CONDICION) { BLOQUE DE CODIGO }
	 *  while(CONDICION) { BLOQUE DE CODIGO }
	 *  
	 */
	
	// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

	// Entrada: Numero que ingresas -> int
	// Proceso: Sumar los numeros introducidos hasta que se ingrese un 0
	// Salida: Mostrar la suma de todos los numeros introducidos

	// 5, 7, 9, -1000, 5, 6, ..... infinito 
	// PERO si ingresas 0 ---> ACABA EL PROCESO
	
	/**
	 * Pedir un número N, y mostrar todos los números del 1 al N.
	 * 
	 * 
	 */
	

}
