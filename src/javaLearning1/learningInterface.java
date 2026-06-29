package javaLearning1;
//this is interface with static and final variable and abstract method
//method can be implemented but the access modifier should be default
interface shape{
	static int l=100;
	static int b=103;
	static int h=392;
	
	void volume();
} 

//this is the class implementing the interface and have the implementation of the abstract method
//the default access modifier of the method is default we need to explicitly mention public

class measurements implements shape{
	public void volume(){
		System.out.println(l*b*h);
	}
}

public class learningInterface {
	public static void main(String arg[]) {
		//here the object reference is from the interface but the initialization is from the class
		shape new1 = new measurements();
		new1.volume();
	}

}
