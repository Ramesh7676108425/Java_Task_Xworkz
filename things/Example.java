package com.xworkz.polymorphism.things;

public class Example {
	private String name;
	private int age;
	public Example(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "person name: "+name+" person age : " +age;
}
	public int hashcode() {
		return 5;
	}
	
	
	
	public boolean equals(Object obj) {
		if(this==obj) {
			System.out.println("hi");
			return true;}
		if (obj==null){
			System.out.println("hello");
		return false;}
	if(getClass()!=obj.getClass()) {
		System.out.println("aaaaa");
			return true;}
	Example example=(Example)obj;
	System.out.println(this.name);
		System.out.println(example.name);
		if(this.name.equals(example.name))
			return true;
		System.out.println("bbbb");
		return false;
	}
	
	//Example obj = new Example();
	
	public static void main(String[] args) {
		Example e = new Example("ramesh",22);
		Example e1 = new Example("rr",21);
		Example e2 = new Example("ramesh",22);
		Example e4 = e1;
		Object obj;
		
	System.out.println(e.toString());
	System.out.println(e.hashcode());
		System.out.println(e1.equals(e4));
		System.out.println(e.equals(e1));
		System.out.println(e.equals(e));
		
	//	System.out.println(getClass()!=obj.getClass());
		
		
		
	}
	
	

}
