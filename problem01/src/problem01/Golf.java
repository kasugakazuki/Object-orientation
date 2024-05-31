package problem01;

import java.util.Scanner;

public class Golf {
	
	String[] num;														//","でわけた後の配列
	
	public void pointIn() {												//標準入力
		
		String strpoint;												//入力したやつ
		int flag=1;														//有効な入力
		
		Scanner scanner;
		
		do {
			scanner=new Scanner(System.in);
			strpoint=scanner.nextLine();
			
			strpoint=strpoint.replace(" ", "").replace("　", "");		//文字列の空白を消す
			num=strpoint.split(",");									//","でわけてnum配列に入れる
			
			try {
						
				for(String n:num) {										//num配列から一つずつ取り出して数値に変換
					int strnum;
					strnum=Integer.parseInt(n);
					
					if(0<strnum) {										//0以上の場合 flag=1で有効な入力
						flag=1;
						
					}else {												//0未満の場合 flag=0で無効な入力
						flag=0;
						System.out.println("0またはマイナスの値は無効な入力です");
						break;
					}
				}
				
			}catch(NumberFormatException e) {							//文字を数値に変換した時のエラー取得
				
				flag=0;
				System.out.println("空文字または文字は無効な入力です");	//flag=0で無効な入力
				
			}
			
			//scanner = null;												//scannerのインスタンスにnullに代入

		}while(flag==0);												//flag=1　有効な入力になったらループ終わり
		
		scanner.close();
	}
	
	public void Results() {												//結果表示
		final int[] par= {4,4,3,4,5,4,5,3,4,4,3,4,5,4,3,4,5,4};			//18ホールのparの数
		
		int numsize=num.length;
		
		if(num.length>18) {
			numsize=18;
		}
		
		int ResultsPoint=0;
		int point;
		int max;
		String sign;
		
		if(numsize<19) {
			max=numsize;
		}else {
			max=18;
		}
		
		for(int i=0;i<max;i++) {
			point=(Integer.parseInt(num[i]))-par[i];
			ResultsPoint+=point;
		}
		
		if(ResultsPoint>0) {
			sign="+";
		}else if(ResultsPoint==0){
			sign="+-";
		}else {
			sign="";
		}
		
		System.out.println(numsize+"ホール終了して、"+sign+ResultsPoint);
		
		
	}
	

}
