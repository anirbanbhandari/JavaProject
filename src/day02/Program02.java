package day02;

public class Program02 {
	
	public static int square() {
		
		int x = 50;
		return(x*x);
		
	}

	public static void main(String[] args) {
	
		int a = 103;
		int s = square(); //storing the return value of square() method
		System.out.println(a+s);
	}

}
