package Oct;

public class Oct1902 {
	public static void main(String[] args) {
		int[] number = {92,56,13,89,24,90,33,45,67,75};
		int len = number.length;
		int temp = 0;
		int tempK = 0;
		for(int i = 0 ; i < len ; i++) {
			temp = number[i];
			for(int j = i + 1; j < len ; j++) {
				if(temp > number[j]) {
					temp = number[j];
					tempK = j;
				}
			}
			if(temp != number[i]) {
				temp = number[i];
				number[i] = number[tempK];
				number[tempK] = temp;
			}
			System.out.print(number[i]+"\t");
		}
	}
}
