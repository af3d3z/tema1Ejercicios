package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// esta variable guardará el valor de a
		int a;
		// esta variable guardará el valor de b
		int b;
		// esta variable guardará el valor de c
		int c;
		// esta variable guardará el valor de x
		int x;
		// esta variable guardará el valor de y
		double y;
		
		// creamos el objeto scanner para la entrada de datos
		Scanner sc = new Scanner(System.in);
		
		// mostramos al usuario la fórmula:
		System.out.println("y=ax^2+bx+c");
		
		// indicamos al usuario que introduzca a
		System.out.println("Introduzca el valor de a:");
		// recogemos los datos que introduzca el usuario
		a = sc.nextInt();
		
		// indicamos al usuario que introduzca b
		System.out.println("Introduzca el valor de b:");
		// recogemos los datos que introduzca el usuario
		b = sc.nextInt();
		
		// indicamos al usuario que introduzca c
		System.out.println("Introduzca el valor de c:");
		// recogemos los datos que introduzca el usuario
		c = sc.nextInt();
		
		// indicamos al usuario que introduzca x
		System.out.println("Introduzca el valor de x:");
		// recogemos los datos que introduzca el usuario
		x = sc.nextInt();
		
		// calculamos y
		y = a * Math.pow(x, 2) + b * x + c;
		
		// mostramos el resultado al usuario
		System.out.println("y = " + y);
		
		// cerramos el scanner
		sc.close();
	}
}
