package Oct;

/**
 * 
 * @author Administrator
 * һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ�������������磺6=1+2+3 �������ҳ�1000���ڵ�������
 */

public class Oct1201 {
	public static void main(String[] args){
        int num = 2;
        int i = 1;
        int target = 0;
        for( num = 2; num < 1000; num++){
                for(i = 1; i < num; i++){
                        if(num % i == 0){
                                target += i;
                        }
                }
                if(target == num){
                        System.out.println(num);
                }
                target = 0;
        }
}

}
