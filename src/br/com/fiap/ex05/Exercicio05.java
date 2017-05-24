package br.com.fiap.ex05;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Mensagem: ");
			String mensagem = s.nextLine();
			mensagem.chars().forEach(c -> {
				char nextChar = (char) (c + 1);
				sb.append(nextChar);
			});
		}
		
		try (PrintWriter writer = new PrintWriter("mensagemCodificada.txt", "UTF-8")) {
			System.out.println("Gravando a mensagem codificada " + sb.toString());
			writer.println(sb.toString());
		} catch (final Exception e) {
			System.out.println("Não foi possível criar o arquivo mensagemCodificada.txt");
		}
	    
		try (FileReader reader = new FileReader("mensagemCodificada.txt"); 
			 Scanner in = new Scanner(reader);
			 PrintWriter writer = new PrintWriter("mensagemDecodificada.txt", "UTF-8")) {
			String mensagemCodificada = in.nextLine();
			StringBuilder sbDecoficado = new StringBuilder();
			mensagemCodificada.chars().forEach(c -> {
				char nextChar = (char) (c - 1);
				sbDecoficado.append(nextChar);
			});
			System.out.println("Gravando a mensagem decodificada " + sbDecoficado.toString());
			writer.println(sbDecoficado.toString());
		} catch (final Exception e) {
			System.out.println("Não foi possível criar o arquivo mensagemDecodificada.txt");
		}
	}
}
