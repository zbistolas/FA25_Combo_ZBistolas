
public class Dog extends Animal {
	private String breed;
	private String color;
	
	
	public Dog() {
		super();
		breed = "none";
		color = "black";
		
		
	}
	public Dog(int height, double weight, String name, String breed, String color) {
		super(height, weight, name);
		this.color = color;
		this.breed = breed;
		
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String makeNoise()
	{
		return "Woof- woof-woof";
	}
	@Override
	public String toString() {
		return "Dog :" + breed + "\ncolor: " + color + "\nheight: " + super.getHeight() + "\nWeight: " +super.getWeight() + "\nName: " + super.getName();
	}
	
	
}
