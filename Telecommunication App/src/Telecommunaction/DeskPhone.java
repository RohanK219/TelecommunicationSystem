package Telecommunaction;

public class DeskPhone implements Telephone{
	
	private String MyNumber;
	private boolean IsRining;
	
	public DeskPhone(String MyNumber)
	{
		this.MyNumber=MyNumber;
	}

	@Override
	public void PowerON() {
		System.out.println("Desk Phone IS Always Powered");
	}

	@Override
	public void Dial(String PhoneNumber) {
		System.out.println("Naw Rining"+PhoneNumber+"On Desk Phone");
	}

	@Override
	public void Answaer() {
		if(IsRining)
		{
			System.out.println("Answer The Desk Phone");
			IsRining=false;
		}
		else
		{
			System.out.println("Phone is Not Rining");
		}
	}

	@Override
	public boolean CallPhone(String PhoneNumber) {
		if(PhoneNumber == MyNumber)
		{
			IsRining=true;
			System.out.println("Phone Rining");
		}
		else
		{
		//	System.out.println(" ");
			IsRining=false;
		}
		return IsRining;
	}

	@Override
	public boolean IsRining() {
		
		return IsRining;
	}
	

}
