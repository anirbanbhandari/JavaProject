package day08.tasks;

import java.util.Scanner;

public class Program03 extends Colour{

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		Colour color = new Colour();
		int apple=1;
		int samsung=2;
		int oneplus=3;
		int asus=4;
		
		System.out.println("----------Select Brand----------");
		System.out.println("Apple(1), Samsung(2), OnePlus(3), Asus(4) ");
		int selection = x.nextInt();
		//x.close();
		
		if(selection == apple) //Apple Options
		{
			System.out.println("iPhones are available in Red(1), Black(2), Silver(3).... Select Colour");
			int selectedColour = x.nextInt();
			if(selectedColour==color.red){
				System.out.println("Available in stock. Price is "+ color.AppleRed);
			}
			else if(selectedColour==color.black){
				System.out.println("Available in stock. Price is "+ color.AppleBlack);
			}
			else if(selectedColour==color.silver){
				System.out.println("Available in stock. Price is "+ color.AppleSilver);
			}
			else {
				System.out.println("Please choose a valid colour");
			}
			
		}
		else if(selection == samsung) //Samsung Options
		{
			System.out.println("Samsung phones are available in Red(1), Black(2), Silver(3).... Select Colour");
			int selectedColour = x.nextInt();
			if(selectedColour==color.red){
				System.out.println("Available in stock. Price is "+ color.SamsungRed);
			}
			else if(selectedColour==color.black){
				System.out.println("Out Of Stock. Coming soon... Price is "+ color.SamsungBlack);
			}
			else if(selectedColour==color.silver){
				System.out.println("Available in stock. Price is "+ color.SamsungSilver);
			}
			else {
				System.out.println("Please choose a valid colour");
			}
		}
		else if(selection == oneplus) //OnePlus Options
		{
			System.out.println("OnePlus phones are available in Red(1), Black(2), Silver(3).... Select Colour");
			int selectedColour = x.nextInt();
			if(selectedColour==color.red){
				System.out.println("Available in stock. Price is "+ color.OPRed);
			}
			else if(selectedColour==color.black){
				System.out.println("Available in stock. Price is "+ color.OPBlack);
			}
			else if(selectedColour==color.silver){
				System.out.println("Available in stock. Price is "+ color.OPSilver);
			}
			else {
				System.out.println("Please choose a valid colour");
			}
		}
		else if(selection == asus)  //Asus Options
		{
			System.out.println("Asus phones are available in Red(1), Black(2), Silver(3).... Select Colour");
			int selectedColour = x.nextInt();
			if(selectedColour==color.red){
				System.out.println("Out Of Stock. Coming soon... Price is "+ color.AsusRed);
			}
			else if(selectedColour==color.black){
				System.out.println("Available in stock. Price is "+ color.AsusBlack);
			}
			else if(selectedColour==color.silver){
				System.out.println("Available in stock. Price is "+ color.AsusSilver);
			}
			else {
				System.out.println("Please choose a valid colour");
			}
		}
		else {
			System.out.println("Please select a valid input between 1 to 4");
		}
		System.out.println("------------------------------------------------");

	}

}
