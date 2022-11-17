package com.jdc.mkt.collection_test;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<String>d1=new LinkedList<>();
		d1.offer("d1");
		d1.add("d2");
		d1.offer("d3");
		d1.add("d4");
		d1.addFirst("d0");
		d1.addLast("d6");
		d1.add("d7");
		
		d1.offerLast("d8");
		d1.remove();
		System.out.println(d1.element());
		
		d1.addFirst("d0");
		System.out.println(d1.peek());
		
		for(String s: d1) {
			System.out.println(s);
		}
		
	}

}
