package Oct;

/**
 * 
 * @author Administrator
 * ������ֲμӸ�����������10����ί��֣��Ա����ѡ�ֵ�ƽ���÷֣�ȥ��һ����߷ֺ�һ����ͷ֣�
 */

public class Oct1102 {
	public static void main(String[] args) {
		int[] sArr = new int[]{99,92,89,88,85,100,64,87,77,79};
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < sArr.length; i++){
            sum += sArr[i];
        }
        avg = (sum-maxScore(sArr)-minScore(sArr))/8;
        System.out.println("The average score is: " + avg);
	}
	
	public static int maxScore(int[] iArr){
        int len = iArr.length;
        int max = iArr[0];
        for(int i = 1; i < len; i++){
            if(max < iArr[i]){
                max = iArr[i];
            }
        }
        return max;
    }
    
    public static int minScore(int[] iArr){
        int len = iArr.length;
        int min = iArr[0];
        for(int i = 1; i < len; i++){
            if(min < iArr[i]){
                min = iArr[i];
            }
        }
        return min;
    }

}
