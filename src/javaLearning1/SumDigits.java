package javaLearning1;

public class SumDigits {
    static int sumOfDigits(int num) {
    	 int sum = 0;
    	 while(num != 0) {
    		 int lastDigit = num % 10;
    		 sum = sum + lastDigit;
    		 num = num / 10;
    	 }
    	 return sum;
    }
    
    public static void main(String[] arg) {
    	System.out.print(sumOfDigits(15119));
    }
}
