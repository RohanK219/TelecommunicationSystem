package Telecommunaction;
public class Main {

	public static void main(String[] args) {
		
		DeskPhone myPhone = new DeskPhone("123467890");
		myPhone.PowerON();
		myPhone.CallPhone("1234567890");
		myPhone.Answaer();
		
		MobilePhone myPhone1 = new MobilePhone("7972736682");
		myPhone1.PowerON();
		myPhone1.CallPhone("7972736682");
		myPhone1.Answaer();
		
	}	
}
