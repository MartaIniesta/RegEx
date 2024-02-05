package Ejemplos;

import java.util.regex.*;

public class Ejemplo04 {
	public static void main(String[] args) {
		//Comprueba si la cadena contiene puntos con el patrón "\."
		String texto = "aa.ssdd.asddd.asd";
		String regex = "\\.";
		
		coincidencias(texto, regex);
		
		boolean resultado = texto.matches(regex);
		System.out.println("\nValidado? " + resultado);
		//Devuelve false, porque esta expresion regular por un solo caracter "."
	}
	
	public static void coincidencias(String texto, String regex) {
		Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);
		System.out.println("\nCoincidencias: ");
		
		while(coincidencias.find()) {
			System.out.println("INDICE: " + coincidencias.start() + "(FRAGMENTO: " + coincidencias.group() + ")");
		}
	}
}