package exercise3;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		int sum = 0;
		int lowerbound = 1;
		int upperbound = 100;
		
		for (int number = lowerbound; number <= upperbound; ++number) {
			sum = sum + number;
		}
        double Sum = sum ;
		double average = (Sum/100);
        System.out.println("The sum of 1 to 100 is:" + Sum);
        System.out.println("Average:" + average);
        
        printWhileDoLoop();
        printDoWhileLoop();
	}
     private static void printWhileDoLoop() {
    	 int sum = 0;
 		int lowerbound = 1;
 		int upperbound = 100; 
 		
 		while(lowerbound <= upperbound) {
 			sum = sum + lowerbound;
 			lowerbound++;
 		}
 		double Sum = sum;
 		double average = (Sum/100);
        System.out.println("Sum from 1 to 100 is:" + Sum);
        System.out.println("Average is:" + average);
     }
     private static void printDoWhileLoop() {
    	 int sum = 0;
  		int lowerbound = 1;
  		int upperbound = 100;
  		
  		do {
  			sum = sum + lowerbound;
 			lowerbound++;
  		}
  		while(lowerbound <= upperbound);
  		
  		double Sum = sum;
 		double average = (Sum/100);
        System.out.println("The sum from 1 to 100 is:" + Sum);
        System.out.println("The average is:" + average);

	}

}
