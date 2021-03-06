package tarea3;

import java.util.ArrayList;

public class Clase25 {

	public static void main(String[] args) {
		/**
		 * Crear un metodo en donde le vamos a pasar dos parametros.
		 * 1-> Un arreglo | 2-> posicion | 3-> nuevoValor
		 * Se tiene que actualizar el valor de la posicion indicada.
		 * 
		 */
		/**
		 * TAREA: Cambiar de posiciones en un arreglo
		 * Crear una funcion que admita 3 parametros: 1 arreglo y las 2 posiciones a intercambiar
		 * Se tiene que actualizar el valor de la posicion indicada.
		 * 
		 */
		int[] arregloPrueba = { 58, 18, 19, 20, 26, 28, 78 };
		int[] arregloPrueba1 = { 8, 16, 19, 80, 16, 48, 78 };
		int[] arregloPrueba2 = { 18, 18, 19, 45, 26, 28, 70 };
		int[] arregloPrueba3 = { 28, 18, 19, 20, 48, 28, 75 };
		int[] arregloPrueba4 = { 88, 18, 19, 62, 95, 28, 77 };
		int[] arregloPrueba5 = { 87, 18, 19, 80, 26, 28, 78 };
		
		AlumnoClase a = new AlumnoClase(15, 1.60, "Sebastian");
		AlumnoClase a1 = new AlumnoClase(13, 1.62, "Gonzalo");
		AlumnoClase a2 = new AlumnoClase(14, 1.50, "Rodrigo");
		AlumnoClase a3 = new AlumnoClase(15, 1.57, "Christian");
		AlumnoClase a4 = new AlumnoClase(13, 1.10, "Miriam");
			
		ArrayList<AlumnoClase> arregloAlumnos = new ArrayList<AlumnoClase>();
		arregloAlumnos.add(a);
		arregloAlumnos.add(a1);
		arregloAlumnos.add(a2);
		arregloAlumnos.add(a3);
		arregloAlumnos.add(a4);
		
		System.out.println("Antiguos valores: ");
		for( AlumnoClase alumno : arregloAlumnos) {
			System.out.println("{ " + alumno.edad + " - " + alumno.nombre + " }");
		}	
		System.out.println("Nuevos valores: ");
		// int[] arregloActualizado = actualizarArreglo(arregloPrueba1, 2, 125);
		ArrayList<AlumnoClase> arregloAlumnosActualizado = actualizarAlumnos(arregloAlumnos, 15, 18);
		for( AlumnoClase alumno : arregloAlumnosActualizado ) {
			System.out.println("{ " + alumno.edad + " - " + alumno.nombre + " }");
		}	
		
	}
	
	static int[] actualizarArreglo( int[] arreglo, int posicion, int nuevoValor ) {
		
		for( int i=0; i < arreglo.length; i++ ) {
			if ( i == posicion ) {
				arreglo[i] = nuevoValor;
			}
		}
		
		return arreglo; 
	}
	
	static ArrayList<AlumnoClase>actualizarAlumnos( ArrayList<AlumnoClase>arreglo, int edad, int nuevoValor ) {
		
		for( AlumnoClase alumno : arreglo ) {
			if ( alumno.edad == edad ) {
				alumno.edad = nuevoValor;
			}
		}
		
		return arreglo;
	}
}

class AlumnoClase {
	int edad;
	double altura;
	String nombre;
	
	public AlumnoClase(int edad, double altura, String nombre) {
		this.edad = edad;
		this.altura = altura;
		this.nombre = nombre;
	}
	
}
