package tarea3;

public class Funciones {

	public static void main(String[] args) {

		//int[] num = { 14, 15, 16, 17, 18, 19, 20, 21 };
		int[] num2 = { 24, 16, 51, 57, 69, 96, 54, 18 };
		ejercicio1(num2);

	}
	
	// Siempre se especifica el valor de rotorno 
	static String funcionCualquiera() {
		String retorno = "";
		return retorno;
	}
	// Los parametros
	// El cuerpo de la funcion

	int sumeDosNumerosMAL() {
		int a = 0;
		int b = 5;
		return a + b;
	}
	
	
	int sumeDosNumeros(int a, int b) {
		
		return a + b;
	}
	

	/*
	 * PAR o IMPAR  
	 * Tenemos un arreglo como input y se tiene que determinar si los numeros son pares o impares
	 * 
	 * arreglo[15] = 51  --> Es IMPAR
	 * arreglo[16] = 14  --> Es PAR
 	 * 
	 */
	
	static void ejercicio1( int[] num ) {
		
		for ( int i = 0; i < num.length; i++ ) {
			if ( (num[i] % 2) == 0 ) {
				System.out.println("El arreglo" + "[" + i + "]" + " = " + num[i] + "   ----> " + " ES PAR ");
			} else {
				System.out.println("El arreglo" + "[" + i + "]" + " = " + num[i] + "   ----> " + " ES IMPAR ");
			}
		}
		
	}
	
	/*
	 * TAREA: CONVERTIR TODAS LAS TAREAS ANTERIORES A FUNCIONES PURAS
	 * 
	 * 
	 */
	
}
