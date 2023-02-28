package day14;

public class Program02 {

	public static void main(String[] args) {
		
		int x1[]= {153, 370, 371, 507, 1634, 8208, 9476};

		for(int x:x1)
		{
			String y = String.valueOf(x); //converting integer values into string to read the number one by one
			int count = y.length();			
			double z=0;
			for(int i=0;i<count;i++)
			{
				z=Math.pow(Integer.parseInt(y.charAt(i)+""), count)+z; //parse the string value as a signed decimal value
			}
			if(z==x)
			{
				System.out.println("ArmStrong Number "+x);
			}
		}
	}

}
