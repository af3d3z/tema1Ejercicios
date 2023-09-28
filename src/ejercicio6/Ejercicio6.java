package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		// constante donde se guardan cuantos segundos tiene una hora
		final int HORA_SEGUNDOS = 3600;
		// constante donde se guardan cuantos segundos son un minuto
		final int MINUTO_SEGUNDOS = 60;
		// variable en la que se guardan los segundos introducidos por el usuario
		int nsegundos;
		// variable en la que se guardan el resto de segundos de los minutos
		int restoSegundos = 0;
		// variable en la que se guarda el resto de los minutos de la hora
		int restoMinutos;
		//variable en la que se guardarán los minutos
		int minutos;
		// variable en la que se guardará en horas
		int horas;
		// creamos el objeto scanner
		Scanner sc = new Scanner(System.in);
		
		//indicamos al usuario que introduzca el número de segundos
		System.out.println("Introduzca unos segundos");
		// recojemos lo que introduzca el usuario
		nsegundos = sc.nextInt();
		
		// calculamos el número de horas
		horas =(int) nsegundos / HORA_SEGUNDOS;
		// calculamos cuanto sería el resto (para minutos sobrantes)
		restoMinutos = nsegundos % HORA_SEGUNDOS;
		// calculamos los minutos
		minutos = (restoMinutos != 0) ? restoMinutos / MINUTO_SEGUNDOS : 0;
		// calculamos el número de segundos
		restoSegundos = restoMinutos % MINUTO_SEGUNDOS;
		
		// los mostramos por pantalla
		System.out.println(horas + "h " + minutos + "m " + restoSegundos + "s");
		
		// cerramos el scanner
		sc.close();
	}
}
