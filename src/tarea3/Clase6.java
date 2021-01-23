package tarea3;

import java.util.Scanner;
import tarea3.Clase10;

public class Clase6 {

	public static void main(String[] args) {

		/*
		 * Ejercicio: Suma de dos numeros. Cree un programa java que acepte 3 numeros.
		 * Retorne true si la suma de los dos primeros es igual al tercero, sino retorna
		 * false. Los numeros ingresados deben estar en el rango de 22 a 150.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese 3 numeros dentro del rango [25-150] ");
		
		System.out.println("Por favor, ingrese el primer numero ... ");
		int numero1 = scanner.nextInt();
	//	System.out.println("Por favor ingrese un numero valido.");
		
		System.out.println("Por favor, ingrese el segundo numero...");
		int numero2 = scanner.nextInt();
		System.out.println("Por favor, ingrese el tercer numero...");
		
		int numero3 = scanner.nextInt();
		while ( numero3 > 150 || numero3 < 25 ) {
				// solo verdadero Y Verdadero == V -- Falso Y verdadero == False
			// verdadero O false == F  --> si los dos son V te da verdadero
			System.out.println("Por favor ingrese un numero valido.");
			numero3 = scanner.nextInt();
		}
		
		// 
		
		System.out.println("Por favor, ingrese el cuarto numero...");
		
		int numero4;
		do {
			 numero4 = scanner.nextInt();
		} while( numero4 > 150 || numero4 < 25 );
		
		
		System.out.println("Numeros ingresados: [....]" );
		if ( numero1 > 99 || numero2 > 99 || numero3 > 99 ) {
			
		} else {
			if ( numero1 + numero2 == numero3 ) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
		
		Persona persona = new Persona();
		persona.nombre ="";
		
		/*
		 * 
		 * 
		 * 
		 */
		
	}

}
