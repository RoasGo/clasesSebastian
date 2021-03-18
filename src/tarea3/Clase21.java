package tarea3;

import java.util.ArrayList;

public class Clase21 {

	/**
	 *  Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
		alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
	 * 
	 * 
	 *  TAREA: REDONDEAR LA MEDIA DE LAS ALTURAS
	 *  TAREA: PONER EL NOMBRE DEL ALUMNO MAS ALTO y EL NOMBRE DEL ALUMNO MAYOR
	 */
	/*
	 * un dato por cada tipo
	 * 1 sueldo --- diferentes personas
	 * 
	 * dos datos por cada tipo
	 * EDAD + ALTURA -> PERSONA
	 * 
	 */
	public static void main(String[] args) {
		Alumno a = new Alumno(15, 1.60, "Sebastian");
		Alumno a1 = new Alumno(13, 1.62, "Gonzalo");
		Alumno a2 = new Alumno(14, 1.50, "Rodrigo");
		Alumno a3 = new Alumno(15, 1.57, "Christian");
		Alumno a4 = new Alumno(13, 1.10, "Miriam");
			
		ArrayList<Alumno> arregloAlumnos = new ArrayList<Alumno>();
		arregloAlumnos.add(a);
		arregloAlumnos.add(a1);
		arregloAlumnos.add(a2);
		arregloAlumnos.add(a3);
		arregloAlumnos.add(a4);
		
		calculosVarios(arregloAlumnos);
	}
	
	static void calculosVarios( ArrayList<Alumno> alumnos ) {
		/**
		 * LA SUMA DE LOS VALORES / LA CANTIDAD 
		 */
		int mediaEdad = 0;
		double mediaAltura = 0.0;
		int cantidadMayores = 0;
		int cantidadAltos = 0;
		String nombreMasAlto = "";
		String nombreMayor = "";
		
		for ( Alumno alumno : alumnos ) {
			mediaEdad += alumno.edad;
			mediaAltura += alumno.altura;
			if ( alumno.edad > 14 ) {
				cantidadMayores++;
			}
			if ( alumno.altura > 1.57 ) {
				cantidadAltos++;
			}
			
		}
		System.out.println("La media de las edades de los alumnos es: " + mediaEdad/alumnos.size());
		System.out.println("La media de las alturas de los alumnos es: " + mediaAltura/alumnos.size());
		System.out.println("La cantidad de alumnos mayores a 14 es: " + cantidadMayores);
		System.out.println("La cantidad de alumnos que miden mas de 1.57 es: " + cantidadAltos);
		System.out.println("----------------------------");
		/**
		 *  int[] numeros = { 7, 15, 10, 25, 10 };
			System.out.println("Dado el siguiente arreglo: { 7, 15, 10, 25, 10 } ");
			System.out.println("El numero mayor es: " + obtenerMayor(numeros));
		 */
	}
	
	static String obtenerMayor( ArrayList<Alumno> arreglo ) {
		Alumno alumnoMayorEdad = new Alumno(0, 0, "");
		Alumno alumnoMayorNota = new Alumno(0, 0, "");
		int edad = 0;
		// { 7, 15, 10, 25, 10 }
		//alumnoMayorEdad = arreglo[0]; // mayor = 7 |
		
		
		for ( int i = 1; i < arreglo.size(); i++ ) {
			if ( edad < arreglo[i].edad ) { // 7 < 15 | 15 < 10 | 15 < 25
				alumnoMayorEdad = arreglo[i]; // mayor = 15 |         | mayor = 25
			}
		}
		
		return "E"+alumnoMayorEdad.nombre;
	}

}

class AlumnoASD {
	int edad;
	double altura;
	String nombre;
	
	public Alumno(int edad, double altura, String nombre) {
		this.edad = edad;
		this.altura = altura;
		this.nombre = nombre;
	}
	
}