package Oct;

/**
 * 
 * @author Administrator
 * һ�����100�׵ĸ߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������ڵ�10���ʱһ�����������ף���ʮ�η�����ߣ�
 */

public class Oct1202 {
	public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            System.out.println(i + "time:" + bounce(i) + "\t Total height: " + sumBounce(i));
        }
    }
    
    public static float sumBounce(int num){
        float sum = 100f;
        if(num ==1){
            return sum;
        }
        for(int i = 1; i <= num; i++){
            sum += bounce(i-1)*2;
        }
        return sum;
    }
    
    public static float bounce(int num){
        float high = 100f;
        for(int i = 1; i <= num; i++){
            high = high/2;
        }
        return high;
    }

}
