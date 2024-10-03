package in.ashokit.DSA;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);

		printList(list);
	}

	public static LinkedList insert(LinkedList list, int data) {
		Node newNode = new Node(data);

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	public static void printList(LinkedList list) {
		Node currentNode = list.head;
		System.out.println("LinkedLIst::");
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}
}
