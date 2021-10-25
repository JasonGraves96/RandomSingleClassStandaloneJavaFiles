//This calculates income based on a set amount of sales


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salesAmount = 0;
		int i = 0;
		System.out.println("Sales\t\tIncome");
		computeIncome(salesAmount);
	}
	
	public static double computeIncome(double salesAmount) {
		int i = 0;
		double commission;
		for(i = 1000; i<=20000; i=i+1000) {
			commission = 0;
			
			if(i<=5000)
				commission = i * 0.08;
			
			if(i > 5000 && i <= 10000) 
				commission = ((i-5000) * 0.1) + (5000 * 0.08);
			
			if(i > 10000) 
				commission = ((i-10000) * 0.12) + (5000 * 0.1) + (5000 * 0.08);
			
			salesAmount = 5000 + commission;
			System.out.println("$"+i+"\t\t"+"$"+salesAmount);
		}
		
		return 0;
	}
}
