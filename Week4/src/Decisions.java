import java.util.Scanner;

public class Decisions {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		//x == y -> does x equal y
		//x != y-> is x not equal to y
		//x > y -> is x greater than y
		//x< y ->x is less than y
		// x>= y -> greater than or equal to y
		// x< = y ->less than or equal to y
		
		int x = 0;
		
		if(x % 2 == 0)
		{
			System.out.println("x is even");
		}else
		{
			System.out.println("x is odd");
		}
	
	
		if(x > 0)
		{
			System.out.println("x is positive");
		}
		else if (x >0)
			System.out.println("x is negative");
		else
		{
			System.out.println("x is zero");
		}
		System.out.println("Enter a number form 1 to 4");
		int num = input.nextInt();
		if(num == 1)
		{
			System.out.println("One");
		}else if (num == 2)
		{
			System.out.println("two");
		}else if(num == 3)
		{System.out.println("three");
		}else
			System.out.println("Four");
	
		switch(num)
		{
		case 1 :
			System.out.println("One");
			break;
		case 2 :
			System.out.println("Two");
			break;
		case 3 :
			System.out.println("Three");
			break;
		case 4 :
			System.out.println("Four");
			break;
		}
		
		String food = "Broccoli";
				
		switch(food)
		{
		case "Apple": //if (food == "Apple" || food == "Banana"|| food == "Cherry")
		case "Banana":
		case "Cherry":
			System.out.println("Fruit!");
			break;
		case "Broccoli":
		case "Carrot":
		case "Peas":
			System.out.println("Veggie!");
			break;
		}
		//if(x>0 && x<10); // number 1-9
		// x < 0 || x > 10 any not 1-9
		//!(x > 0) any negative number
		x = 0;
		int y =0;
		
		if(x == 0)
		{
			if(y ==0)
			{
				System.out.println("Both x and y are zero");
			}
		if(x == 0 && y == 0) System.out.println("Both are Zero");
		if( x== 0 || y == 0) System.out.println("Either x or y is zero");
		
		//!(a && b) is the same as !a || !b
		//!(a || b) is the same as !a && !b
		
		boolean flag;
		flag = true;
		
		System.out.println(isSingleDigit(10));
		System.out.println("enter a single digit number");
		int userNum = input.nextInt();
		if(!isSingleDigit(userNum))
		{
			System.out.println("That is not a single digit");
		}else
		{
			System.out.println("Great job!");
		}
	}
	

	}
	public static boolean isSingleDigit(int num)
	{
		return num > -10 && num < 10;
	}

}