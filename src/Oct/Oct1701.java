package Oct;

/**
 * 
 * @author Administrator
 * ��Ŀһ����ӡ������ͼ�������Σ�
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
