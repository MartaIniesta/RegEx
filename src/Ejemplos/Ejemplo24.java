package Ejemplos;

import java.util.regex.*;

public class Ejemplo24 {
	public static void main(String[] args) {
		//Comprueba si en la cadena hay patrones formados por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.
		String texto = "abc dfdgfdg asdrabcty";
		String regex = "[a-zA-Z]{5,10}"; //5 longitud minima, 10 longitud maxima
		
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