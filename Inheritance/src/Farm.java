
public class Farm {

	public static void main(String[] args) {
		Animal [] farm = new Animal [3];
		
		
		
		farm[0] = new Animal(66, 24, "Jasper");
		//System.out.println(ani);
		farm[1] = new Dog(71, 69, "Fido", "German Shepard", "tan-black");
		//System.out.println();
		//System.out.println(dog);
		farm[2] = new Cat(15, 15, "Fluffy",false, false);
		//System.out.println(dog.makeNoise());
		//System.out.println();
		//System.out.println(cat);
		//System.err.println(cat.makeNoise());
		for(Animal ani : farm)
		System.out.println(ani);
		
		System.out.println();
	}

}
