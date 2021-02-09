
public class AddElementToLinkedList {
	
	public static class Node{

		int data;

		Node next;

		public Node getNext() {

		return next;

		}

		public void setNext(Node next) {

		this.next = next;

		}

		public int getData() {

		return data;

		}

		public void setData(int data) {

		this.data = data;

		}

		@Override

		public String toString() {

		return "Node [next=" + next + ", data=" + data + "]";

		}

		}

		public static Node push(Node head_ref, int new_data) {

		Node new_node = new Node();

		new_node.data = new_data;

		new_node.next = head_ref;

		head_ref = new_node;

		return head_ref;

		}

		public static void printList(Node node) {

		while(node != null) {

		System.out.println(node.data +"->");

		node= node.next;

		}

		}

		public static void main(String[] args) {

		System.out.println("In Main Method");

		Node head = null;

		head = push(head,5);

		head = push(head,4);

		head = push(head,3);

		head = push(head,2);

		head = push(head,1);

		printList(head);

		Node updated_head = addNode(head);

		printList(updated_head);

		}

		private static Node addNode(Node head) {
		
			Node temp = head;
			Node new_node = new Node();
			 new_node = push(new_node, 6);
			int k = 6;
			while(temp != null) {
				
				if(temp.next== null) {
					temp.next = new_node;
					break;
				}else {
					temp = temp.next;
				}
			}
			return head;
		}
}
