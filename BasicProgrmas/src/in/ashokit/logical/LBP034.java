package in.ashokit.logical;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Email name should be starts with alphabet and should follw by number or underscore. 
It should contains either numbers or underscore finally ends with gmail.com only, 
Then given email id is true otherwise false.

input ------> email id
constraint -> lowercase alphabet [a-z] followed by underscore or digit and gmail.com
output -----> true or false*/
public class LBP034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a email Id ::");//narasimhaprasad812@gmail.com (or) narasimhaprasad_@gmail.com
		String email = sc.nextLine().toLowerCase();
	     
		/* String[] splitEmail = email.split("@");
		 boolean flag = false;
		 for(int i=0;i<splitEmail.length;i++) {
			 if((email.charAt(i)>='a' && email.charAt(i)<='z' ) && (email.charAt(i)>='0' && email.charAt(i)<='9' || email.charAt(i)=='_')) {
				 flag = true;
			 }
			 
		 }*/
		Pattern  p = Pattern.compile("[a-z]+[_|0-9]@gmail[.]com");
		Matcher  m = p.matcher(email);
		System.out.println(m.find() && m.group().equals(email));
		
	}

}
