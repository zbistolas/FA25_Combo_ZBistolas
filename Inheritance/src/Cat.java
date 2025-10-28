
public class Cat extends Animal{
	private boolean  bobtail;
	private boolean longhair;
	
	public Cat() {
		super();
		bobtail = false;
		longhair = false;
		
	}
	public Cat(int height, double weight, String name, boolean bobtail, boolean longhair) {
		super(height, weight, name);
		this.bobtail = bobtail;
		this.longhair = longhair;
	}
	public boolean isBobtail() {
		return bobtail;
	}
	public void setBobtail(boolean bobtail) {
		this.bobtail = bobtail;
	}
	public boolean isLonghair() {
		return longhair;
	}
	public void setLonghair(boolean longhair) {
		this.longhair = longhair;
	}
	@Override
	public String makeNoise()
	{
		return "Meow-meow-meow";
	}
	@Override
	public String toString() {
		return "Cat Name: " + super.getName() + "\nHeight: " + super.getHeight() + "\nWeight: " + super.getWeight() +"\nbobtail: " + bobtail + "\nlonghair: " + longhair;
	}
	
	
	}
	
	


