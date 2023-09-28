package ejercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// variable donde se guarda la longitud del lanzamiento
		double lanzamiento;
		// variable donde se hace la conversión
		int lanzamientoCm;
		// creación del objeto scanner
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		// pedimos al usuario que introduzca la lontigud del lanzamiento
		System.out.println("Longitud del lanzamiento: (m)");
		// guardamos el número introducido por el usuario
		lanzamiento = sc.nextDouble();
		
		// convertimos de metros a cm
		lanzamientoCm = (int) (lanzamiento * 100);
		
		// enseñamos por pantalla el resultado
		System.out.println("Longitud del lanzamiento: " + lanzamientoCm + "cm.");
		
		// cerramos el scanner
		sc.close();
	}

}
