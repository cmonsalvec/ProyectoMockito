package ec.edu.espol;
public class CalService {

	public ICalculator getCal() {
		return cal;
	}
	public void setCal(ICalculator cal) {
		this.cal = cal;
	}
	ICalculator cal;
	int a;
	public int addTwoNumbers(int x, int y){
		if(x!=0){
		return cal.add(x, y);}
		else return cal.add(0, y);
	}
}