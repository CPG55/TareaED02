import java.util.Scanner;

public class Saluda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable de clase.
		private String nombre = null;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cual es tu nombre?");		
		nombre = entrada.nextLine();		
		System.out.println("Hola " + nombre + " !!!");		
		
	}
	
	public String getNombre (){
		
		return nombre;
		
	}
	
	public void setNombre (String nombre) {
		
		this.nombre = nombre ;
		
	}
	
}
