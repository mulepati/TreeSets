
import java.util.ArrayList;

public class Node<E> {
    E data;
    ArrayList<Node<E>> children = new ArrayList<>();

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void addChild(Node<E> child) {
        children.add(child);
    }

    public ArrayList<Node<E>> getChildren() {
        return children;
    }

    public boolean equals(Node<E> node) {
        return this.data.equals(node.data);
    }
}
