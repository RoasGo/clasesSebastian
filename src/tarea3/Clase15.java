package tarea3;

import java.util.Scanner;

public class Clase15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int dia = scanner.nextInt();
		int mes = scanner.nextInt();
		int año = scanner.nextInt();
		
		System.out.println(validarFecha(dia, mes, año));
		System.out.println(ordenarDosNumeros(dia, mes));
		int[] arreglo = ordenarDosNumeros(dia, mes, "");
		System.out.println(arreglo);
		System.out.println(arreglo[0] + " " + arreglo[1]);
	}
	
	/* 
	 *  4. Pedir dos números y mostrarlos ordenados de mayor a menor. -> Cada vez mas dificil.
		7. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
			30 días.
			
		8. Pedir un arreglo de numeros enteros y debemos retornarlos ordenados de menor a mayor.

	 */
	
	//Ejercicio 7
	
	/*
	 * Proceso.-
	 * 
	 * Entrada: DIA, MES, AÑO -> 3 parametros.
	 * 
	 * Proceso: Analizar cada parametro y validar si es correcto.
	 * 			Ninguno tiene que ser negativo
	 * 			Dias no pueden ser mayores a 30
	 * 			Meses no pueden ser mayor a 12
	 * 			Año tiene que ser mayor a 2000
	 * 
	 * Salida: RETORNAR UN BOOLEANO
	 * 
	 */
	
	static boolean validarFecha( int dia, int mes, int año ) {
		
		if ( dia < 0 || mes < 0 || año < 0 ) { // F || F || F
			return false;
		} else {
			if ( dia > 30 ) {
				return false;
			}
			if ( mes > 12 ) {
				return false;
			}
			if ( año < 2000 ) {
				return false;
			}
			return true;
		}
	}
	
	// Ejercicio 4
	/* Proceso.-
	 * Entrada: 2 numeros enteros.
	 * 
	 * Proceso: Evaluar los numeros y ponerlos en orden de mayor a menor.
	 * 
	 * Salida: 2 numeros. 
	 * 	- Una manera puede se retornar un string con los numeros ordenados.
	 * 
	 * 	- Retornar un arreglo con los numeros ordenados.
	 * 
	 */
	
	static String ordenarDosNumeros( int numero1, int numero2 ) {
		
		String retorno = ""; 

		if ( numero1 > numero2 ) {
			retorno = "+ " + numero1 + " " + numero2;
		} else {
			retorno = "+ " + numero2 + " " + numero1;
		}
		
		// Igualdad "=="
		// Asignacion "="
		
		return retorno;
	}
	
	static int[] ordenarDosNumeros( int numero1, int numero2, String a ) {
		
		int[] retorno = new int[2];
		
		if ( numero1 > numero2 ) {
			retorno[0] = numero1;
			retorno[1] = numero2;
		} else {
			retorno[0] = numero2;
			retorno[1] = numero1;			
		}
		
		return retorno;
	}
	
}
