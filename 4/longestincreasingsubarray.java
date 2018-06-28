package oops;

import java.util.Scanner;

public class longestincreasingsubarray {
public static void main(String args[])
{int count=1;
int maxcount=1;
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
	{
	arr[i]=sc.nextInt();	
	}
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i+1]>arr[i])
		{count++;
			if(count>maxcount)
				maxcount=count;
		}
		else
			count=1;
	}
	System.out.println(maxcount);
}
}
