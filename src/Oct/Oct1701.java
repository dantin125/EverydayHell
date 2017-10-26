package Oct;

/**
 * 
 * @author Administrator
 * 题目一：打印出如下图案（菱形）
          *
         ***
        *****
       *******
        *****
         ***
          *

 */

public class Oct1701 {
	public static void main(String[] args) {
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("*******");
		System.out.println(" *****");
		System.out.println("  ***");
		System.out.println("   *");
	}
	
	public static void printStar(int spaceNum, int starNum) {
		for(int i = 0; i < spaceNum; i++) {
			System.out.print(" ");
		}
		for(int i = 0; i < starNum; i++) {
			System.out.print("*");
		}
	}
}
