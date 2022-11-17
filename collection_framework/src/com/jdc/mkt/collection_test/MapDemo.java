package com.jdc.mkt.collection_test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> hashMp=new HashMap<>();
		Map<Data, String> treeMp=new TreeMap<>();
		Map<Integer, Integer> linkMp=new LinkedHashMap<>();
		
		treeMp.put(new Data(4),"Four");
		treeMp.put(new Data(5),"Five");
		treeMp.put(new Data(1),"One");
		treeMp.put(new Data(3),"Three");
		treeMp.put(new Data(2),"Two");
		
		for(Map.Entry e:treeMp.entrySet()) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
		

	}

}
class Data implements Comparable<Data>{
	private int key;

	Data(int key){
		this.key=key;
	}
	public int getKey() {
		return key;
	}

	
	public void setKey(int key) {
		this.key = key;
	}
	@Override
	public int compareTo(Data d) {
		return d.getKey()<getKey()?1:-1;
		
	}
	@Override
	public String toString() {
		return String.valueOf(key);
		
	}
	
}
