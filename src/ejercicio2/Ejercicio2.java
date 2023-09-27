package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		// número introducido por el usuario
		int numero;
		// creamos el objeto scanner para la entrada de datos
		Scanner sc = new Scanner(System.in);
		// en esta variable guardaremos cuanto falta para que sea múltiplo de 7
		int restante;
		// en esta variable guardaremos el resultado de la operación módulo
		int resto;
		
		// pedimos al usuario que introduzca un entero
		System.out.println("Introduzca un número:");
		// recogemos el número
		numero = sc.nextInt();
		
		/* calculamos el módulo y luego se lo restamos a 7 para saber cuanto falta 
		 * para que fuera múltiplo de 7*/
		resto = numero % 7;
		restante = resto == 0 ? 0 : 7 - resto;
		
		// mostramos el resultado por pantalla
		System.out.println("Faltarían " + restante + " para que fuese múltiplo de 7.");
		
		// cerramos el objeto scanner
		sc.close();
	}
}
