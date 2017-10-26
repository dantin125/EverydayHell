package Oct;

public class Oct1901 {
	public static void main(String[] args) {
		String str = new String("qywer23tdqd");
		int len = str.length();
		char[] chStr = new char[len];
		char chRepeat = ' ';
		boolean isGet = false;
		for(int i = 0; i < len; i++) {
			if(isGet) {
				break;
			}
			chStr[i] = str.charAt(i);
			for(int j = 0; j < i-1; j++) {
				System.out.println(chStr[j]+"《=》"+chStr[i]);
				if(chStr[j] == chStr[i]) {
					chRepeat = chStr[i];
					isGet = true;
					break;
				}
			}
		}
		System.out.println("第一个重复的字符是: "+chRepeat);
	}
}
