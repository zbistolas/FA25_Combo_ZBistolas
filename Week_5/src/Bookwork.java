import java.util.Scanner;

public class Bookwork {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	int x = 10;
	if(x < 0)
	{
		System.out.println("X is positive");
	}else if(x < 0)
	{
		System.out.println("x is negative");
	}else
	{
		System.out.println("x is 0");
	}

	if(x % 2 == 0)
	{
		System.out.println("X is even");
	}else
	{
		System.out.println("X is odd");
	}
	System.out.println("enter a number between 1 and 5 ");
	int num = input.nextInt();
	String word;
	
	switch(num)
	{
		case 1:
			word = "one";
			break;
		case 2:
			word = "two";
			break;
		case 3:
			word = "three";
			break;
		case 4:
			word = "four";
			break;
		default:
			word = "unknown";
		}
		System.out.println(word);
	
	int n = 10; // intializer
	while(n > 0)//condition //when we dont know how many
	{
		System.out.println(n);
		n--;// changer
	}
	System.out.println("Blast off!!!");
	//initalizer, condition, changer all in one
	for(int i = 0; i < 10; i++)// array loop because we know exactly how many
	{
		System.out.println(i);
	}
	
	for(int i = 0; i < 10; i++)
	{
		System.out.println();
	}
	
	System.out.println("enter the number of colums for the times table");
	int cols = input.nextInt();
	
	System.out.println("enter the number of rows for the times table");
	int rows = input.nextInt();
	
	for(int i = 1; i <= rows; i++)
	{
		for(int j = 1; j <= cols; j++)
		{
			System.out.printf("%4d", (i * j));
		}
		System.out.println();
	}
	int count = 0;
	for(char c = 'A'; c <= 'z'; c++)
	{
		System.out.print(c + " ");
		count ++;
		if(count % 10 == 0) System.out.println();
	}
	System.out.println("Done");
	
}

}
