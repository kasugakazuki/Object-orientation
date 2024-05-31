package Problem1;
//import java.util.*;

public class Conversion {

    int fl=0;

    String text;

    String[] strnum;
    int[] intnum; 

    public int[] Convers(String str){

        text=str.replace(" ", "").replace("　", "");
        strnum=text.split(",");

        try {
						
            for(int i=0;i<strnum.length;i++){
                intnum[i]=Integer.parseInt(strnum[i]);

                if(0<intnum[i]){
                    fl=1;
                }else {												//0未満の場合 flag=0で無効な入力
                    fl=0;
                    System.out.println("0またはマイナスの値は無効な入力です");
                    break;
                }
            }
        }catch(NumberFormatException e) {							//文字を数値に変換した時のエラー取得
				
			fl=0;
			System.out.println("空文字または文字は無効な入力です");	//flag=0で無効な入力
				
		}

        return intnum;
    }

    public int reflag(){
        return fl;

    }

    public int Result(int[] num){
        final int[] par= {4,4,3,4,5,4,5,3,4,4,3,4,5,4,3,4,5,4};
        int numsize=num.length;
        if(numsize>18){
            numsize=18;
        }

        int ResultPoint=0;

        for(int i=0;i<numsize;i++){
            ResultPoint+=num[i]-par[i];
        }

        return ResultPoint;
    }

    
}
