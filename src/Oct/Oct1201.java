package Oct;

/**
 * 
 * @author Administrator
 * 一个数如果恰好等于它的因子之和，这个数就称为”完数“。例如：6=1+2+3 。请编程找出1000以内的完数。
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
