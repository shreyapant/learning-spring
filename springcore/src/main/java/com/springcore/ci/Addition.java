package com.springcore.ci;

public class Addition {
private int a;
private int b;
public Addition(double a, double b) {
	this.a=(int)a;
	this.b=(int)b;
	System.out.println("Contructor : double , double");
}
public Addition(int a, int b) {
	this.a=a;
	this.b=b;
	System.out.println("Contructor : int , int");
}
public Addition(String a, String b) {
	this.a=Integer.parseInt(a);
	this.b=Integer.parseInt(b);
	System.out.println("Contructor : string , string");
}

public void doSum() {
	System.out.println(this.a);
	System.out.println(this.b);
	System.out.println("Sum is= "+(this.a+this.b));
}

}
