package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// variable que guardará la base del triangulo
		int base;
		// variable que guardará la altura del triangulo
		int altura;
		// variable donde se guardará el área del triangulo
		int area;
		// creamos el objeto scanner para la entrada de datos
		Scanner sc = new Scanner(System.in);
		
		// indicamos al usuario que introduzca la base
		System.out.println("Introduzca la base del triangulo: (cm)");
		// rescatamos lo que introduzca el usuario
		base = sc.nextInt();
		
		// indicamos al usuario que introduzca la altura
		System.out.println("Introduzca la altura del triangulo: (cm)");
		// rescatamos lo que introduzca el usuario
		altura = sc.nextInt();
		
		// calculamos el área del triangulo
		area = base * altura / 2;
		
		// mostramos el resultado al usuario
		System.out.println("La altura del triangulo es de: " + area + " cm^2");
		
		// cerramos el scanner
		sc.close();
	}
}
