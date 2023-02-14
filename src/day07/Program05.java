package day07;

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the first number:- ");
		int a=x.nextInt();
		System.out.println("Enter the second number:- ");
		int b=x.nextInt();
		System.out.println("Enter the third number:- ");
		int c=x.nextInt();
		x.close();
		System.out.println("Start Program...");																																								
		if((a>b) && (a>c))
		{
			System.out.println("First number is the largest...!");
		}
		else if((b>a) && (b>c)) 
		{
			System.out.println("Second number is the largest...!");
		}
		else 
		{
			System.out.println("Third number is the largest	...!");
		}
		
			System.out.println("End Program...");
		
	}

}
