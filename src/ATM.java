import java.util.*;
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
			if (maps.containsKey(bankID))
			{
				maps.put(bankID, maps.get (bankID) + value);
			}
			else
			{
				maps.put(bankID, value);
			}
		}
	}
}