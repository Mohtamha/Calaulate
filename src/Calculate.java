
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
	
	public String projectA() {
		String[] name = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		if(this.isOverNumber(number) == true) {
			return name[this.number];
		}else {
			return "error";
		}
		
		
	}
	
}
