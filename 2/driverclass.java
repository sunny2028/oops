package oops;

public class driverclass {
public static void main(String args[])
{
	cat obj=new cat();
	obj.speak();
	System.out.println(obj.color);
	System.out.println(obj.breed);
	
	dog obj1=new dog();
	obj1.speak();
	System.out.println(obj1.color);
	System.out.println(obj1.breed);
}

}
