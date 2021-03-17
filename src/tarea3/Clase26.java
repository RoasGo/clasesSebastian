package tarea3;

import java.util.ArrayList;

public class Clase26 {

	/**
	 * 
	 * Un profesor -> 6 alumnos
	 * 
	 * Alumno -> 3 notas | Nombre | Apellido
	 * 
	 * ¿Cuantos alumnos estan aprobados en el año? ¿Los 3 primeros puestos de la
	 * clase?
	 * 
	 */

	// Recomendaciones: Usar clases + constructor + metodo para calcular promedio
	// Aprobados: nota mayor o igual a 13

	public static void main(String[] args) {
		AlumnoClase26 alumno1 = new AlumnoClase26("Gonzalo", "Roa", 20, 20, 20);
		AlumnoClase26 alumno2 = new AlumnoClase26("Rodrigo", "Castillo", 15.4, 17.8, 18);
		AlumnoClase26 alumno3 = new AlumnoClase26("Hector", "Montero", 19.5, 18, 17.5);
		AlumnoClase26 alumno4 = new AlumnoClase26("Diego", "Montero", 14.5, 18, 17.5);
		AlumnoClase26 alumno5 = new AlumnoClase26("Miriam", "Montero", 12.5, 18, 17.5);
		AlumnoClase26 alumno6 = new AlumnoClase26("Gianella", "Montero", 18.5, 18, 17.5);
		AlumnoClase26 alumno7 = new AlumnoClase26("Christian", "Montero", 11.5, 18, 17.5);
		AlumnoClase26 alumno8 = new AlumnoClase26("Jorge", "Montero", 08.5, 18, 17.5);
		AlumnoClase26 alumno9 = new AlumnoClase26("Sebastian", "Montero", 20, 18, 17.5);
		AlumnoClase26 alumno10 = new AlumnoClase26("Patricia", "Montero", 15, 18, 17.5);
		AlumnoClase26 alumno11 = new AlumnoClase26("Jessica", "Montero", 13, 18, 12);
		AlumnoClase26 alumno12 = new AlumnoClase26("Julio", "Montero", 06, 10, 15);
		AlumnoClase26 alumno13 = new AlumnoClase26("Efrain", "Montero", 14, 12, 18.5);
		AlumnoClase26 alumno14 = new AlumnoClase26("Cinthya", "Montero", 16.5, 10, 17.5);

		ArrayList<AlumnoClase26> arregloAlumno = new ArrayList<AlumnoClase26>();
		arregloAlumno.add(alumno1);
		arregloAlumno.add(alumno2);
		arregloAlumno.add(alumno3);
		arregloAlumno.add(alumno4);
		arregloAlumno.add(alumno5);
		arregloAlumno.add(alumno6);
		arregloAlumno.add(alumno7);
		arregloAlumno.add(alumno8);
		arregloAlumno.add(alumno9);
		arregloAlumno.add(alumno10);
		arregloAlumno.add(alumno11);
		arregloAlumno.add(alumno12);
		arregloAlumno.add(alumno13);
		arregloAlumno.add(alumno14);
		
		int c_aprobados=0;
		ArrayList<AlumnoClase26> arregloAlumnosAprobados = new ArrayList<AlumnoClase26>();
		for (AlumnoClase26 a : arregloAlumno) {
			//System.out.println(a.nombre + ": " + a.calcularPromedio());
			//System.out.println("");
			if( a.calcularPromedio() >= 13 ) {
				arregloAlumnosAprobados.add(a);
				c_aprobados++;
			}
		}
		
		ordenarArreglo(arregloAlumno);

		for ( int i = 0; i < 3; i++ ) {
			String nombre = arregloAlumno.get(i).nombre;
			double promedio = arregloAlumno.get(i).calcularPromedio();
			switch (i) {
			case 0: {
				System.out.println("El primer puesto es: " + nombre + " con nota: " + promedio);
				break;
			}
			case 1: {
				System.out.println("El segundo puesto es: " + nombre + " con nota: " + promedio);
				break;
			}
			default:
				System.out.println("El tercer puesto es: " + nombre + " con nota: " + promedio);
				break;
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Los alumnos aprobados son: " + c_aprobados);
		
	}
	
	static void ordenarArreglo ( ArrayList<AlumnoClase26> arregloAlumno ) {
		for ( int i = 0; i < arregloAlumno.size(); i++ ) {
			for ( int j = i + 1; j < arregloAlumno.size(); j++ ) {
				if ( arregloAlumno.get(i).calcularPromedio() < arregloAlumno.get(j).calcularPromedio() ) {
					AlumnoClase26 temp = arregloAlumno.get(i);
					arregloAlumno.set(i, arregloAlumno.get(j));
					arregloAlumno.set(j, temp);
				}
			}
		}
	}

}

class AlumnoClase26 {
	String nombre;
	String apellido;
	double nota1;
	double nota2;
	double nota3;

	public AlumnoClase26(String nombre, String apellido) {

	}

	public AlumnoClase26(String nombre, String apellido, double nota1, double nota2, double nota3) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	double calcularPromedio() {
		return Math.round((this.nota1 + this.nota2 + this.nota3) / 3);
	}

}