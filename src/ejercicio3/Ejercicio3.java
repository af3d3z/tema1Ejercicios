package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// definimos el primer número que le vamos a pedir al usuario
		int num1;
		// definimos el segundo número que le vamos a pedir al usuario
		int num2;
		// variable donde se guardará el resultado de la operación módulo
		int resto;
		// variable donde se guardará cuanto le falta a num1 para ser múltiplo de num2
		int faltante;
		// objeto scanner para entrada de datos
		Scanner sc = new Scanner(System.in);
		
		// indicamos al usuario que introduzca num1
		System.out.println("Introduzca un número:");
		// rescatamos lo que introduzca por teclado el usuario
		num1 = sc.nextInt();
		
		// indicamos al usuario que introduzca num2
		System.out.println("Introduzca un número:");
		// rescatamos lo que introduzca por teclado el usuario
		num2 = sc.nextInt();
		
		// usamos la operación módulo para obtener el resto
		resto = num1 % num2;
		// calculamos cuanto falta para el múltiplo de num2 y si ya es múltiplo se queda en 0
		faltante = resto == 0 ? 0 : num2 - resto;
		
		//mostramos el resultado por pantalla
		System.out.println("A " + num1 + " le faltan " + faltante + " para ser múltiplo de " + num2 + ".");
		
		// cerramos el objeto scanner
		sc.close();
	}
}
