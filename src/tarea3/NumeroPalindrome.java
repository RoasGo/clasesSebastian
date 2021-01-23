package tarea3;

import java.util.Scanner;

public class NumeroPalindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Por favor ingrese un número... :D");
			numero = scanner.nextInt();
		} while ( (numero / 10) == 0 );
		System.out.println(isPalindrome(numero));
		
	}

	static boolean isPalindrome( int num ) {
		
		// Si el numero ingresado en menor a 0 -> se tiene que retornar false  
		//  4224 
		if (num < 0) return false;
		int reversed = 0;
		int remainder;
		int original = num; //4224
		
		while ( num != 0 ) {
			// 4224  		|	422  |  42  |  4
			remainder = num %  10; // 4  | 2  |  2  | 4  
			reversed = reversed * 10 + remainder; // 4   | 42  |  422  |  4224
			/*
			 * Como es que 4 + 2 te puede dar 42 ???
			 * 40 + 2 = 42
			 */
			num /= 10; // Se queda con la parte entera. 422  |  42  |  4  |  0
		}
		// Que un numero es el ultimo digito cuando el resultado de la division es cero.
		
		// 658 |  8 -- 65.8  | 5 -- 6.5  |  6  -- 0.6 

		// 4224 == 4224 -> true
		// 4851 == 1584 -> false
		//  5 == 5 -> true
		
		return original == reversed;
	}

}
