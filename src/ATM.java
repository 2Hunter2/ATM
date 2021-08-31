
import java.util.HashMap;

public class ATM {
	private HashMap <String, Double> maps = new HashMap <> ();
	private String bankID;

	public ATM (String bankID)
	{
		this.bankID = bankID;
	}

	private void deposit (String bankID, Double value)
	{
		if (value > 0)
		{
			if (maps.containsKey(this.bankID))
			{
				maps.put(this.bankID, maps.get (this.bankID) + value);
			}
			else
			{
				maps.put(this.bankID, value);
			}
		}
	}
}