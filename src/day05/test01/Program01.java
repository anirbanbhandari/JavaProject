package day05.test01;

public class Program01 {

	public static void main(String[] args) {
				add(20,30);
				add(5.11, 6.22);
				add(1,2,3);
				System.out.println(main(15,2));
				main();

			}
			
			public static int main(int a, int b) //Overloading main
			{
				return a+b;
			}
			
			public static void main()
			{
				System.out.println("Method Overloading");
			}
			
			public static void add(int a,int b)
			{
				System.out.println(a+b);
			}
			
			public static void add(double a,double b)
			{
				System.out.println(a+b);
			}

			public static void add(int a,int b,int c)
			{
				System.out.println(a+b+c);
			}
		

	}


