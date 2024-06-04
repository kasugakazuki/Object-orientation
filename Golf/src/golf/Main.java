package golf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Conversion con=new Conversion();

        HashMap<String,ArrayList<Integer>> HM=new HashMap<String, ArrayList<Integer>>();
		
        ArrayList<String> strList=new ArrayList<>();
        ArrayList<Integer> pl1=new ArrayList<>();
        ArrayList<Integer> pl2=new ArrayList<>();
        Player pl=new Player();
        HM=pl.scan();
        
       
        Set<String> keys=HM.keySet();
        
        for(String Key:keys) {
        	
        	strList.add(Key);
        	
        }
        
        pl1=HM.get(strList.get(0));
        pl2=HM.get(strList.get(1));
        
        System.out.print(strList.get(1)+":");
        for(int i=0;i<18;i++) {
        	System.out.printf("%3d",pl2.get(i));
        	
        }
        System.out.print("\n");
        
        System.out.print(strList.get(0)+":");
        for(int i=0;i<18;i++) {
        	System.out.printf("%3d",pl1.get(i));
        	
        }
        System.out.print("\n");
        
        System.out.println(strList.get(1)+": "+con.sign(con.result(pl2))+con.result(pl2));
        System.out.println(strList.get(0)+": "+con.sign(con.result(pl1))+con.result(pl1));
        
        if(con.result(pl1)==con.result(pl2)) {
        	System.out.println("引き分け!!");
        }
        else if(con.result(pl1)>con.result(pl2)) {
        	System.out.println(con.sign(con.result(pl2))+con.result(pl2)+"点で"+strList.get(1)+"の勝利!!");
        	
        }else {
        	System.out.println(con.sign(con.result(pl1))+con.result(pl1)+"点で"+strList.get(0)+"の勝利!!");
        }

	}

}
