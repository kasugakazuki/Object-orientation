package ex0501;

import java.util.ArrayList;
import java.util.Random;

public class Ex {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num;
		ArrayList<Integer> even=new ArrayList<>();	//偶数
		ArrayList<Integer> odd=new ArrayList<>();	//奇数
		
		do {
			Random rand=new Random();
			num=rand.nextInt(11);
			
			System.out.println("0～10の値を出力:"+num);
			
			if(num==0) {
				continue;
			}
			
			if(num%2==0) {
				even.add(num);
			}else {
				odd.add(num);
			}
			
			
		}while(num!=0);
		
		
		System.out.print("\n偶数:");
		for(int i=0;i<even.size();i++) {
			System.out.print(even.get(i)+" ");
		}
		
		System.out.print("\n奇数:");
		for(int j=0;j<odd.size();j++) {
			System.out.print(odd.get(j)+" ");
		}

	}

}
