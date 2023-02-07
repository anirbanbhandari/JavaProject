package day03;

public class Program02 {

	public static void main(String[] args) {
		Program02 calculation = new Program02(); //Object creation
		add(20, 30); //calling the static method 'add()' inside main
		calculation.sub(30, 20); //calling non-static inside static method hence using Object of Program02 class
		calculation.mul(20, 5);
		
		System.out.println("---------------");
		
		add(10,15);
		calculation.sub(25, 20);
		calculation.mul(5, 5);

	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	public void mul(int a, int b) {
		System.out.println(a*b);
	}

}
