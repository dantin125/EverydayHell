package Oct;

import java.util.Scanner;

public class Oct1801 {
	public static void main(String[] args) {
		int num = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if(checkLoopNum(num)) {
			System.out.println("输入的整数" +num+"是回数");
			
		}else {
			System.out.println("输入的整数" +num+"不是回数");
		}
	}
	
	public static boolean checkLoopNum(int num) {
		int target = num;
		int[] numLoop = new int[5];
		boolean isLoop = true;
		for(int i = 0; i < 5; i++) {
			numLoop[i] = target%10;
			System.out.println(numLoop[i]);
			target /= 10;
		}
		for(int i = 0; i < 5; i++) {
			if(numLoop[i] != numLoop[4-i]){
				isLoop = false;
				break;
			}
		}
		return isLoop;
	}
}
