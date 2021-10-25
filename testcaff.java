import java.util.Scanner;
public class testcaff {

	

	
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	double input = scnr.nextDouble();
	double second = 1.0/12.0;
	System.out.println(second);
	double r = Math.pow(2,second);
	
	double output = 0;

	for(int n=1;n<5;n++){
	output = input * (Math.pow(r, n));
	
	System.out.printf("%.2f ",output);
	System.out.println(n);
	System.out.println(r);
	}
	System.out.println();


	      /* Type your code here. */

	   }
	}


