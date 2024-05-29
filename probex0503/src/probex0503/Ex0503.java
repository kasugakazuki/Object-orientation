package probex0503;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex0503 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final int max=9;								//一の位の数の最大値
		int num;										//ランダムで取得した値を入れる変数
		Random rand=new Random();
		List<Integer> list=new ArrayList<>();			//numを入れる配列
		
		do {
			num=rand.nextInt(101);						//0～100の乱数取得
			
			if(num!=0) {
				list.add(num);
			}
			System.out.println("0～100の値を出力:"+num);
			
			
		}while(num!=0);
		
		Collections.sort(list);							//リストの昇順
		
		for(int i=0;i<=max;i++) {
			ArrayList<Integer> numList=new ArrayList<>();	//ArrayListの生成
			for(int j=0;j<list.size();j++) {
				if(list.get(j)%10==i) {						//i=0～10のとき
					numList.add(list.get(j));				//
				}
			}
			
			System.out.print("一の位が"+i+":");
			if(numList.size()==0) {							//
				System.out.println("なし");
			}else {
				for(int k=0;k<numList.size();k++) {
					System.out.printf("%2d",numList.get(k));
					System.out.print(" ");
				}
					System.out.println();
				
			}
			
		}
		
		

	}

}
