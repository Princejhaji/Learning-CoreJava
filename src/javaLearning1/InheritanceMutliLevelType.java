package javaLearning1;

//Example of the MultiLevel Inheritance
class parent1 {
	int num1= 100;
	void multiWithTwo() {
		System.out.println(num1*2);
	}
}

class parent2 extends parent1{
	int num2 = 200;
	void multiWithThree() {
		System.out.println(num2*3);
	}
}

class parent3 extends parent2{
	int num3 = 300;
	void multiWithFour() {
		System.out.println(num3*4);
	}
}

public class InheritanceMutliLevelType {
   public static void main(String[] arr) {
	   parent3 baby = new parent3();
	   baby.multiWithTwo();
   }
}
