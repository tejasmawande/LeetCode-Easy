public class ReverseLinkedList {

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

Node updated_head = reverseList(head);

printList(updated_head);

}

private static Node reverseList(Node head) {

Node prev = null;
Node current = head;
Node next = null ;

	while(current != null) {
		
		next = current.next;
		current.next = prev;
		prev = current;
		current = next;;
	}
		head = prev;
		System.out.println("head"+head);
		return head;

}

}

