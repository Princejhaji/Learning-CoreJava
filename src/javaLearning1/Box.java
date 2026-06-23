package javaLearning1;

public class Box {
	int height;
	int length;
	int breadth;
	
	//Contructor with parameter
	Box(int x, int y, int z){
		height=x;
		length=y;
		breadth=z;
	}
	
	//Contructor with different parameter
	Box(int x){
		height=length=breadth=x;
	}
	
	//method overloading same method name with different parameters
	void volume() {
		 System.out.println(height*length*breadth);
	}
	
	void volume(int x,int y, int z) {
		 System.out.println(x*y*z);
	}
	
	
//	public static void main(String arg[]) {
//		Box b1 = new Box(10 , 5 , 3);
//		
//		b1.volume();
//	}
//	
	

}
