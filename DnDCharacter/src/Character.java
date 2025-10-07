
public class Character {
	private int health;
	private String name;
	private int power;
	private int armor;
	private Weapon weapon;
	
	//default constructor
	public Character() {
		super();
		this.health = 0;
		this.name = "";
		this.power = 0;
		this.armor = 0;
		
	}
	
	//fields constructor
	public Character(int health, String name, int power, int armor) {
		super();
		this.health = health;
		this.name = name;
		this.power = power;
		this.armor = armor;
		
		
		
	}
	public Character(int health, String name, int power,
			int armor, String wName, int wDamage) {
		super();
		this.health = health;
		this.name = name;
		this.power = power;
		this.armor = armor;
		this.weapon= new Weapon(wName, wDamage);
		
	}
	public Weapon getWeapon()
	{
		return weapon;
	}
	public void setWeapon(int damage, String name)
	{
		this.weapon = new Weapon(name, damage);
	}

	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	@Override
	public String toString() {
		return "Character: " + name +"\nHP: " +health +
				", name=" + name + ", power=" + power +
				", armor=" + armor + weapon;
	}
	
	

}
