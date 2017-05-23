package br.com.fiap.ex02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercicio02 {
	public static void main(String[] args) {
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime date = LocalDateTime.parse("10/09/2012 12:00", formatDate);
		System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(date));
		System.out.println(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss").format(date));
		System.out.println(DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH).format(date));
		System.out.println(DateTimeFormatter.ofPattern("yyyy").format(date));
		System.out.println(DateTimeFormatter.ofPattern("G", Locale.ENGLISH).format(date));
	}
}
