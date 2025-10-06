import java.util.Scanner;

public class N_Bottles {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("How many bottles?");
		int bottles = input.nextInt();
		
		BoB(bottles);

	}

	private static void BoB(int bottles) {
		if(bottles == 0)
		{
			System.out.println("No bottles left to grab");
			bottles =0;
			
		}
		else if(bottles ==1)
		{
			System.out.println("1 bottle beer on the wall" 
		+ " 1 bottle of beer,"
		+ " take one down and pass it around" 
		+ " 0 bottles of beer on the wall");
			BoB(bottles-1);
		}else if(bottles == 2)
		{
			System.out.println("2 bottles beer on the wall" 
			+ " 2 bottles of beer,"
			+ "take one down and pass it around" 
			+ " 1 bottle of beer on the wall");
			BoB(bottles-1);
		}else {
		System.out.println(bottles +" bottles beer on the wall" + " " 
		+ bottles + " bottles of beer,"
		+ " take one down and pass it around" + " " 
		+ (bottles - 1) +" bottle of beer on the wall");
		BoB(bottles-1);
		}
		
	}

}
