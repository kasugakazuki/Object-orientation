package hashset;

import java.util.HashSet;
import java.util.Set;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		

Set<String> animals = new HashSet<String>();

    animals.add("ぬ");
    animals.add("の");
    animals.add("へ");
    animals.add("ん");

System.out.println("動物は" + animals.size() + "種類です"); //動物は3種類です
	
	for(String s:animals) {
		System.out.println(s+" ");
	}

	}

}
