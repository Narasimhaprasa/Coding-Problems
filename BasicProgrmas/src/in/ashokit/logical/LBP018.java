package in.ashokit.logical;

/*Check Birth Day

Lisa always forgets her birthday which is on th 5th July. 
So develop a function/method which will be helpful to remember her birthday.

The function/method checkBirthday return an integer 1, if it is her birthday else return 0. the function/method checkBirthday accepts two arguments.Month,
 a string representing the month of her birth and day, an integer representing the data of her birthday.

input -----------> month & day 
constraints -----> no
output ----------> 1 or 0*/
public class LBP018 {

	public static void main(String[] args) {
		int lisaBirthDay = checkBirthDay("july", 5);
		System.out.println((lisaBirthDay == 1) ? "Today is Lisa BirthDay ..!" : "sorry not your bidthday..!");
	}

	public static int checkBirthDay(String month, int day) {
		if (month.equalsIgnoreCase("july") && day == 5)
			return 1;
		else
			return 0;
	}

}
