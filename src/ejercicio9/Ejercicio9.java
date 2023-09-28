package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		// resultado de la comparación
		boolean resultado;
		// numero 1
		int num0;
		// numero2;
		int num1;
		// creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// pedimos el primer número
		System.out.println("Introduzca el primer número:");
		// guardamos el número
		num0 = sc.nextInt();
		
		// pedimos el segundo número
		System.out.println("Introduzca el segundo número:");
		// guardamos el número
		num1 = sc.nextInt();
		
		// realizamos la comparación
		resultado = num0 == num1 ? true : false;
		
		//mostramos el resultado por pantalla
		System.out.println("¿Son los números iguales?: " + resultado);
		
		// cerramos el objeto scanner
		sc.close();
				
	}
}
