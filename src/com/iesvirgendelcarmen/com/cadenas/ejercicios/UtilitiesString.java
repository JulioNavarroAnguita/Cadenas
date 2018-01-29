package com.iesvirgendelcarmen.com.cadenas.ejercicios;

public class UtilitiesString {
	
	public static final String[] ARTICULOS_DETERMINADOS = {"el", "lo", "la", "las", "los"};
	public static final String[] ARTICULOS_INDETERMINADOS = {"un", "una", "unos", "unas"};
	public static final String[] PREPOSICIONES = {"a", "ante", "bajo", "cabe",
			"con", "contra", "de", "desde", "en", "entre", "hacia", "hasta", "para", "por",
			"segun", "sin", "so", "sobre", "tras", "durante", "mediante", "excepto"};
	
	private static String clearPunctuationMarksAndLowerCase (String phrase) {
		return phrase.trim().replaceAll("[,;:\\.¿\\?¡!\\(\\)><\\-='\"]", "").toLowerCase();
	}
	
	public static int countWords(String phrase) {
		return clearPunctuationMarksAndLowerCase(phrase).split("\\s+").length;
			
	}
	
	public static void main(String[] args) {
		String phrase = "Hola Mundo java    hola";
		System.out.println(clearPunctuationMarksAndLowerCase(phrase));
		System.out.println(countWords(phrase));
	}
}
