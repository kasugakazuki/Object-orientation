import java.util.ArrayList;
import java.util.Random;

public class probex0501 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Random rand=new Random();
		int num;
		
		ArrayList<Integer> even=new ArrayList<>();	//偶数
		ArrayList<Integer> odd =new ArrayList<>();	//奇数
		
		do {
			
			num=rand.nextInt(11);
			System.out.println("0～10の値を出力:"+num);
			
			if((num%2)==1) {
				odd.add(num);
			}else if(num!=0){
				even.add(num);
			}
			
		}while(num!=0);
		System.out.println();
		System.out.print("偶数:");
		for(int i=0;i<even.size();i++) {
			System.out.print(" "+even.get(i));
		}
		
		//System.out.println();
		
		System.out.print("\n奇数:");
		for(int i=0;i<odd.size();i++) {
			System.out.print(" "+odd.get(i));
		}

	}

}
