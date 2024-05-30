
public class Calculator {
	
	double tax;
	
	public void setTax(double tax) {
		this.tax=tax;
	}
	
	public int calc(int price) {
		return (int) (price*(1+tax));
	}

}
