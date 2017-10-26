package Oct;

/**
 * Check flower numbers
 * 
 * ˮ�ɻ�����һ���������λ���������ص���ǣ�ÿ����λ�������ͣ�����������
 * ����153����ˮ�ɻ�������Ϊ��
 * 1^3+5^3+3^3 = 153
 * ���ҳ�100~999֮��ˮ�ɻ�����
 * 
 */
public class Oct1001{
	public static void main(String[] args){
		int i = 0;
		int count = 0;
		
		/*It works
		 *int num = 0;
		  int rest = 0;
		  int sum = 0;
		  int end = 0;
		 *for(i = 100; i < 1000; i++){
			num = i;
			while(num%10 != 0){
				rest = num % 10;
				sum += rest*rest*rest;
				num = num/10;
			}
			if(sum == i){
				System.out.println(i);
				count++;
			}
			sum = 0;
		}*/
		
		for(i = 100; i < 1000; i++){
			if(checkFlow(i)){
				System.out.println(i);
				count++;
			}else{
				continue;
			}
		}
			
		//end = i%10;
		/*while(i%10 != 0){
				rest = i % 10;
				sum += rest*rest;
				i = i/10;
				//end = i%10;
				System.out.print(rest + "\t");
				System.out.println(i);
			}*/
		System.out.println("Total count: " + count);
	}
	

	public static int bitNum(int num){
		int i = 0;
		while(num%10 != 0){
			i++;
			num = num/10;
		}
		return i;
	}

	public static boolean checkFlow(int num){
		int bit = bitNum(num);
		int target = num;
		int numRest = 0;
		int sum = 0;
		for(int i = 0; i < bit; i++){
			numRest = target%10;
			sum += numRest*numRest*numRest;
			target = target/10;
		}
		if(sum == num){
			return true;
		}else{
			return false;
		}
	}
}