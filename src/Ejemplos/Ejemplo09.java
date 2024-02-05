package Ejemplos;

import java.util.regex.*;

public class Ejemplo09 {
	public static void main(String[] args) {
		//Comprueba si la cadena NO tiene espacios en blanco, saltos y tabuladores con el patrón "\S"
		String texto = " 0123 aadd_   d1?f";
		String regex = "\\S";
		
		coincidencias(texto, regex);
		
		boolean resultado = texto.matches(regex);
		System.out.println("\nValidado? " + resultado);
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