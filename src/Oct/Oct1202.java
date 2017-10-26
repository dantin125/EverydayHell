package Oct;

/**
 * 
 * @author Administrator
 * 一个球从100米的高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10落地时一共经过多少米？第十次反弹多高？
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
