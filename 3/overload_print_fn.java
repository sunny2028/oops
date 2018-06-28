package oops;

import java.util.Scanner;

public class overload_print_fn {
public static void print()
{
	System.out.println("null argument");
}
public static void print(int a)
{
	System.out.println(a);
}
public static void print(float a)
{
	System.out.println(a);
}
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
			float f=sc.nextFloat();
			print();
			print(a);
String s=Float.toString(f);
	print(Float.parseFloat(s));
}
}
