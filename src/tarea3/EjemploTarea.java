package tarea3;

import java.util.Scanner;

public class EjemploTarea {

	public static void main(String[] args) {

		/*
		 * Write a Java program that keeps a number from the user and generates an
		 * integer between 1 and 7 and displays the name of the weekday.
		 */

		/*
		 * Utilizar el Scan Evaluamos que número ha sido ingresado Verificamos que el
		 * numero ingresado este en el rango de 1 a 7 Dependiendo del numero imprimimos
		 * un día de la semana. Si el numero ingresado es mayor a 7 --Imprimimos que el
		 * numero se excede del rango. Si el numero ingresado es menor que 1
		 * --Imprimimos que el numero es menor.
		 * 
		 */

		boolean condicion = false;
		int numeroIngresado = 0;
		
		while ( !condicion ) {
			
			Scanner scanner = new Scanner(System.in);
			numeroIngresado = scanner.nextInt();
			
			if (numeroIngresado > 7) {
				System.out.println("EL numero ingresado excede el rango. Por favor ingresa otro numero...");
			} else if (numeroIngresado < 1) {
				System.out.println("El numero es menor. Por favor ingresa otro numero...");
			} else {
				condicion = true;
			}
			
		}

		switch (numeroIngresado) {
			case 1: {
				System.out.println("LUNES");
				break;
			}
			case 2: {
				System.out.println("MARTES");
				break;
			}
			case 3: {
				System.out.println("MIERCOLES");
				break;
			}
			case 4: {
				System.out.println("JUEVES");
				break;
			}
			case 5: {
				System.out.println("VIERNES");
				break;
			}
			case 6: {
				System.out.println("SABADO");
				break;
			}
			case 7: {
				System.out.println("DOMINGO");
				break;
			}
			default:
				System.out.println("ERROR");
		}

		
		/*
		 * armar el do-while / while que verifique el numero ingresado este dentro del rango
		 *  
		 * */

	}

}
