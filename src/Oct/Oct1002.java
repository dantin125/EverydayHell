/**
 * 输入一串字符，用函数将它反转。
 */

package Oct;

import java.util.Scanner;//The String you input couldn't include space, tab or enter
import java.lang.String;

public class Oct1002{
	public static void main(String[] argw){
		System.out.println("Please input a String:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String read = scan.nextLine();
		System.out.println("What you input is: " + read);
		reverseStr(read);
	}
	
	public static void reverseStr(String str){
		int len = str.length();
		//int[] numArr = new int[10];
		//int[] numArr = {1,2,3,4,5};
		//int[] numArr = new int[]{1,2,3,4,5,6};
		char[] cr = new char[len];
		cr = str.toCharArray();
		
		System.out.println("String's length: " + str.length());
		System.out.print("The reversed string is: ");
		for(int i = len-1; i >= 0; i--){
			System.out.print(cr[i]);	
		}
		System.out.print("\n");
	}
}
