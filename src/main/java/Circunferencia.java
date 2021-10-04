

import java.lang.Math;

public class Circunferencia {

	//Declaración e inicialización de constantes
	private static final double PI = 3.1416;

	//Declaración de atributos de clase (static)
	public static int contadorCircunferencias = 0;
	public static int contadorArea = 0;

	//Declaración de atributos
	private double radio;

	//Declaración y definición de constructores
	public Circunferencia(){
		this.radio = 0.0;
		Circunferencia.contadorCircunferencias++;
		//Notar el uso de la operación "+" para concatenar cadenas (clase String)
		//Más información sobre la clase String en
		//http://docs.oracle.com/javase/8/docs/api/java/lang/String.html
    		System.out.println ("El contador de circunf vale " + contadorCircunferencias);
    }

	public Circunferencia(double radio){
		this.radio = radio;
		Circunferencia.contadorCircunferencias++;
    		System.out.println ("El contador de circunf vale " + contadorCircunferencias);
    }

    //Declaración y definición de métodos de acceso y modificación
    public double getRadio(){
    	return this.radio;
    }

    public void setRadio(double nuevo_radio){
    		this.radio = nuevo_radio;
    }

  	public double getDiametro (){
  		return (2 * this.radio);
  	}

  	public void setDiametro (double nuevo_diametro){
  		this.radio = nuevo_diametro / 2;
  	}

  	public double getArea (){
  		Circunferencia.contadorArea++;
  		System.out.println ("El contador de areas vale " + contadorArea);
  		return (Circunferencia.PI *
  			Math.pow (this.radio, 2));
  	}

  	public void setArea (double nuevo_area){
  		Circunferencia.contadorArea++;
  		System.out.println ("El contador de areas vale " + contadorArea);
  		this.radio = Math.sqrt (nuevo_area / PI);
  	}

	public double getLongitud (){
		return (this.radio * 2 * PI);
	}

	public void setLongitud (double nueva_longitud){
		this.radio = nueva_longitud / (2 * PI);
	}
}