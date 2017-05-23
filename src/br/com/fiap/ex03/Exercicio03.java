package br.com.fiap.ex03;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;

public class Exercicio03 {
	private static final int MAX_CAPACITY = 1_000_000;
	private static final int SEARCH_POSITION = 500_000;

	public static void main(String[] args) {
		long diff1 = 0l, diff2 = 0l;
		LocalDateTime dateTime = LocalDateTime.now();
		List<Integer> arrayList = new ArrayList<>(MAX_CAPACITY);
		for (int i = 0; i < MAX_CAPACITY; i++) {
			arrayList.add(i);
		}
		diff1 = ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now());
		System.out.println("ArrayList: " + diff2);
		
		dateTime = LocalDateTime.now();
		List<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < MAX_CAPACITY; i++) {
			linkedList.add(i);
		}
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));

		dateTime = LocalDateTime.now();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < MAX_CAPACITY; i++) {
			stack.add(i);
		}
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));
		
		dateTime = LocalDateTime.now();
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < MAX_CAPACITY; i++) {
			hashSet.add(i);
		}
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));
		
		dateTime = LocalDateTime.now();
		HashMap<Integer, String> hashMap = new HashMap<>();
		for (int i = 0; i < MAX_CAPACITY; i++) {
			hashMap.put(i, "teste" + i);
		}
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));

		dateTime = LocalDateTime.now();
		WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();
		for (int i = 0; i < MAX_CAPACITY; i++) {
			weakHashMap.put(i, "teste" + i);
		}
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));

		dateTime = LocalDateTime.now();
		arrayList.get(SEARCH_POSITION);
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));

		dateTime = LocalDateTime.now();
		linkedList.get(SEARCH_POSITION);
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));
		
		dateTime = LocalDateTime.now();
		stack.get(SEARCH_POSITION);
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));
		
		dateTime = LocalDateTime.now();
		hashSet.contains(SEARCH_POSITION);
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));
		
		dateTime = LocalDateTime.now();
		hashMap.get(SEARCH_POSITION);
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));
		
		dateTime = LocalDateTime.now();
		weakHashMap.get(SEARCH_POSITION);
		System.out.println(ChronoUnit.MILLIS.between(dateTime, LocalDateTime.now()));
	}
}
