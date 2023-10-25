package Com.CloudVandana;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {
	// Creating  an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffling  it. 
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		for (int i = 1; i<=7; i++ ) {
			
			number.add(i);
			 
		}
		System.out.println(" Create an array with the values "+number);
		
		//** Shuffle The Array With Values 
		 Collections.shuffle(number);
		System.out.println("Shuffled an array"+number);
		
		
		
		
	}

}
