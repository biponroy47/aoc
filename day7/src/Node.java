import java.util.ArrayList;

public class Node<T>{
	
	private Node<T> parent;
	private String name;
	private int size;
	private ArrayList<Node<T>> children = new ArrayList<Node<T>>();
	
	public Node(Node<T> parent, String name, int size){
		this.parent = parent;
		this.name = name;
		this.size = size;
	}
	
	public Node<T> getParent(){
		return parent;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
	public ArrayList<Node<T>> getChildren(){
		return children;
	}
	
	public void addSize(Node<T> currentNode, int newSize) {
		currentNode.size += newSize;
	}
	
	public void addChild(Node<T> newNode) {
		children.add(newNode);
	}
	
	public boolean isFile() {
		return children.size() == 0;
	}
}