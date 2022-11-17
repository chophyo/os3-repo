package com.jdc.mkt.collection_test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> hashSet=new HashSet<>();
		//Set<String> treeSet=new TreeSet<>();
		//Set<String> linkSet=new LinkedHashSet<>();
		
		hashSet.add("Aung ko");
		hashSet.add("May Moe");
		hashSet.add("Min M");
		hashSet.add("Wanna");
		hashSet.add("May Moe");
		
		
		
		for(String s: hashSet) {
			System.out.println(s);
		}
		
	}
	static void start(Set<Integer>strs) {
		for(int i=0; i<10;i++) {
			strs.add(i);
		}
	}
}
