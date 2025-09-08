
public class BookWork {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello");
			newLine();
			System.out.println("Cruel");
			threeLines();
			System.out.println("World!");
			
			print("Hello Wolrd");
			printN("Hello", 3);
			int hour = 9;
			int minute = 28;
			printTime(hour, minute);
			
			double root = Math.sqrt(17.0);
			double angle = 1.5; 
			double height = Math.sin(angle);
			newLine();
			System.out.println(root + " " + height);
			System.out.println(Math.toDegrees(Math.PI));
			System.out.println(Math.cos(angle + Math.PI / 2.0));
			String name = "Zach";
			String starName = starFiller(name);
			print(starName);
	}		
			private static void print(String string) {
		// TODO Auto-generated method stub
		
	}
			private static String starFiller(String name) {
		String ret = "";
		
		for(int i = 0; i < name.length(); i++)
			ret+= "*" + name.charAt(i);
		ret+= "*";
		return ret;
	}
			private static void printN(String s, int num) {
				for(int i = 0; i < num; i++)
				{
					System.out.println();
			}
	}
		
	

	private static void printTime(int h, int m) {
		System.out.print(h);
		System.out.print(":");
		System.out.print(m);
	}

	private static void threeLines() {
		System.out.println();
		System.out.println();
		System.out.println();}
		
		public static void newLine()
		{
			System.out.println();
		}
	}


