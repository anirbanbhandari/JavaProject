package day14.task;

import java.util.Scanner;

public class Program02 {
	
	//Decimal to binary conversion

	public static void main(String[] args) {
		
		int[] n = new int[1000000];
		System.out.println("Enter a decimal number");
		Scanner scn = new Scanner(System.in);
		int decimal = scn.nextInt();
		scn.close();
		
		int i=0;
		while(decimal>0) 
		{
			n[i] = decimal%2; //storing the remainder inside array
			decimal = decimal/2; //
			i++;
		}
		System.out.print("Binary of the Decimal is: ");
		for(int j= i-1; j>=0; j--)
		{
			System.out.print(n[j]);
		}
	}

}
