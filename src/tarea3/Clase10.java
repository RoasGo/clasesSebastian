package tarea3;


public class Clase10 {
	
	public static void main(String[] args) {
		
		Persona p = new Persona();
		p.nombre = "Jorge";
		p.apellido = "JAVA";
		p.hablar(0, null);
		Persona prueba = new Persona();
		System.out.println("El nombre de prueba es: "+prueba.nombre);
		System.out.println("El nombre de prueba es: "+prueba.apellido);
		Persona p1 = new Persona("Gonzalo");
		Persona p2 = new Persona("Rodrigo", "Roa");
		System.out.println(p.nombre);
		System.out.println(p.apellido);
		System.out.println(p1.nombre);
		System.out.println(p2.nombre);		
		
		
		Empleado e = new Empleado("Empleado", "ApellidoE");
		System.out.println("Empleado nombre es: " + e.nombre);
		System.out.println("Empleado apellido es: " + e.apellido);

	}
	
	public class Prueba {
		protected String nombre;
	}
}

// Creacion de una clase

class Persona {
	// Atributos
	// ----------------------FUNCION ES ALGO COMPLEEEEEEEETAMENTE DIFERENTE 
	
	// Especificar el TIPO DE DATO y EL NOMBRE de la variable
	protected String nombre; 
	
	String apellido;
	private String dni;
	String celular;
	
	// Metodos -- 
	// Especificar nombre de metodo y VALOR DE RETORNO 
	// Por que elementos está conformado una funcion o metodo ? 
	// Parametros y el cuerpo de la función
	String hablar( int numero, String nombre ) {
		
		// NOMBRE GLOBAL -> THIS
		this.nombre = "Cualquier valor";
		//Persona.apellido = "Apellido";
		
		// NOMBRE DE ESTA FUNCION
		nombre = "Otro nombre";
		
		return this.nombre + nombre;
	}
	
	// CONSTRUCTOR
	public Persona() {
		this.apellido = "ECLIPSE";
	}

	Persona( String nombre ) {
		this.nombre = nombre;
	}
	
	Persona( String nombre, String apellido ) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	class SubPersona {
		
		//nombre = "Gonzalo";
		
	}
	
	//MODIFICADORES DE ACCESO
	// PUBLIC - PRIVATE - PROTECTED
		
}

class Empleado extends Persona implements Interface {
	
	Empleado(String nombre, String apellido) {
		super(nombre, apellido);
	}

	@Override
	public String hablar() {
		// TODO Auto2-generated method stub
		return "Hola, Comoe stas ?";
	}

	@Override
	public String escribir() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Prueba implements Interface {

	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return "Bien, y tu ?";
	}

	@Override
	public String escribir() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

interface Interface {
	String hablar();
	String escribir();
}
