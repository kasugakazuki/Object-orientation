import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Player {

    Conversion con=new Conversion();

    String str;
    int flag=0;
    String[] strList;
    int num;
    ArrayList<Integer> numList=new ArrayList<>();
    ArrayList<Integer> player1=new ArrayList<>();
    ArrayList<Integer> player2=new ArrayList<>();
    HashMap<String,ArrayList<Integer>> hMap=new HashMap<String, ArrayList<Integer>>();
    
    Scanner scanner;
    
    public HashMap<String,ArrayList<Integer>> scan(){

        do{
            scanner=new Scanner(System.in);
            str=scanner.nextLine();
            strList=con.split(str);

            try{
                if(!(strList.length==38)){
                    flag=0;
                    System.out.println("正しい個数入力してください");
                }else{
                    for(int i=0;i<36;i++){
                        numList.add(Integer.parseInt(strList[i+2])); 
                        if(0<numList.get(i)){
                            flag=1;
                        }else{
                            flag=0;
                            System.out.println("0より大きい整数を入力してください");
                            
                            break;
                        }
                    }
                }

            }catch(NumberFormatException e){
                flag=0;
                System.out.println("スコアの文字入力は無効です");
            }

        }while(flag==0);
        
        scanner.close();

        for(int i=0;i<18;i++){
            player1.add(numList.get(i));
        }
         
        for(int j=18;j<36;j++){
            player2.add(numList.get(j));
        }

        

        hMap.put(strList[0],player1);
        hMap.put(strList[1],player2);


        return hMap;
        
    }



}
