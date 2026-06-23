package javaLearning1;

public class StringComparison {
   public static void main(String[] arg) {
	   // == used to compare the object
	   // equals  is used to compare the value of the object
	   
	   //here both string points to same object thats why == is true
	   String s1 = "Welcome";
	   String s2 = "Welcome";
	   System.out.println(s1 == s2); //True
	   System.out.println(s1.equals(s2)); //True
	   
	   //in this case both string points to different object 
	   //thats why == is false
	   String s3 = new String("Welcome Again");
	   String s4 = new String("Welcome Again");
	   String s5 = "Welcome Again";
	   
	   System.out.println(s3 == s4); //False bcz comparing Objects
	   System.out.println(s3.equals(s4)); //True
	   System.out.println(s3 == s5); //False again diff objects
   }
} 
