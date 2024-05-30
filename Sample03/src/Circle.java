
public class Circle {
	
	double PI=3.14;
	
	int hankei;
	
	public void setHankei(int hankei) {
		this.hankei=hankei;
	}
	
	public double getEnsyu() {
		return hankei*2*PI;
	}
	
	public double getMenseki() {
		return hankei*hankei*PI;
	}

}
