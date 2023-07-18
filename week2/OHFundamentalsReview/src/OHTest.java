import java.util.ArrayList;
import java.util.Arrays;

public class OHTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// loops
		
		/*
		 * Iterating through a list
		 * adding to a counter
		 * sum of numbers
		 * average
		 * while -> keep a program running 
		 *  */
		
		// Declaring a variable -> datatype name of variable = value;
		int[] nums = new int[10];
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Rindy");
		names.add("Adrian");
		names.add("Shaun");
		names.add("Stephanie");
		names.add("Sarah");
		
		
		// for key word (start, end condition, )
		for (int i=1; i<=20; i++) {
				System.out.println(i);
				doIt();
		}
		
		// looping through a fixed array -> 10
		for (int i=0; i< nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		// looping through an ArrayList
		for (int i=0; i< names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		
		
	}
	public static void doIt() {
		System.out.println("Looping again");
	}
	

}
