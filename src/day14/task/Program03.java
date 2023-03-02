package day14.task;

import java.util.Scanner;

public class Program03 {
	
	////Octal to Binary conversion

	public static void main(String[] args) {
		
		System.out.println("Enter an Octal number");
		Scanner scn = new Scanner(System.in);
		String num = scn.next();
		scn.close();
		
		int i=0;
		String binary = "";
		
		while(i<num.length()) 
		{
			char c= num.charAt(i);
			switch (c) {
			case '0':
				binary += "000";
				break;
			case '1':
				binary += "001";
				break;
			case '2':
				binary += "010";
				break;
			case '3':
				binary += "011";
				break;
			case '4':
				binary += "100";
				break;
			case '5':
				binary += "101";
				break;
			case '6':
				binary += "110";
				break;
			case '7':
				binary += "111";
				break;
			default:
				System.out.println("Invalid Octal Digit "+ num.charAt((int)i));
				break;
				}
			i++;

		}
		
		System.out.print(binary);
		
	}
}

