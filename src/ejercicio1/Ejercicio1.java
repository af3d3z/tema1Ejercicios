package ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		// número introducido por el usuario
		double numero;
		// numero introducido por el usuario pero cambiamos su valor decimal a 0.5
		double numeroMitad;
		// definimos el objeto scanner para la entrada de datos
		Scanner sc = new Scanner(System.in);
		// cambiamos la local del scanner para permitir puntos en los números
		sc.useLocale(Locale.US);
		// variable donde se guardará el número entero redondeado
		double numeroRedondeado;
		
		
		// pedimos al usuario que introduzca los datos
		System.out.println("Introduzca un número decimal: ");
		// el usuario introduce el número
		numero = sc.nextDouble();
		// sustituimos por .5 la parte decimal del número
		numeroMitad = ((int)numero + 0.5);
		/* comprobamos si el número que ha introducido el usuario es menor o igual
		 * al mismo número pero con su parte decimal a .5 en caso positivo devolvemos
		 * el número tal y como lo introdució el usuario y en caso contrario se le suma uno*/
		numeroRedondeado = numeroMitad >= numero ? numero : ++numero;
		
		// mostramos al usuario el número redondeado
		System.out.println("Numero redondeado: " + (int)numeroRedondeado);
		
		// cerramos el scanner
		sc.close();
		
	}
}
