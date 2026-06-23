package javaLearning1;

public class countDigitNumber {
   static int countDigits(int num) {
	   int count = 0;
	   
	   while(num != 0) {
		   num = num/10;
		   count++;
	   }
	   return count;
   }
   
   public static void main(String[] arg) {
	   System.out.print(countDigits(120021210));
   }
}
