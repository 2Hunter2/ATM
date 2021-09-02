
import java.util.HashMap;

public class ATM {
	private HashMap<String,Double> maps=new HashMap<>();
	public ATM(){}
	public void deposit (String bankID, Double value) throws Exception{
		if (value>0){
			if (maps.containsKey(bankID)){
				maps.put(bankID,maps.get(bankID)+value);
			}
			else{
				maps.put(bankID,value);
			}
		}
		else{
			throw new Exception("You cannot deposit a negative sum of money!");
		}
	}
	public void withdraw(String bankID,Double value) throws Exception{
		if(value>0){
			if(maps.containsKey(bankID)){
				maps.put(bankID, maps.get(bankID)-value);
			}
			else{
				System.out.println("An account with that bank ID does not exist!");
			}
		}
		else{
			throw new Exception("You cannot withdraw a negative sum of money!");
		}
	}
	public String checkBalance(String bankID) throws Exception{
		if(maps.containsKey(bankID)) {
			return(""+maps.get(bankID));
		}
		throw new Exception("Bank account with that ID doesn't exist!");
	}
	public String toString(){
		String str="";
		for(HashMap.Entry<String,Double> account:maps.entrySet()){
			str+=account.getKey()+": $"+account.getValue()+"\n";
		}
		return str;
	}
}