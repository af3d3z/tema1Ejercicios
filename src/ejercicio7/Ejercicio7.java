package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		// variable que guardará el número de milímetros introducidos por el usuario
		int milimetrosUsuario;
		// variable que guardará los milimetros convertidos a centimetros
		int milimetrosCentimetros;
		// variable que guardará los metros convertidos a centímetros
		int metrosCentimetros;
		// variable que guardará el número de centímetros introducidos por el usuario
		int centimetrosUsuario;
		// variable que guardará el número de metros introducidos por el usuario
		int metrosUsuario;
		// variable que guardará el resultado de la suma
		int resultado;
		// creamos el objeto scanner para la entrada de datos.
		Scanner sc = new Scanner(System.in);
		
		// pedimos al usuario que introduzca los milímetros
		System.out.println("Introduzca los milímetros:");
		// recogemos los datos que introduce el usuario
		milimetrosUsuario = sc.nextInt();
		
		// pedimos al usuario que introduzca los centímetros
		System.out.println("Introduzca los centímetros:");
		// recogemos los datos que introduce el usuario
		centimetrosUsuario = sc.nextInt();

		// pedimos al usuario que introduzca los metros
		System.out.println("Introduzca los metros:");
		// recogemos los datos que introduce el usuario
		metrosUsuario = sc.nextInt();

		// pasamos de milimetros a centimetros
		milimetrosCentimetros = milimetrosUsuario / 10;
		// pasamos de metros a centimetros
		metrosCentimetros = metrosUsuario * 100;
	
		// sumamos todos los valores
		resultado = milimetrosCentimetros + centimetrosUsuario + metrosCentimetros;
		
		// mostrar el resultado
		System.out.println("Resultado total: " + resultado + "cm ");
		
		// cerramos el scanner
		sc.close();
	}
	
}
