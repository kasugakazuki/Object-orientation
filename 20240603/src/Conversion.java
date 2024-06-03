import java.util.ArrayList;

public class Conversion {
    String Text;
    String[] strList;
    final int[] par= {4,4,3,4,5,4,5,3,4,4,3,4,5,4,3,4,5,4};
    
    
    public String[] split(String str){
        Text=str.replace(" ", "").replace("　", "");
        strList=Text.split(",");
    
            return strList;

    }
    
    public int result(ArrayList<Integer> list) {
    	int p=0;
    	for(int i=0;i<18;i++) {
    		p+=(list.get(i)-par[i]);
    	}
    	
    	return p;
    }

    
}
