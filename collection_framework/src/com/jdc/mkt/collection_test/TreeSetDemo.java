package com.jdc.mkt.collection_test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Human> set=new TreeSet<>();
		
		set.add(new Human("Nandar",22));
		set.add(new Human("Sai Thiha",34));
		set.add(new Human("Ays Sandar", 21));
		
		for(Human m: set) {
			System.out.println(m.getName()+"\t"+m.getAge());
		}
	}

}
class Human implements Comparable<Human>{
	private String name;
	private int age;
	
	Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Human h) {
		int result=h.getName().compareTo(name);//to arrange with name
		
		//System.out.println(result);
		//return result;
		
		/*
		 * if(h.getAge()<getAge()) { return 1; }else { return -1; }
		 */
		
		/*
		 * if(result>1) { return -1; }else { return 1; }
		 */
		
		return h.getAge()<getAge()?1:-1;
	}
	
}