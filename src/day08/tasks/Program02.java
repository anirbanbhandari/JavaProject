package day08.tasks;

public class Program02 {

	public static void main(String[] args) {
		
		int a=200;
		int b=100;
		int c=200;
		int d=400;

		if(a>=b && a>=c && a>=d)
		{
			if(a==b && a==c && a==d)
			{
				System.out.println("a, b, c & d are equal");
			}
			else if(a==b && a>c && a>d)
			{
				System.out.println("a & b are equal and greater than c & d");
			}
			else if(a==c && a>b && a>d)
			{
				System.out.println("a & c are equal and greater than b & d");
			}
			else if(a==d && a>b && a>c)
			{
				System.out.println("a & d are equal and greater than b & c");
			}
			else if((b>c) && (c>d))
			{
				System.out.println("a is greater than b, b is greater than c and c is greater than d");
			}
			else if((c>b) && (c>d))
			{
				System.out.println("a is greater than c, c is greater than b and c is greater than d");
			}
			else if((d>b) && (d>c))
			{
				System.out.println("a is greater than d, d is greater than b and d is greater than c");
			}
			else if((b==c) && (b>d))
			{
				System.out.println("a is greater than b,c,d and b & c are equal but greater than d");
			}
			else if((b==d) && (b>c))
			{
				System.out.println("a is greater than b,c,d and b & d are equal but greater than c");
			}
			else if((c==d) && (c>b))
			{
				System.out.println("a is greater than b,c,d and c & d are equal but greater than b");
			}
			else
			{
				System.out.println("a is greater than b,c,d and b,c,d are equal");
			}


		}
		else if(b>=a && b>=c && b>=d) // condition for b
		{
			if((b==c) && (b==d) )
			{
				System.out.println("b, c & d are equal and greater than a");
			}
			else if((a>c) && (a>d))
			{
				System.out.println("b is greater than a and a is greater than c & d");
			}
			else if((c>a) && (c>d))
			{
				System.out.println("b is greater than c and c is greater than a & d");
			}
			else if((d>a) && (d>c))
			{
				System.out.println("b is greater than d and d is greater than a & c");
			}
			else if((a==c) && (a>d))
			{
				System.out.println("b is greater than a,c,d and a & c are equal but greater than d");
			}
			else if((a==d) && (a>c))
			{
				System.out.println("b is greater than a,c,d and a & d are equal but greater than c");
			}
			else if((c==d) && (c>a))
			{
				System.out.println("b is greater than a,c,d and c & d are equal but greater than a");
			}
			else
			{
				System.out.println("b is greater than a,c & d and a,c,d are equal");

			}
		}
		else if(c>=a && c>=b && c>=d) // Conditions for c
		{
			if((c==b) && (c==d) )
			{
				System.out.println("b, c & d are equal and greater than a");
			}
			else if((a>b) && (a>c))
			{
				System.out.println("c is greater than a and a is greater than b & c");
			}
			else if((b>a) && (b>d))
			{
				System.out.println("c is greater than b and b is greater than a & d");
			}
			else if((d>a) && (d>b))
			{
				System.out.println("c is greater than d and d is greater than a & b");
			}
			else if((a==b) && (a>d))
			{
				System.out.println("c is greater than a,b,d and a & b are equal but greater than d");
			}
			else if((a==d) && (a>b))
			{
				System.out.println("c is greater than a,b,d and a & d are equal but greater than b");
			}
			else if((b==d) && (b>a))
			{
				System.out.println("c is greater than a,b,d and b & d are equal but greater than a");
			}
			else
			{
				System.out.println("c is greater than a,b & d and a,b,d are equal");

			}
		}
		else if(d>=a && d>=b && d>=c) // Conditions for d
		{
			if((d==b) && (d==c) )
			{
				System.out.println("b, c & d are equal and greater than a");
			}
			else if((a>b) && (a>c))
			{
				System.out.println("d is greater than a and a is greater than b & c");
			}
			else if((b>a) && (b>c))
			{
				System.out.println("d is greater than b and b is greater than a & c");
			}
			else if((c>a) && (c>b))
			{
				System.out.println("d is greater than c and c is greater than a & b");
			}
			else if((a==b) && (a>c))
			{
				System.out.println("d is greater than a,b,c and a & b are equal but greater than c");
			}
			else if((a==c) && (a>b))
			{
				System.out.println("d is greater than a,b,c and a & c are equal but greater than b");
			}
			else if((b==c) && (b>a))
			{
				System.out.println("d is greater than a,b,c and b & c are equal but greater than a");
			}
			else
			{
				System.out.println("d is greater than a,b & c and a,b,c are equal");

			}
		}
//		else
//		{
//			if((a>b) && (a>d))
//			{
//				System.out.println("c is greater than a and a is greater than b & d");
//					
//			}
//			else if((b>a) && (b>d))
//			{
//				System.out.println("c is greater than b and b is greater than a & d");
//					
//			}
//			else if((d>a) && (d>b))
//			{
//				System.out.println("c is greater than d and d is greater than a & b");
//					
//			}
//			else
//			{
//				System.out.println("c is greater than a, b, d and a, b & d  are equal");
//			}
//		}

	}

}
