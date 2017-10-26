package Oct;

/**
 * 题目一：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和
 * 第四位交换，第二位和第三位交换。
 * 题目二：解密上述加密数字。
 * 
 */

import java.util.Scanner;
import java.lang.String;	

class Oct161and2{
	public static void main(String[] args){
		int choose = 0;
		int number = 0;
		int[] result = new int[10];
		int bit = 0;
		char[] enNum = new char[10];
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("choose a service: ");
			System.out.println("1.encrypt number\t" + "2.unencrypt number\t" + "3.exit");
			try{
				choose = scan.nextInt();
			}catch(Exception e){
				if( e != null){
					System.out.println("input error!!!!!!!");
					continue;
				}
			}
			switch (choose){
				case 1:
					System.out.print("please input a number: ");
					number = scan.nextInt();
					System.out.print("The encryped num is : ");
					result = encNum(number);
					bit = result.length;
					for(int i = bit - 1; i >= 0; i--){
						System.out.print(result[i]);
					}
					System.out.println("\n");	
					break;
				case 2:
					System.out.print("please input a encrypted number: ");
					enNum = scan.next().toCharArray();
					System.out.print("The original num is : " );
					result = unencNum(enNum);
					bit = result.length;
					for(int i = bit - 1; i >= 0; i--){
						System.out.print(result[i]);
					}
					System.out.print("\n");
					break;
				case 3:
					System.out.println("Thx for using. See you.");
					break;
				default:
					System.out.println("Warning: Input illegal! Please carefully make your choice!");
					break;
			}
		}while(choose != 3);
		
		
	}
	
	//encrypt
	public static int[] encNum(int num){
		int bit = bitOfNum(num);
		int target = num;
		int[] code = new int[bit];
		for(int i = 0; i < bit; i++){
			code[i] = target%10;
			target /= 10;
		}
		for(int i = 0; i < bit; i++){
			code[i] = (code[i]+5)%10;
		}
		switchNum(code);
		return code;
	}
	
	//unencrypt
	public static int[] unencNum(char[] num){
		int bit = num.length;
		int[] code = new int[bit];
		for(int i = 0; i < bit; i++){
			code[i] = (int)num[i];
			code[i] -= 48;
		}
		switchNum(code);	
		for(int i = 0; i < bit; i++ ){
			if(code[i] >= 0 && code[i] <=4){
				code[i] = code[i] + 5;
			}else{
				code[i] = code[i] - 5;
			}
		}
		return code;
	}
	
	//how many bits of the Int
	public static int bitOfNum(int num){
		int i = 1;
		while(num/10 != 0){
			i++;
			num = num/10;
		}
		return i;
	}
	
	//switch bit 
	public static void switchNum(int[] num){
		int len = num.length;
		for(int i = 0; i < len/2; i++){
			int temp = num[i];
			num[i] = num[len-1-i];
			num[len-1-i] = temp;
		}
	}
}