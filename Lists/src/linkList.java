import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class linkList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		var nums= new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		cars.add("Ford");
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("Lexus");
		cars.add("Chevrolet");
		
		System.out.println(cars);
		System.out.println(cars.get(0));
		cars.set(0, "Opel");
		System.out.println(cars);
		//cars.removeLast();
		System.out.println(cars);
		//cars.clear();
		System.out.println(cars);
		System.out.println(nums);
		
		Collections.sort(cars);
		System.out.println(cars);
		
		/**************************************************************************************************************/
		//Linked List
		LinkedList<String>animals = new LinkedList<String>();
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Hamster");
		animals.add("Parrot");
		animals.add("Goldfish");
		animals.add("Python");
		
		System.out.println(animals);
		Collections.sort(animals, Collections.reverseOrder());// reversed sort
		System.out.println(animals);
		
		 
		 

	}

}
