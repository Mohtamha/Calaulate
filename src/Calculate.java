
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
	
	public  String projectb() {
		String[] month = {"January","February","March","Apirll","March","June","July","August","September","October","November","Desember"};
		if(this.isOverNumber(number) == true) {
			return month[this.number];
			
		}else {
			return "invalid";
		}
			 

		}


	
}
