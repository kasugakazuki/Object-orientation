package Problem1;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Conversion con=new Conversion();
        

		int falg=0;
        String strpoint;
        Scanner scanner;

        int[] num;
        int resultpoint;
        String sign;

        do {

            scanner=new Scanner(System.in);
            strpoint=scanner.nextLine();

            num=con.Convers(strpoint);
            falg=con.reflag();

        } while (falg==0);

    scanner.close();

    resultpoint=con.Result(num);

    if(resultpoint>0) {
        sign="+";
    }else if(resultpoint==0){
        sign="+-";
    }else {
        sign="";
    }

    
    System.out.println(num.length+"ホール終了して、"+sign+resultpoint);

    
    

	}

    


    
}
