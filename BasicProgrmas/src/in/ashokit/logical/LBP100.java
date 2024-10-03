package in.ashokit.logical;

import java.util.Scanner;

/*You are given a string representing an attendance record for a student. 
The record only contains the following three characters: 
	'A' : Absent. 'L' : Late. 'P' : Present. 
A student could be rewarded if his attendance record doesn't contain more than one 
	'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

input ------> a string from the user
con --------> non empty string
output -----> Yes or No

Ex:
	count('A') should not be >2
	count('LLL') should not be there

	LALLP ----> 1 and 0
	APLLL ----> 1 and 1
	PPLPP ----> 0 and 0*/

public class LBP100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a attendence report :::");
		String report = sc.nextLine();
		//String result = checkAttendenceReport(report);
		//System.out.println(result);
		int ac = 0;
		for (int i = 0; i < report.length(); i++) {
			if (report.charAt(i) == 'A')
				ac++;
		}
		System.out.println((ac > 1 || report.contains("LLL")) ? "NO" : "Yes");
	}

	public static String checkAttendenceReport(String report) {
		char[] chr = report.toCharArray();
		int i, len = chr.length, lateCount = 0, absentCount = 0;
		for (i = 0; i < len; i++) {
			if (chr[i] == 'A')
				absentCount++;
			if (chr[i] == 'L' && chr[i + 1] == 'L' && chr[i + 2] == 'L')
				lateCount++;
		}
		return (absentCount > 1 || lateCount == 1) ? "No" : "yes";
	}
}
