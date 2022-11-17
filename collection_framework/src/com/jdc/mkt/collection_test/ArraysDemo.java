package com.jdc.mkt.collection_test;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		String[]datas= {"Hello","Java","Developer","Super","Spring"};
		String[]data2= {"Hello"};
		
		Container[] c1= {new Container(3),new Container(2),new Container(5)};
		//sorting
		System.out.println("Before");
		showData(datas);
		
		System.out.println("After");
		
		//Arrays.sort(datas);
		Arrays.sort(datas,0,5);
		showData(datas);
		
		//binary Search
		System.out.println(Arrays.binarySearch(datas, "Super"));
		
		//fill
		Arrays.fill(datas,"Guys");
		showData(datas);
		
		//copy
		data2=Arrays.copyOf(datas, datas.length);
		//equal
		System.out.println(Arrays.equals(datas, data2));
		
		
	}
	
	static void showData(String[]datas) {
		for(String s:datas) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}
}

class Container{
	private int data;
	
	Container(int data){
		this.data=data;
	}
	
	public int getData() {
		return data;
	}

	
	public void setData(int data) {
		this.data = data;
	}
		
}