
public class ThreadTest02 {

	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
		
		Thread t1=new MyThread();
		t1.start();
		
		t1.join();
		
		System.out.println("t1のスレッドが終了しました。");

	}

}
