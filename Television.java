package television;

public class Television {
	
	int channelNo;
	
	void setChannel(int newChannelNo) {
		channelNo=newChannelNo;
	}
	
	void dispChannel() {
		System.out.println("現在のチャンネルは"+channelNo+"です。");
		
	}
	

}
