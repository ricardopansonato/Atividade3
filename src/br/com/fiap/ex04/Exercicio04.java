package br.com.fiap.ex04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio04 {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("João Garcia", 20, 'M', "AIK Enterprises"));
		pessoas.add(new Pessoa("Maria Martins", 44, 'F', "Simples"));
		pessoas.add(new Pessoa("Henrique Fernando", 43, 'M', "AIK Enterprises"));
		pessoas.add(new Pessoa("Inácio Luís", 33, 'M', "Magazine André"));
		pessoas.add(new Pessoa("Fernando Ferreira", 87, 'M', "Casas Recife"));
		
		Collections.shuffle(pessoas);
		System.out.println("a) " + pessoas.get(0));
		
		Collections.sort(pessoas, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		System.out.println("b) ");
		pessoas.forEach(s -> {
			System.out.println(s);
		});
		
		Collections.reverse(pessoas);
		System.out.println("c) ");
		pessoas.forEach(s -> {
			System.out.println(s);
		});
	}
}
