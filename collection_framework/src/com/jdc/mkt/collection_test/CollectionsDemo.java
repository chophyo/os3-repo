package com.jdc.mkt.collection_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("G","H","g","H","h","A","a");
		List<String>list1=new ArrayList<>();
		list1.add("");
		
		System.out.println("Before....");
		
		showData(list);
		
		System.out.println("After....");
		
		//sorting
		Collections.sort(list);
		showData(list);
		
		//shuffle
		//Collections.shuffle(list);
		//showData(list);
		
		//binary search
		System.out.println(Collections.binarySearch(list, "H"));
		
		//frequency
		System.out.println(Collections.frequency(list, "H"));
		
		//disjoint
		System.out.println(Collections.disjoint(list, list1));
		
		list1.add("Hello");
		list1.add("Hello");
		//unmodifiable
		list1=Collections.unmodifiableList(list);
		//list1.add("b");
		
		//swap
		Collections.swap(list, 0, 1);
		showData(list);
		
		//min,max
		System.out.println(Collections.max(list));

	}
	static void showData(List<?> list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+",");
		}
		System.out.println();
	}

}
