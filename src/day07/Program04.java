package day07;

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the first number:- ");
		int a=x.nextInt();
		System.out.println("Enter the second number:- ");
		int b=x.nextInt();
		x.close();
		
		
		System.out.println("Start Program...");
		
		if(a>b)
		{
			System.out.println("a is greater...!");
		}
		else if(a<b) 
		{
			System.out.println("b is greater...!");
		}
		else 
		{
			System.out.println("a and b are equal...!");
		}
		
		System.out.println("End Program...");
		
	}

}
