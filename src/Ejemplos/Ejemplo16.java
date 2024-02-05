package Ejemplos;

import java.util.regex.*;

public class Ejemplo16 {
	public static void main(String[] args) {
		//Comprueba si la cadena contiene uno o varios grupos formados por caracteres que no sean @
		String texto = "pepe@gmail.com";
		String regex = "([^@])+"; // ^ dentro de [] significa negacion.
		
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