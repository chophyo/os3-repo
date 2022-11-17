package com.jdc.mkt.collection_test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		List<String>list= Arrays.asList("sad","happy","pleasure","mad","joyful");
		Queue<String> q1=new PriorityQueue<>();
		Queue<String> q2=new LinkedList<>();
		
		q1.add("s1");
		q1.add("s2");
		q1.add("s3");
		q1.add("sorrow");
		q1.add("sorrow");
		q1.add("sorrow");
		q1.offer("s7");
		System.out.println(q1.size());
		q1.remove();
		q1.poll();
		
		
		
		
		for(String s:q1) {
			System.out.println(s);
		}
		

	}

}
