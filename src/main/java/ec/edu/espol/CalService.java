package ec.edu.espol;
public class CalService {

	public ICalculator getCal() {
		return cal;
	}
	public void setCal(ICalculator cal) {
		this.cal = cal;
	}
	ICalculator cal;
	;
	int a;
	public int addTwoNumbers(int x, int y){
		return cal.add(x, y);
	}
	public int substractTwoNumbers(int x, int y){
		return cal.substract(x, y);
	}
		
}