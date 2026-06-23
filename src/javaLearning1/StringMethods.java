package javaLearning1;

public class StringMethods {
  public static void main(String arg[]) {
	  //concat() Joining Multiple Strings
	  String s = "Hello";
	  String h = "World!";
	  String g = "   and you";
	  
	  System.out.println(s.concat(" "+h).concat(" "+g));
	  
	  //trim() remove all the spaces from right and left 
	  System.out.println(g.trim());
	  
	  //CharAt() print the character based on the index of the string
	  
	 System.out.println(h.charAt(0));
	  
  }
}
