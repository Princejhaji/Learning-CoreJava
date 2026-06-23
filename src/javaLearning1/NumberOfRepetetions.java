package javaLearning1;

public class NumberOfRepetetions {
	static int NumberOfrepeats(int arr[] , int target) {
		int count = 0;
		int useless = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				count++;
			}
			else {
				useless++;
			}
			}
		
		
		  return count;
		}
	
	 public static void main(String arg[]) {
		 int arr[] = {1 , 2 , 3, 5, 6, 3, 2, 3, 4, 2};
		 System.out.println(NumberOfrepeats(arr,4));
	 }
	}


