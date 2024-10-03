package in.ashokit.logical;

import java.util.Scanner;

/*Create PIN using Three given numbers

"Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINs (passwords). You have been asked to work on the module that is expected to generate PINs using three input numbers.

The three given input numbers will always consist of three digits each 
i.e. each of them will be in the range >=100 and <=999.

Bellow are the rules for generating the PIN.

1. The PIN should made up of 4 digits.
2. The unit (ones) position of the PIN should be the least of the units position of the three numbers.
3. The tens position of the PIN should be the least of the tens position of the three input numbers.
4. The hundreds position of the PIN should be least of the hundreds position of the three numbers.
5. The thousands position of the PIN should be the max of all digits in the three input numbers.

input ----------> three numbers
constraints ----> all the numbers must be in the range of >=100 and <=999
output ---------> PIN value*/
public class LBP031 {

	public static void main(String[] args) {
		/* Scanner obj = new Scanner(System.in);
		    int n1 = obj.nextInt();
		    int n2 = obj.nextInt();
		    int n3 = obj.nextInt();
		    int pin,a,b,c,d;
		    a = Math.min(Math.min(n1%10,n2%10),n3%10);
		    b = Math.min(Math.min((n1/10)%10,(n2/10)%10),(n3/10)%10);
		    c = Math.min(Math.min((n1/100)%10,(n2/100)%10),(n3/100)%10);
		    d = Math.max(Math.max(maxD(n1),maxD(n2)),maxD(n3));
		    pin = d*1000 + c*100 + b*10 + a;
		    System.out.println(pin);*/
	}

}
