package javaLearning1;
//

//Parent Class
class a{
	int num = 100;
	void multiWithTwo(){
		System.out.println(num*2);
	}
}

//Child Class
class b extends a{
     int num2 = 200;
     void multiWithThree() {
    	 System.out.println(num2*3);
     }
}


public class InheritanceSingleType {

	public static void main(String[] args) {
		b b1 = new b();
		b1.multiWithThree();

	}

}
