package day11;

public class Program07 {

	public static void main(String[] args) {
		
//		1
//		2 4
//		3 9 3
//		4 16 4 16
//		5 25 5 25 5
		
			
		for(int i=1;i<=5;i++)
		{
			int num =i; //1 2 3
			
			for(int j=1;j<=i;j++) //1 2
			{
				System.out.print(num+" "); //1 - 2 4 - 3 9 27 - 
				 num = num*i; // 1 4 9
				 if(num==i*i*i) {
					 num=(i*i*i)/(i*i);
				 }
			}
			
			System.out.println();
		}
	}

}
