package Oct;

public class Oct1802 {
	public static void main(String[] args) {
		int count = 0;
		int num3 = 0;
		for(int i = 1; i < 5; i++) {
			for(int j = 1;j < 5; j++) {
				for(int k = 1;k < 5; k++) {
					count++;
					num3 = 100*i+10*j+k;
					System.out.println(num3);
				}
			}
		}
		System.out.println("共计"+count+"个三位数");
	}
}
