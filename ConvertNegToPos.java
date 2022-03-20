package week1.day1;

public class ConvertNegToPos {

	public static void main(String[] args) {
	
		int num = -40;
		System.out.println(num + " is a negative number");
		
		if(num<0) 
			num = num * -1;
		{
			System.out.println("Converted to the positive number "+ num);
		}
		
	}

}
