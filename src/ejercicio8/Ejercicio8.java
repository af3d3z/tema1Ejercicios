package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		// definimos las entradas infantiles
		final double ENTRADA_INFANTIL = 15.50;
		// definimos las entradas de adulto
		final int ENTRADA_ADULTO = 20;
		// esta constante guardará el descuento a aplicar cuando el total es superior a 100€
		final double DESCUENTO = 0.05;
		// esta variable guardará las entradas infantiles que compre el usuario
		int cantidadEntradasInfantiles;
		// esta variable guardará las entradas de adulto que compre el usuario
		int cantidadEntradasAdulto;
		// creamos el objeto scanner para la entrada de datos
		Scanner sc = new Scanner(System.in);
		// esta variable guardará el total de las entradas
		double total;
		
		// indicamos al usuario que escriba el número de entradas infantiles que necesita
		System.out.println("Nº de entradas infantiles: ");
		// recogemos los datos introducidos
		cantidadEntradasInfantiles = sc.nextInt();
		
		// indicamos al usuario que escriba el número de entradas de adulto que necesita
		System.out.println("Nº de entradas de adulto: ");
		// recogemos los datos introducidos
		cantidadEntradasAdulto = sc.nextInt();
		
		// calculamos el total
		total = cantidadEntradasInfantiles * ENTRADA_INFANTIL + ENTRADA_ADULTO * cantidadEntradasAdulto;
		// añadimos el descuento si aplica
		total = (total>=100) ? total - (total * DESCUENTO) : total;
		
		// mostramos el resultado
		System.out.println("TOTAL: " + total + "€.");
		
		// cerramos el objeto scanner
		sc.close();
	}
}
