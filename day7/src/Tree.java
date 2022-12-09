public class Tree<T> {
	private Node<T> root;

	public Tree(Node<T> root) {
		this.root = root;
	}

	public Node<T> findNode(Node<T> node, String name) {
		Node<T> found = null;
		for (Node<T> child : node.getChildren()) {
			if (child.getName().equals(name)) {
				found = child;
				return found;
			}
		}
		return found;
	}

	public void calculateSizes(Node<T> node) {
		int tempSize = 0;
		if (!node.isFile()) {
			for (Node<T> child : node.getChildren()) {
				calculateSizes(child);
				tempSize += child.getSize();
			}
			node.addSize(node, tempSize);
		}
	}
}