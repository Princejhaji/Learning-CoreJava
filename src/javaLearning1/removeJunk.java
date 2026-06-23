package javaLearning1;

public class removeJunk {
         static String removeJunk(String str) {
        	 String New = str.replaceAll("[^a-zA-Z0-9]" , "");
        	 return New;
         }
         static String removeWhiteSpaces(String str) {
        	 String New = str.replaceAll(" ", "");
        	 return New;
         }
public static void main(String[] arg) {
        	 String junk = "@$!$  STring  Bba@!";
        	 System.out.println(removeJunk(junk));
        	 System.out.println(removeWhiteSpaces(junk));
         }
         
}
