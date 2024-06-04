package golf;

import java.util.ArrayList;

public class Conversion {
	String Text;
    String[] strList;
    final int[] par= {4,4,3,4,5,4,5,3,4,4,3,4,5,4,3,4,5,4};
    
    
    /*
     * 入力された文字の空白を無に置き換え
     * 置き換えたものを","で区切り配列に入れる
     */
    public String[] split(String str){
        Text=str.replace(" ", "").replace("　", "");
        strList=Text.split(",");
    
            return strList;

    }
    
    
    /*
     * スコアの配列を引数として受け取り、計算して返す
     */
    public int result(ArrayList<Integer> list) {
    	int p=0;
    	for(int i=0;i<18;i++) {
    		p+=(list.get(i)-par[i]);
    	}
    	
    	return p;
    }
    
    /*
     * ポイントを引数として受け取り符号を返す
     */
    public String sign(int p) {
    	String sign;
    	if(p>0) {
    		sign="+";
    	}else if(p==0){
    		sign="+-";
    	}else {
    		sign="";
    	}
		return sign;
    }

}
