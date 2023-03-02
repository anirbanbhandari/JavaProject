package day14.task;

import java.util.Scanner;

public class Program01 {
	
	////Binary to Decimal conversion

	public static void main(String[] args) {
		
		System.out.println("Enter a binary number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		
		String y = Integer.toString(num);
		int count = y.length();
		double z=0;
		double temp=count-1;
		for(int i=0; i<count;i++) 
		{
			
				int a = Integer.parseInt(String.valueOf(y.charAt(i)));
				double calc=a* Math.pow(2, temp);
				z=calc+z;
				temp--;
				
		}
		System.out.println("Decimal value is: ");
		System.out.println(z);
		
		
	}

}
