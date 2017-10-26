package Oct;
/**
 * 
 * @author Administrator
 * 有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子不死，问每个月的兔子对数为多少？ 兔子每月对数的规律为：1，1，2，3，5，8，13，21......
 */

public class Oct0902{
	public static void main(String[] args){
		for(int i = 1; i < 21; i++){
			System.out.println(fab(i));
		}
	}
	
	public static int fab(int i){
		int num = i;
		if(num > 2){
			return (fab(num-1) + fab(num-2));
		}else if((num == 2) | (num == 1)){
			return 1;
		}
		return 0;
	}
}
