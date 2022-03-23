public class LinkedList {
	

	static class Node {
		int data;
		Node next;

	}
	Node head;
	
	public void insert(int d){
		Node node = new Node();
		node.data = d;
		node.next = null;

		if (head == null){
			head = node;
		}
		else{
			Node n = new Node();
			n = head;
			while (n.next != null){
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insert_start(int d){
		Node node = new Node();
		node.data = d;
		node.next = head;
		head = node;
		
	}
	public void del_position(int position){
		
		Node temp = head;
		if (position == 0){
			head = temp.next;
		}
		//get the prev node of the current position
		for (int i = 0; temp != null & i < position -1; i++) {
			temp = temp.next;
		}
		if (temp == null || temp.next == null)
            return;

		temp.next = temp.next.next;


	}
	public void delete(int key){
		Node temp = head;
		Node prev = null;
		//if head node is the node to del
		if (temp != null &&  temp.data == key){
			head = temp.next;
			return;
		}
		//middle of the linked list
		while(temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		//not in linked list
		if (temp == null)
			return;
		//if key value finds 
		prev.next = temp.next;

	}
	public  int len(){
		int l = 0;
		Node temp = head;
		while (temp.next != null){
			l += 1;
			temp = temp.next;
		}
		return l;
	}

	public void print()
	{
		Node n = new Node();
		n = head;
		while(n.next != null){
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert_start(0);
		list.insert_start(9);
		//list.del_position(2);
		list.print();
		System.out.println(list.len());
	}


}


