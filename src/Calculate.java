
public class Calculate {

	public int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isOverNumber(int number) {
		if(number >=0 && number<= 9) {
			return true;
		}else {
			return false;
		}
	}
	
}
