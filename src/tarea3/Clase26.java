package tarea3;

import java.util.ArrayList;
import clases.Alumno;

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
		Alumno alumno1 = new Alumno(1, "Gonzalo", "Roa", 20, 20, 20);
		Alumno alumno2 = new Alumno(2, "Rodrigo", "Castillo", 15.4, 17.8, 18);
		Alumno alumno3 = new Alumno(3, "Hector", "Montero", 19.5, 18, 17.5);
		Alumno alumno4 = new Alumno(4, "Diego", "Montero", 14.5, 18, 17.5);
		Alumno alumno5 = new Alumno(5, "Miriam", "Montero", 12.5, 18, 17.5);
		Alumno alumno6 = new Alumno(6, "Gianella", "Montero", 18.5, 18, 17.5);
		Alumno alumno7 = new Alumno(7, "Christian", "Montero", 11.5, 18, 17.5);
		Alumno alumno8 = new Alumno(8, "Jorge", "Montero", 08.5, 18, 17.5);
		Alumno alumno9 = new Alumno(9, "Sebastian", "Montero", 20, 18, 17.5);
		Alumno alumno10 = new Alumno(10, "Patricia", "Montero", 15, 18, 17.5);
		Alumno alumno11 = new Alumno(11, "Jessica", "Montero", 13, 18, 12);
		Alumno alumno12 = new Alumno(12, "Julio", "Montero", 06, 10, 15);
		Alumno alumno13 = new Alumno(13, "Efrain", "Montero", 14, 12, 18.5);
		Alumno alumno14 = new Alumno(14, "Cinthya", "Montero", 16.5, 10, 17.5);

		ArrayList<Alumno> arregloAlumno = new ArrayList<Alumno>();
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
		
		/*Alumno alumnoEncontrado = Alumno.findByCodigo(arregloAlumno, 5);
		if (alumnoEncontrado != null) {
			System.out.println(alumnoEncontrado.getCodigo());
			System.out.println(alumnoEncontrado.getNombre());
			System.out.println(alumnoEncontrado.getApellido());
			System.out.println(alumnoEncontrado.getNota1());
			System.out.println(alumnoEncontrado.getNota2());
			System.out.println(alumnoEncontrado.getNota3());			
		}
		System.out.println("------------------");
		Alumno alumnoAdded = Alumno.addAlumno(arregloAlumno, "Leonel", "Messi");
		System.out.println(alumnoAdded.getCodigo());
		System.out.println(alumnoAdded.getNombre());
		System.out.println(alumnoAdded.getApellido());
		System.out.println(alumnoAdded.getNota1());
		System.out.println(alumnoAdded.getNota2());
		System.out.println(alumnoAdded.getNota3());			
		/*Alumno alumnoUpdated = Alumno.updateNotasByCodigo(arregloAlumno, 5, 14);
		if (alumnoEncontrado != null) {
			System.out.println(alumnoUpdated.getCodigo());
			System.out.println(alumnoUpdated.getNombre());
			System.out.println(alumnoUpdated.getApellido());
			System.out.println(alumnoUpdated.getNota1());
			System.out.println(alumnoUpdated.getNota2());
			System.out.println(alumnoUpdated.getNota3());	
		}
		Alumno alumnoUpdated = Alumno.updateNotasByCodigo(arregloAlumno, 5, 16, 20, 17);
		if (alumnoEncontrado != null) {
			System.out.println(alumnoUpdated.getCodigo());
			System.out.println(alumnoUpdated.getNombre());
			System.out.println(alumnoUpdated.getApellido());
			System.out.println(alumnoUpdated.getNota1());
			System.out.println(alumnoUpdated.getNota2());
			System.out.println(alumnoUpdated.getNota3());			
		}
		
		/*
		int c_aprobados=0;
		ArrayList<Alumno> arregloAlumnosAprobados = new ArrayList<Alumno>();
		for (Alumno a : arregloAlumno) {
			//System.out.println(a.nombre + ": " + a.calcularPromedio());
			//System.out.println("");
			if( a.calcularPromedio() >= 13 ) {
				arregloAlumnosAprobados.add(a);
				c_aprobados++;
			}
		}
		/*
		ordenarArreglo(arregloAlumno);

		for ( int i = 0; i < 3; i++ ) {
			String nombre = arregloAlumno.get(i).getNombre();
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
		System.out.println("Los alumnos aprobados son: " + c_aprobados);*/
		
		int resultado = Alumno.deleteAlumno(arregloAlumno, 5);
		if ( resultado == 0 ) {
			System.out.println("El alumno no ha sido encontrado o eliminado");
		} else {
			System.out.println("El alumno ha sido eliminado correctamente");
		}

		for ( Alumno a : arregloAlumno ) {
			System.out.println(a.getCodigo());
			System.out.println(a.getNombre());
			System.out.println("---------");
		}
		
	}
	
	static void ordenarArreglo ( ArrayList<Alumno> arregloAlumno ) {
		for ( int i = 0; i < arregloAlumno.size(); i++ ) {
			for ( int j = i + 1; j < arregloAlumno.size(); j++ ) {
				if ( arregloAlumno.get(i).calcularPromedio() < arregloAlumno.get(j).calcularPromedio() ) {
					Alumno temp = arregloAlumno.get(i);
					arregloAlumno.set(i, arregloAlumno.get(j));
					arregloAlumno.set(j, temp);
				}
			}
		}
	}

}