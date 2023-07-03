package Day2dsa;

import java.util.Stack;

public class LinkedList {

	private Node Head;

	public LinkedList() {
		this.Head = null;
	}

	public boolean insertAtLAst(int id) {
		Node NewNode = new Node(id);

		if (NewNode == null)
			return false;

		if (Head == null) {
			Head = NewNode;
			return true;
		}
		Node temp = Head;
		while (temp.getNode() != null) {
			temp = temp.getNode();
		}
		temp.setNode(NewNode);
		return true;
	}

	public void display() {
		Node temp = Head;
		while (temp != null) {
			System.out.println(temp.getId());
			temp = temp.getNode();
		}
	}

	public void RevDisplay() {
		Stack<Integer> s = new Stack<Integer>();
		Node temp = Head;
		while (temp != null) {
			s.push(temp.getId());
			temp = temp.getNode();
		}
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

	public boolean InsertAtPos(int pos, int id) {
		Node NewNode = new Node(id);

		if (Head == null) {
			Head = NewNode;
			return true;
		}
		if (pos == 1) {
			NewNode.setNode(Head);
			Head = NewNode;
			return true;
		}
		Node temp = Head;
		for (int i = 1; i < pos - 1; i++) {
			// System.out.println("n");
			if (temp == null) {
				System.out.println("invalid postion");
				return false;
			}
			temp = temp.getNode();
		}
		NewNode.setNode(temp.getNode());
		temp.setNode(NewNode);
		return true;
	}

	public boolean DeleteAtPos(int pos) {
		if (Head == null) {
			System.out.println("Invalid Postion");
			return false;
		}
		if (pos == 1) {
			if (Head != null) {
				Head = Head.getNode();
				return true;
			}
			Head = null;
			return true;
		}
		Node test = Head;
		for (int i = 1; i < pos - 1; i++) {
			System.out.println("s");
			if (test == null) {
				System.out.println("invalid postion");
				return false;
			}
			test = test.getNode();
		}
		test.setNode(test.getNode().getNode());
		return true;
	}

	public Boolean insertAtBeg(int nextInt) {
		
		Node newnode=new Node(nextInt);
		if(newnode==null)
			return false;
		if(Head==null)
		{
			Head=newnode;
			return true;
		}
		newnode.setNode(Head);
		Head=newnode;
		return true;
	}

	public String deleteAtBeg() {
		if(Head==null)
			return "List Is EMPTY";
		
		Head=Head.getNode();
		return "Data DeletedBeg Sucessfully";
	}
	
	
	public String deleteAtLast() {
		Node temp=Head;
		if(Head==null)
			return "List Is EMPTY";
		while(temp.getNode().getNode()!=null)
			temp=temp.getNode();
		temp.setNode(temp.getNode().getNode());
		return "Data DeletedAtLat Sucessfully";
	}
}