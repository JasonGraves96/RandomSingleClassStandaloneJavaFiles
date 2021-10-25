
import java.util.*;
//this uses an ArrayList and prints out letters in a variety of ways


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Initials = new ArrayList<String>();
		Initials.add("J");
		Initials.add("A");
		Initials.add("G");
		int i = 0;
		
		System.out.println("Initial List");
		for(i=0;i<Initials.size();i++) {
			System.out.print(Initials.get(i)+" ");
		}
		
		System.out.println("\nReversed List");
		for(i=Initials.size()-1;i>=0;i--) {
			System.out.print(Initials.get(i)+" ");	
		}
		
		System.out.println("\nCopied List");
		ArrayList<String> Copy = new ArrayList<String>();
		for(i=0;i<Initials.size();i++) {
			Copy.add(Initials.get(i));
			System.out.print(Copy.get(i)+" ");	
		}
		
		System.out.println("\nR Filled List");
		for(i=0;i<Initials.size();i++) {
			Initials.set(i, "R");
			System.out.print(Initials.get(i)+" ");	
		}
				
	}
}
