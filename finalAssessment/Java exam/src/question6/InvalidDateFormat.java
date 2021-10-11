package question6;

@SuppressWarnings("serial")
public class InvalidDateFormat extends Exception{
	@Override
	public String toString() {
		return ("Date must be in DD/MM/YYYY format. (eg. 06/11/2017)");
	}
}
