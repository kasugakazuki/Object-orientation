package omokuji;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("おみくじを引きます。");
		
		Random random=new Random();
		
		int num=random.nextInt(100)+1;
		
		if(num==1) {
			System.err.println("大吉");
		}else if(2<=num && num<=6) {
			System.out.println("中吉");
			
		}else if(7<=num && num<=26){
			System.out.println("末吉");
		}else if(27<=num && num<=56){
			System.out.println("小吉");
		}else if(57<=num && num<=91) {
			System.out.println("吉");
		}else if(92<=num && num<=99) {
			System.err.println("凶");
		}else {
			System.err.println("大凶");
		}
	}

}
