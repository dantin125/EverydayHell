package Oct;

/**
 * 
 * @author Administrator
 * �ж�101��200֮���ж��ٸ���������һһ�оٳ���
 */

public class Oct0901{
	public static void main(String[] args){
                int num = 101;
                int i = 0;
                int count = 0;
                boolean isTrue = true;
                for (num = 101; num <= 200; num++){
                        for(i = 2; i < num/2; i++){
                                if(num%i == 0) {
                                isTrue = false;
                                break;
                                }
                        }
                        if(isTrue){
                                System.out.println(num);
                                count++;
                        }
                        isTrue = true;
                }
                System.out.println("Total num: "+count);
        }
}
