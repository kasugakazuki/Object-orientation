import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


/*
 * 2024年6月3日
 * まあまあ終わったけどわざと入力間違えてから正しい入力をするとスコアがおかしくなる
 * あとマイナスの値を入力すると無限ループ!!!
 * 明日の私頑張ってね!!!
 * by昨日の私
 */


public class Main {
    
    public static void main(String[] args) {
    	
    	Conversion con=new Conversion();

        HashMap<String,ArrayList<Integer>> HM=new HashMap<String, ArrayList<Integer>>();
		
        ArrayList<String> strList=new ArrayList<>();
        ArrayList<Integer> pl1=new ArrayList<>();
        ArrayList<Integer> pl2=new ArrayList<>();
        Player pl=new Player();
        HM=pl.scan();
        
       
        Set<String> keys=HM.keySet();
        
        for(String Key:keys) {
        	//System.out.println("key:"+Key);
        	//System.out.println(HM.get(Key));
        	strList.add(Key);
        	
        }
        

        pl1=HM.get(strList.get(0));
        pl2=HM.get(strList.get(1));
        
        System.out.print(strList.get(1)+":");
        for(int i=0;i<18;i++) {
        	System.out.printf("%3d",pl2.get(i));
        	//System.out.print(pl2.get(i));
        }
        System.out.print("\n");
        
        System.out.print(strList.get(0)+":");
        for(int i=0;i<18;i++) {
        	System.out.printf("%3d",pl1.get(i));
        	//System.out.print(pl1.get(i));
        }
        System.out.print("\n");
        
        
        System.out.println(strList.get(1)+": "+con.result(pl2));
        System.out.println(strList.get(0)+": "+con.result(pl1));
        
        //System.out.println(strList.get(1)+con.result(pl2));
        //System.out.println(strList.get(0)+con.result(pl1));
        
        
        if(con.result(pl1)==con.result(pl2)) {
        	System.out.println("引き分け!!");
        }
        else if(con.result(pl1)>con.result(pl2)) {
        	System.out.println(con.result(pl2)+"点で"+strList.get(1)+"の勝利!!");
        	
        }else {
        	System.out.println(con.result(pl1)+"点で"+strList.get(0)+"の勝利!!");
        }
        
        

	}
}
