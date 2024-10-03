package in.ashokit.logical;

import java.util.Scanner;

/*Morning Prayer

Student of a school are assembled in a straight line for the morning prayer. To uplift the sprit of the students, an exercise is conducted. 
THe initial letter of all the student's names is noted down(str). The task here is to substitute the intitial letters in the list with consonants such that if
 the initial letter of the student is a vowel, retain the student in the same position.

If the initial letter of the student is a consonant, swap with the next immediate consonants from the english alphabet sequence (a-z). Say, initial letter 
of a student starts with b swap with c, next immediate consonant. If the initial letter is 'z' swap with 'b'.

input -----> a string from the user
con -------> no
output ----> updated string

Ex:
    welcome -----> xemdone

    if char is vowel keep as it is
    if char is consonant replace with next constant
    if char is 'z' next char is 'a', hence replace with 'b', 'a' is vowel
*/
public class LBP259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ::");
		String studName = sc.nextLine();
		checkStr(studName);
	}

	public static void checkStr(String name) {
		int i, len = name.length();
		char ch;
		for (i = 0; i < len; i++) {
			ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				System.out.print(ch);
			else {
				char ch1 = ch;
				if (ch1 == 'z')
					ch1 = 'a';
				ch1++;

				if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
					ch1++;
				System.out.print(ch1);
			}
		}
	}
}
