import java.util.Scanner;

public class Saluda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable de clase.
		private String nombre = null;

		//Ejecutar método
		pidenombre ();
		
		//Saludar
		System.out.println("Hola " + getNombre() + " !!!");		
		
	}
	
	public static String getNombre (){
		
		return nombre;
		
	}
	
	public static void setNombre (String nombre) {
		
		this.nombre = nombre ;
		
	}
	
	public static pideNombre () {
		
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Cual es tu nombre?");		
		
		setNombre(entrada.nextLine());		
		
	}
	
}
