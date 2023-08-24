package Telecommunaction;

public class MobilePhone implements Telephone{
	
	private String PhoneNumber;
	private boolean IsRining;
	private boolean IsPowerOn;
	
	public MobilePhone(String MyNumber)
	{
		this.PhoneNumber=MyNumber;
	}

	@Override
	public void PowerON() {
		IsPowerOn=true;
		System.out.println("Mobile Phone On");
	}

	@Override
	public void Dial(String PhoneNumber) {
		System.out.println("Naw Rining"+PhoneNumber+"On Mobile Phone");
	}

	@Override
	public void Answaer() {
		if(IsRining && IsPowerOn)
		{
			System.out.println("Answer The Moobile Phone");
			IsRining=false;
		}
		else
		{
			
		}
	}

	@Override
	public boolean CallPhone(String PhoneNumber) {
		if(PhoneNumber == PhoneNumber && IsPowerOn)
		{
			IsRining=true;
			System.out.println("Phone Rining");
		}
		else
		{
			System.out.println(" Either wrong no enter  or phone is off");
			IsRining = false;
		}
		return IsRining;
	}

	@Override
	public boolean IsRining() {
		
		return IsRining;
	}

	
	
	
	
	
	
	
	
	
}
