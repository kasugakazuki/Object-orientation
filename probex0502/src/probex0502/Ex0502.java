package probex0502;

import java.util.ArrayList;
import java.util.Random;

public class Ex0502 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Random rand=new Random();
		
		int num;
		
		ArrayList<Integer> numlist=new ArrayList<>();
		
		do {
			num=rand.nextInt(11);
			System.out.println("0～10の値を出力:"+num);
			if(num!=0) {
				numlist.add(num);
				
			}
			
		}while(num!=0);
		
		for(int i=numlist.size()-1;i>=0;i--) {
			System.out.print(numlist.get(i)+" ");
		}

	}

}
