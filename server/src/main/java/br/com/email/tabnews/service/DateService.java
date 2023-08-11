package br.com.email.tabnews.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateService {

	public static LocalDateTime formatDate(String date) {
		String strFormatted = formatStringDate(date);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return LocalDateTime.parse(strFormatted, format);
	}
	
	private static String formatStringDate(String date) {
		String resultado = date.substring(0, 19);
		return resultado.replace("T", " ");
	}
}
