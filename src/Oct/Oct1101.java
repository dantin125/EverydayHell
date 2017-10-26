package Oct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * @author Administrator
 * 查找字符串中出现次数最多的字符和次数
 *  例如：sdddrtkjsfkasjdddj中出现最多的字符是d,出现了6次
 *  
 */

public class Oct1101{
	public static void main(String[] args){
		Collection<CountChar> cll = new ArrayList<>();
		Collection<CountChar> cll1 = new ArrayList<>();
		String str = "sdddrtkjsfkasjdddj";
		int len = str.length();
		int count = 0;
		char c = ' ';
		CountChar cc = new CountChar();
		for(int i = 0; i < len; i++) {
			cc = new CountChar(0, str.charAt(i));
			cll.add(cc);
		}
		for(int i = 0; i < len; i++) {
			Iterator<CountChar> ite = cll.iterator();
			while(ite.hasNext()) {
				cc = ite.next();
				if(cc.getCh() == str.charAt(i)) {
					cc.setCount(cc.getCount()+1);
					cll1.add(cc);
				}
			}
		}
		for(CountChar cc1 : cll1) {
			if(count < cc1.getCount()) {
				count = cc1.getCount();
				c = cc1.getCh();
				System.out.println("数目："+count+"字符:"+c);
			}
		}
		System.out.println("最经常出现的字母是："+c+"\t出现的次数是："+count);
	}
					
}

class CountChar{
	private int count;
	
	private char ch;
	
	public CountChar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CountChar(int count, char ch) {
		super();
		this.count = count;
		this.ch = ch;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	@Override
	public String toString() {
		return "CountChar [count=" + count + ", ch=" + ch + "]";
	}
}