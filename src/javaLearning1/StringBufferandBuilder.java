package javaLearning1;

public class StringBufferandBuilder {
	public static void main(String[] arg) {
		//String 
		String s = "Welcome";
		System.out.println(s.concat(" to you!"));
		System.out.println(s);
		//String is immutable cannot changed but Threadsafe
		
		//StringBuilder is muttable and Thread unsafe
		StringBuilder name = new StringBuilder("Prince");
		name.append(" 2");
		name.append(" Jha");
		name.reverse();
		
		System.out.println(name);
		
		//StringBuffer is mutable and thread safe but slower
		StringBuffer hey = new StringBuffer("Hey you!");
		hey.append(" man!");
		hey.reverse();
		System.out.println(hey);
		
		//creating Char array from String
		char[] a = {'p' , 'r' , 'i' , 'n' , 'c' , 'e'};
		String name1 = new String(a);
		System.out.println(name1);
		
		
		
		
		
	}

}
