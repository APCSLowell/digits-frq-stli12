import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	   digitList = new ArrayList<Integer>();
	if(num == 0);
		digitList.add(new Integer(0));

	while(num > 0){
		digitList.add(new Integer(num%10));
		num = num/10;
	}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < digits.size()-1; i ++){
	if(digits.get(i).compareTo( digits.get(i+1)) < 0)
		return false;

		}
	return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
