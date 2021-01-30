package tarea3;

public class Clase13 {

	public static void main(String[] args) {
		
		// 1. Se desea conocer los dos primeros numeros  dentro de un arreglo que sumen 15.
		// [ 1, 3, 5, 5, 7]
		
		// Entrada: ARREGLO DE ENTEROS.
		/*  PROCESO:
		 *  FOR - ANIDADO
		 *  VERIFICAR LA CONDICION PARA EVALUAR SI SE CUMPLE O NO
		 */ 
		// Salida: 
		// Se retorna los dos primeros numeros que sumen 15.
		
		// TAREA: INVESTIGAR UN EJERCICIO E IDENTIFICAR LOS PROCESOS PARA RESOLVERLO.
		int[] arreglo = { 1, 3, 7, 5, 5 };
		int[] nuevoArreglo = sumaDeDosNumeros(arreglo);
		
		System.out.println(nuevoArreglo[0]);
		System.out.println(nuevoArreglo[1]);
		
		//TAREA: VERIFICAR QUE EL ARREGLO TENGA DATOS
	}
	
	static int[] sumaDeDosNumeros( int[] arreglo ) {
		
		int[] dosNumeros = new int[2];
		
		// Validacion
		
		for( int i=0; i < arreglo.length; i++ ) { // i=0 -> 1 | i=1 -> 3
			//System.out.println("For AFUERA: " + i + " veces");
			for(int j=0; j<arreglo.length; j++) { // j=0 -> 1 | j=1 -> 3 | j=2 -> 5
				//System.out.println("For adentro: " + j + " veces");
				if( (arreglo[i] + arreglo[j]) == 10 ) { //  1 + 1 == 15 |  1 + 3 == 15 | 1 + 5 == 15 
														// 3 + 1 .....
					
					dosNumeros[0] = arreglo[i];
					dosNumeros[1] = arreglo[j];
					return dosNumeros;
				}
			}
		}
		
		return dosNumeros;
	}

}
