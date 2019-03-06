import java.util.LinkedList;
import java.util.Queue;

public class Tree<E> {
    private Node<E> root;

    public Tree(E rootData) {
        this.root = new Node<>(rootData);
    }

    public Node<E> getFirst() {
        return root;
    }

    public Node<E> getNode(E data) {
        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<E> element = queue.remove();
            if (element.data.equals(data)) {
                return element;
            }
            queue.addAll(element.children);

        }
        return null;
    }


}