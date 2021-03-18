package clases;

import java.util.ArrayList;

public class Alumno {
	private int codigo;
	private String nombre;
	private String apellido;
	private double nota1;
	private double nota2;
	private double nota3;

	public Alumno( int codigo, String nombre, String apellido) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Alumno(int codigo, String nombre, String apellido, double nota1, double nota2, double nota3) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double calcularPromedio() {
		return Math.round((this.nota1 + this.nota2 + this.nota3) / 3);
	}

	// Un metodo de busqueda. por que campos o atributos debe ser la busqueda. Por el atributo CODIGO.
	// 1. Tipo de funcion -> DE NO RETORNO y LAS QUE RETORNAN ALGO
	// 2. Que parametros tendria? -> 1 Arreglo | Codigo
	// 3. Cual seria el valor de retorno? Datos X -> Alumno
	
	public static Alumno findByCodigo( ArrayList<Alumno> arregloAlumno, int codigo ) {
		Alumno alumno = null;
		
		for ( Alumno a : arregloAlumno ) {
			if ( a.getCodigo() == codigo  ) {
				alumno = a;
			}
		}
		
		return alumno;
	}
	
	// Un metodo que actualice las notas de un alumno en especifico. -> Sobrecarga de metodo
	// 1. Tipo de funcion -> De retorno 
	// 2. Que parametros tendria?  -> Codigo, Arreglo, nuevaNota, nuevaNota1, nuevaNota2
	// 3. Cual seria el valor de retorno? -> Retornar el alumno
	
	public static Alumno updateNotasByCodigo( ArrayList<Alumno> arregloAlumno, int codigo, double nota1 ) {
		Alumno alumnoUpdated = null;
		for ( Alumno a : arregloAlumno ) {
			if ( a.getCodigo() == codigo ) {
				a.setNota1(nota1);
				alumnoUpdated = a;
			}
		}
		
		return alumnoUpdated;
	}
	// nota1 = null
	public static Alumno updateNotasByCodigo( ArrayList<Alumno> arregloAlumno, int codigo, double nota1, double nota2 ) {
		Alumno alumnoUpdated = null;
		for ( Alumno a : arregloAlumno ) {
			if ( a.getCodigo() == codigo ) {
				
				if ( (nota1 > 0) ) {
					a.setNota1(nota1);
				}
				a.setNota2(nota2);
				alumnoUpdated = a;
			}
		}
		
		return alumnoUpdated;
	}
	
	public static Alumno updateNotasByCodigo( ArrayList<Alumno> arregloAlumno, int codigo, double nota1, double nota2, double nota3 ) {
		Alumno alumnoUpdated = null;
		for ( Alumno a : arregloAlumno ) {
			if ( a.getCodigo() == codigo ) {
				
				if ( (nota1 > 0) ) {
					a.setNota1(nota1);
				}
				if ( nota2 > 0 ) {
					a.setNota2(nota2);
				}
				a.setNota3(nota3);
				alumnoUpdated = a;
			}
		}
		
		return alumnoUpdated;
	}
	
	// Metodo para agregar un nuevo alumno

	public static Alumno addAlumno( ArrayList<Alumno> arregloAlumno, String nombre, String apellido ) {
		
		int codigo = arregloAlumno.get(arregloAlumno.size()-1).getCodigo() + 1;
		Alumno alumno = new Alumno(codigo, nombre, apellido);
		
		arregloAlumno.add(alumno);
		
		return alumno;
	}
	
	// Metodo para eliminar un alumno
	
	public static int deleteAlumno( ArrayList<Alumno> arregloAlumno, int codigo ) {
		
		int rs = 0; 
		
		for ( int i = 0; i < arregloAlumno.size(); i++ ) {
			if ( arregloAlumno.get(i).getCodigo() == codigo ) {
				arregloAlumno.remove(i);
				rs = 1;
			}
		}
		
		return rs;
	}
	
}
