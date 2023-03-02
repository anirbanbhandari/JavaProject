package day13;

public class Program04 {
	
	//prime number

	public static void main(String[] args) {
		
		int[] x= {10,1,20,23,45,65,78,92,100,2,19};
		
		for(int y:x)
		{
			boolean isPrime = true;
			if(y==1)
			{
				isPrime =false;
			}
			
			else {
				for(int i=2;i<=y;i++)
					{
					if(y%i==0) {
						isPrime = false;
					}
						
					}
				
				}
			if(isPrime)
				System.out.println(y+" is a prime number");
		}
	}
}