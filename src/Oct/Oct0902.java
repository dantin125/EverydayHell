package Oct;
/**
 * 
 * @author Administrator
 * ��һ�����ӣ��ӳ��������������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ�
 * �������Ӳ�������ÿ���µ����Ӷ���Ϊ���٣� ����ÿ�¶����Ĺ���Ϊ��1��1��2��3��5��8��13��21......
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
