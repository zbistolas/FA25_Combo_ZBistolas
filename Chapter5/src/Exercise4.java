import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 7: ");
		int dayNumber = input.nextInt();
		getWeekDay(dayNumber);
		if(dayNumber <1 || dayNumber > 7)
		{
			System.out.println("Invalid number, please retry");
		}else
		{
			String dayName = getWeekDay(dayNumber);
		System.out.println("The day is: " + dayName); 
		}

	}

	private static String getWeekDay(int number) {
		String day = null;
		switch (number) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day= "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday!";
			break;
		case 7:
			day = "Saturday";
			break;
		
	}
		return day;
		
	}
}


