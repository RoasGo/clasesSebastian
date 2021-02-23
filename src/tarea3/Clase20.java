package tarea3;

import java.util.Scanner;

public class Clase20 {

	public static void main(String[] args) {
		
		// ENTRADA: UN NUMERO ENTERO DEL 1 al 10
		
		// PROCESO: Hacer la tabla de multiplicar jasta el 12
		
		// SALIDA : La tabla de multiplicacion ....... SYSO
		
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		while ( numero < 1 || numero > 10  ) {
			System.out.println("Ingrese un numero del 1 al 10");
			numero = scanner.nextInt();
		}
		
		for ( int i = 0; i < 13; i++ ) {
			int resultado = numero * i;
			System.out.println("El numero: "+ numero +" x  " + i + " es igual a : " + resultado);
		}
		
	}
	
}
