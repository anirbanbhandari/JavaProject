package day03.test01;

public class Program02 extends Program01 { 
	//Program02 inherits Program01
	//Program01 = Parent/Super-class, Program02 = Child/Sub-class

	public static void main(String[] args) {
		
		Program01 calculation = new Program01();
		calculation.add(20, 30);
		calculation.sub(103, 3);
		calculation.mul(4, 8);
		calculation.div(90, 9);
	}

}
