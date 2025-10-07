import java.util.Scanner;

public class Character_Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your characters name?");
		String name = input.next();
		
		System.out.println("How many hit points?");
		int hp = input.nextInt();
		
		System.out.println("How much power?");
		int power = input.nextInt();
		
		System.out.println("What is thir armor class?");
		int ac = input.nextInt();
		
		System.out.println();
		
		;
		
		Character zach = new Character(hp, name, power, ac);
		Character monster = new Character();
		
		monster.setName("Bugaboo");
		monster.setPower(40);
		monster.setHealth(80);
		monster.setArmor(10);
		
		
		System.out.println(zach.toString());
		System.out.println(monster.toString());
		System.out.println(Weapon.toString());
		System.out.println("\n" + monster);
		Weapon ax = new Weapon("axe", 28);
		System.out.println(ax);
		
		zach.setWeapon(35, "Long_Sword");
		monster.setWeapon(25, "Claws");
		
		Character harpy = new Character(100, "Harpy", 75, 25, "Talons", 35);

	}

}
