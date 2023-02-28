package day13;

import java.util.Arrays;

public class Program03 {

	public static void main(String[] args) {
		int[] x= {10,1,20,23,45,65,78,92,100,2}; 
		
		System.out.println(Arrays.toString(x)); //sysout(x) will print the memory where x has been stored
		Arrays.sort(x);		
		System.out.println(Arrays.toString(x));
		
		System.out.println("Copy Function");
		//int[] y = x -> y and x will share the same storage. Hence change in one will reflect in the other as well
		int[] y=Arrays.copyOf(x, x.length);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		x[0]=111;
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(x);
		System.out.println(y);

	}

}
