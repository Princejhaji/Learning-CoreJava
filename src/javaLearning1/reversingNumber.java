package javaLearning1;

public class reversingNumber {
	static int reverseNumber(int num) {
		int reverse = 0;
		
	    while(num != 0) {
	    	int lastDigit = num%10;
	    	reverse = (reverse*10) + lastDigit;
	    	num = num/10;
	    	
	    }
	    return reverse;
	}
	
	public static void main(String arg[]) {
		System.out.print(reverseNumber(13232));
	}
	

}
