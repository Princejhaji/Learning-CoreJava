package javaLearning1;

class parent12{
	String colour = "Black";
}

class child12 extends parent12{ 
   void printColour() {
	   System.out.println(super.colour);
   }
}

public class SuperLearning {
       public static void main(String arg[]) {
    	   child12 randomName = new child12();
           randomName.printColour();
       }
}
