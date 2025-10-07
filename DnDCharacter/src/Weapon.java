
public class Weapon {
	private String name;
	private int damage;
	
	
	public Weapon() {
		super();
		this.name = " ";
		this.damage = 0;
	}
	
	
	public Weapon(String name, int damage) {
		super();
		this.name = name;
		this.damage = damage;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	@Override
	public static String toString() {
		return "Weapon name: " + name + ", damage:" + damage + "]";
	}
	
	
	
	

}
