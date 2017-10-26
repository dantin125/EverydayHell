package Oct;

/**
 * 
 * @author Administrator
 * 青年歌手参加歌曲大奖赛，有10个评委打分，试编程求选手的平均得分（去掉一个最高分和一个最低分）
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
