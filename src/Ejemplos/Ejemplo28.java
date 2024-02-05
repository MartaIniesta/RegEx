package Ejemplos;

import java.util.regex.*;

public class Ejemplo28 {
	public static void main(String[] args) {
		//Comprueba si la cadena contiene un 1 y ese 1 no está seguido por un 2, opcionalmente va precedido o seguido de ninguno o varios caracteres.
		String texto = "abc dfdg13fdg asdrabcty";
		String regex = ".*1[^2].*";
		
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