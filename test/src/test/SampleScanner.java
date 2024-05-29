package test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SampleScanner {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("尾坪", "070-1580-6276");	
		map.put("春日", "080-7343-0398");
		map.put("春日", "123");				//置換
		
		map.replace("春日","デルミン");		//
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("誰か入力してください。\n>");
		
		String input=scanner.nextLine();
		
		String num=map.get(input);
		
		System.out.println(num+"\n");
		
		Set<String> keys=map.keySet();
		
		for(String key:keys) {
			System.out.println(key);
		}
		
	}
	
	
}
