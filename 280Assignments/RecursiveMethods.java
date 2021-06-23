import java.util.Arrays;

public class RecursiveMethods {

		
			public static void main(String[] args) {
				
			    int[] arr = { 1, 2, 3, 4, 5, 8, 9 };
				
			    System.out.println( " The minimum is " + findMin(arr));
			   
			    
			    int n = 3;
			
			    int sumN = sum(n);
			
			    System.out.println( " The sum is " + sumN);
			   
			    int[] reversed = reverse(arr);
		        System.out.println("The reverse is " + Arrays.toString(reversed));
		        
		        char p[] = {'M', 'O', 'O','M'};
		           
		        
		        
		        System.out.println("This is a palindrome. " + isPalindrome(p));
		    }
			
			
			
			//Finding Minimum Methods
			   public static int findMin(int[] a) {
			    if (a.length == 1) {
			      return a[0];

			    }
			    int[] b = new int[a.length - 1];
			    for (int i = 1; i < a.length; i++) {
			      b[i - 1] = a[i];
			    }
			    if (a[0] < findMin(b)) {

			      return a[0];
			    }
			    return findMin(b);
			  }

			   
			   
			  //Sum Method  
			public static int sum(int n) {
			if ( n == 0){
			  return 0;
			}
			return n + sum(n-1);
			  }

			
			
			//Reverse Method
			 public static int[] reverse(int[] arr){
				 if (arr.length == 1) {
				      return arr;

				    }
				 // remove first element   
			        int first = arr[0];
			        int[] list = Arrays.copyOfRange(arr, 1, arr.length);

			        //Calling Function Recursively get reversed array
			        int[] returnArr = reverse(list);

			        //Add original first to the last of the arrayToReturn
			        returnArr = Arrays.copyOf(returnArr, returnArr.length + 1);
			        returnArr[returnArr.length - 1] = first;

			        return  returnArr;
			    }
					
			//Palindrome or not
					static boolean isPalindrome(char a[]){
						
						if(a.length == 0 || a.length == 1){
							//System.out.print("here");
							return true;
						}
						if (a[0] == a[a.length-1]){
						
							char[] p =   Arrays.copyOfRange(a, 1, a.length-1);
							return true && isPalindrome(p);
						}
						else {
						return false;
						}}
					}
				
			 
			 
			 
			



				    

			

