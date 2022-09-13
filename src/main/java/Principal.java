

//La siguiente librería contiene funciones para hacer
//lectura desde la consola de MSDOS
//Más información en https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html

import java.util.Scanner;

// En Java cualquier fragmento de código debe ser parte de una clase,
// incluido el método "main"

public class Principal {


	// El método "main" debe declararse como "public" para que sea accesible
	// desde fuera de esta clase
	// Además, debe ser declarado como "static", porque es un método de
	// la clase Principal, no de ninguno de sus objetos; además, por cierto,
	// no se construye ninguno
	// Entre paréntesis encontramos el vector de parámetros (cuyo tipo es "String []")
	// que se le pasan al método main; la lista puede (y suele) ser vacía
	// "args" es únicamente el identificador que le asignamos;
	// lo puede elegir el usuario libremente

	public static void main (String [] args){

		System.out.println ( );	
		System.out.println ( "***************************" );
		System.out.println ( " Declaración y construcción de objetos en Java : " );
		System.out.println ( );
		
		//Declaración de un objeto; observa las diferencias con C++:
		Circunferencia circ_radio_0;

		//reserva de memoria y construcción del objeto:
		circ_radio_0 = new Circunferencia ( );

		//Declaración, reserva y construcción simultáneas:
		Circunferencia circ_radio_3 = new Circunferencia ( 3.0 );
		
		//Conviene recordar que no siempre es obligatorio
		//declarar y construir un objeto, podemos declarar y asignar:
		Circunferencia c4;
		c4 = circ_radio_0;

		//Uso de los objetos
		System.out.println ("El objeto circ_radio_0 tiene como radio "
			+ circ_radio_0.getRadio ( ) );

		System.out.println ("El objeto circ_radio_3 tiene como radio "
			+ circ_radio_3.getRadio ( ) );

		circ_radio_3.setArea( 28 );

		System.out.println ("El objeto circ_radio_3 tiene como area "
			+ circ_radio_3.getArea ( ) );
			
		//Uso de los atributos estáticos:
		//Recordar que lo hemos hecho públicos...
		
		System.out.println ("El número de Circunferencia creadas es "
			+ Circunferencia.contadorCircunferencias );
		
		//...pero no finales:
		
		Circunferencia.contadorCircunferencias = 0;
	
		// Repetimos el ejercicio que hicimos sobre gestión de memoria en C++
				
		System.out.println ( );
		System.out.println ( "***************************" );
		System.out.println ( " Gestión de memoria en Java: " );
		System.out.println ( " 1. Tipos básicos (int, boolean, double...)" );
		System.out.println ( );
		
		double cero = 0.0;
		
		double copia_de_cero = cero;
		
		copia_de_cero = cero + 5.8;
					
		// Ahora la pregunta que queremos responder es qué
		// valores toman cero y copia_de_cero
				
		System.out.println ( " ¿Qué valores toman cada una de las variables? " );
		System.out.println ( "El valor de cero: " + cero );
		System.out.println ( "El valor de copia_de_cero: " + copia_de_cero );	
		
		// Repetimos el ejercicio que hicimos sobre gestión de memoria en C++
		// Recordamos que hemos asignado "c4 = circ_radio_0;"
		
		System.out.println ( );
		System.out.println ( "***************************" );
		System.out.println ( " Gestión de memoria en Java: " );
		System.out.println ( " 2. Objetos " );
		System.out.println( );


		/* Volvemos a asignar circ_radio_0 a una circunferencia de radio 0. */
		circ_radio_0 = new Circunferencia (0.0);
		c4 = circ_radio_0;
		
		c4.setRadio( 453.56 );
		
		// Ahora la pregunta que queremos responder es qué
		// valores de radio toman c4 y circ_radio_0
		
		System.out.println ( " ¿Qué valores de radio toman cada uno de los objetos? " );
		System.out.println ( "El radio de circ_radio_0: " + circ_radio_0.getRadio ( ) );
		System.out.println ( "El radio de c4: " + c4.getRadio ( ) );	
		
		//Aquí podemos ver la lectura desde teclado, a través de la clase "Scanner"
		//Declaramos una instancia de nombre "entrada" de la clase Scanner
		
		System.out.println ( );
		System.out.println ( "***************************" );
		System.out.println ( " Lecturas desde teclado de tipos básicos : " );
		System.out.println ( " Tipos básicos (int, boolean, double...) " );
		System.out.println ( );
		
		Scanner entrada = new Scanner( System.in );
		
		// Lo anterior sería equivalente a 'java.util.Scanner'

 		System.out.println ("Escribe un nuevo radio para la circunferencia de radio 0");

 		//Declaramos una variable de tipo double y la inicializamos con el valor
 		//leído por teclado

 		double aux = entrada.nextDouble ( );

 		//Lo guardamos en el objeto circ_radio_0

 		circ_radio_0.setRadio (aux);

		System.out.println ("El objeto circ_radio_0 tiene como radio "
			+ circ_radio_0.getRadio());

 		System.out.println ("Escribe un nuevo area para el circulo de radio 3");

 		//Utilizamos la propia variable aux para leer un nuevo area para
 		//el objeto circ_radio_3

 		aux = entrada.nextDouble ();

 		System.out.println ( );
		System.out.println ( "***************************" );
		System.out.println ( " Gestión de memoria en Java: " );
		System.out.println ( " Paso de parámetros " );
		System.out.println ( " Comprueba si los datos se pasan como Entrada o Entrada/Salida " );
		System.out.println ( " En este curso le llamaremos paso por valor o por referencia " );
		System.out.println ( );
 		
 		cambiarArea ( circ_radio_3, aux );

		System.out.println ("El objeto circ_radio_3 tras cambiar su area "
			+ circ_radio_3.getArea ( ) );

		setRadioOne (circ_radio_0);

		System.out.println ("El objeto circ_radio_0 tras setRadioOne: "
			+ circ_radio_0.getRadio ( ) );

		permutarCircunferencias (circ_radio_0, circ_radio_3);

		System.out.println ("El objeto circ_radio_0 tras permutar tiene como radio: "
			+ circ_radio_0.getRadio ( ) );
		System.out.println ("El objeto circ_radio_3 tras permutar tiene como �rea: "
			+ circ_radio_3.getArea ( ) );

		int i = 35;

		System.out.println ( "El valor de i antes de modificar: " + i );
		setIntNull (i);
		System.out.println ( "El valor de i después de modificar: " + i );
		}

	//Todos los métodos que declaremos dentro de esta clase deben ser "static"
	//Son métodos auxiliares, y la referencia
	//al objeto "this" no va a aparecer en ninguno

	public static void cambiarArea ( Circunferencia c, double nuevo_area ){
		c.setArea ( nuevo_area );
	}

	public static void permutarCircunferencias( Circunferencia c, Circunferencia d ){
		Circunferencia aux;
		aux = d;
		d = c;
		c = aux;
	}

	public static void setRadioOne(Circunferencia c){
		c.setRadio (1.0);
	}

	public static void setIntNull(int n){
		n = 0;
	}

}