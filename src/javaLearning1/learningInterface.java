package javaLearning1;
interface shape{
	static int l=100;
	static int b=103;
	static int h=392;
	
	void volume();
} 

class measurements implements shape{
	public void volume(){
		System.out.println(l*b*h);
	}
}
public class learningInterface {
	public static void main(String arg[]) {
		shape new1 = new measurements();
		new1.volume();
	}

}
