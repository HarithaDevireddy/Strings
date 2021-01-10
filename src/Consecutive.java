/**
* Create a method that accepts a number and modifies it 
 *such that the each of the digit in the newly formed number is equal 
 *to the difference between two consecutive digits in the original number. 
 *The digit in the units place can be left as it is.
 @author Haritha
 */
public class Consecutive {
public static void main(String[] args) {
		

		int no = 45862;
		String str=String.valueOf(no);
		int len=str.length()-1;
		for(int i=0;i<len;i++) {
		int digit=str.charAt(i)-str.charAt(i+1);
		if(digit>=0)
			
			System.out.print(digit);
		else {
			System.out.print(digit*-1);
			
		}
	
			
		}
		if(str.charAt(len)-str.charAt(0)>=0) {
		System.out.print(str.charAt(len)-str.charAt(0));
		}
		else {
			System.out.print((str.charAt(len)-str.charAt(0))*-1);
		}
		
		
	}

}
