package in.ashokit.DSA;

public class CustomStack {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];

	public CustomStack() {
		top = -1;
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	public boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack OverFlow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " is pushed into stack");
			return true;
		}
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	public int peek() {
		if (top < 0) {
			System.out.println("Stack underflow::");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}

	public void traverse() {
       int i;
       for(i=top;i>=0;i--)
    	   System.out.print(a[i]+" ");
	}
}
