package testestest;

public class Main {
	
	public static void main(String[] args) {
		
		TestClass c=new TestClass("derumin");
		
		String str1=c.name;
		
		String str2=c.testMethod();
		
		System.out.println(str1+str2);
		
	}	

}
