package Day2dsa;

public class Node {
	
	private int id;
	private Node node;
	public Node(int id) {
		super();
		this.id = id;
		this.node = null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
}
