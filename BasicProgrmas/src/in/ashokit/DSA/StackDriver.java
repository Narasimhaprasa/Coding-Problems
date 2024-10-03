package in.ashokit.DSA;

public class StackDriver {

	public static void main(String[] args) {
		CustomStack s = new CustomStack();
		s.push(10);
		s.push(20);
		s.push(30);

		int pop = s.pop();
		System.out.println(pop + " popped from stack ::");
		int pop2 = s.pop();
		System.out.println(pop2 + " popped from stack ");
		int pop3 = s.pop();
		System.out.println(pop3 + " popped from stack");
		s.push(40);
		s.push(50);
		s.push(60);

		int peek = s.peek();
		System.out.println("Top element is ::" + peek);
		System.out.println("Elements present in stack::");
		s.traverse();
	}

}
