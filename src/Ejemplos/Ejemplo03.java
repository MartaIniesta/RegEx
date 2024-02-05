package Ejemplos;

import java.util.regex.*;

public class Ejemplo03 {
	public static void main(String[] args) {
		//Comprueba si la cadena termina exactamente con el patrón "sd$"
		String texto = "aa.ssdd.asddd.asd";
		String regex = ".*sd$";
		
		coincidencias(texto, regex);
		
		boolean resultado = texto.matches(regex);
		System.out.println("\nValidado? " + resultado);
		//Devuelve false, porque esta expresion regular solo valida un texto formado por dos caracteres
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