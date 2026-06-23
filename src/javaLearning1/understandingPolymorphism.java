package javaLearning1;

public class understandingPolymorphism {
	int a;
	int b;
	
	understandingPolymorphism(int x , int y){
		a=x;
		b=y;
	}
	
	void sum() {
		System.out.println(a+b);
	}
	public static void main(String arg[]) {
		understandingPolymorphism mb = new understandingPolymorphism(10, 20);
		mb.sum();
	}
	

}
