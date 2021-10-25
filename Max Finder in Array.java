//this calculates the max value of different arrays

package cop2805;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"Red","Green","Blue"};
		Integer[] numbers = {1, 2, 3};
		Double[] circleRadius = {3.0, 5.9, 2.9};
		
		System.out.println(max(colors));
		System.out.println(max(numbers));
		System.out.println(max(circleRadius));
	}
	public static <E extends Comparable<E>> E max(E [] list){
		int maxElement = 0;
		for(int i=1;i<list.length;i++) {
			if(list[i].compareTo(list[maxElement]) > 0)maxElement = i; 
		}
		
		return list[maxElement];
	}
	
}
