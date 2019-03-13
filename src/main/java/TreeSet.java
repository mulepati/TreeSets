public class TreeSet<E extends Comparable<E>> {
    private Node<E> root;

    public TreeSet(E rootData) {
        this.root = new Node<>(rootData);
    }

    public Node<E> getRoot() {
        return this.root;
    }

    public void insert(Node<E> value) {
        root = insertValue(root, value);

    }

    private Node<E> insertValue(Node<E> node, Node<E> value) {
        if(node == null || node.equals(value)) {
            return value;
        } else if(node.getData().compareTo(value.getData()) > 0) {
            node.left = insertValue(node.left, value);
        } else {
            node.right = insertValue(node.right, value);
        }
        return node;
    }

    public void remove(E data) {

        root = deleteValue(root, data);
    }

    private Node<E> deleteValue(Node<E> node, E value) {
        if(node != null) {
            if(node.getData().equals(value)){
                if(node.left == null && node.right == null) {
                    node = null;
                } else if(node.left !=  null && node.right != null) {
                    node.left.right = node.right;
                    node = node.left;
                } else if(node.left != null) {
                    node = node.left;
                } else {
                    node = node.right;
                }
                return node;
            } else if(node.right != null && node.right.getData().equals(value)){
                if(node.right.left == null && node.right.right == null) {
                    node = null;
                } else if(node.right.left !=  null && node.right.right != null) {
                    node.right.left.right = node.right.right;
                    node.right = node.right.left;
                } else if(node.right.left != null) {
                    node.right = node.right.left;
                } else {
                    node.right = node.right.right;
                }
                if(node != null) {return node.right;}
            } else if(node.left != null && node.left.getData().equals(value)){
                if(node.left.left == null && node.left.right == null) {
                    node = null;
                } else if(node.left.left !=  null && node.left.right != null) {
                    node.left.left.right = node.left.right;
                    node.left = node.left.left;
                } else if(node.left.left != null) {
                    node.left = node.left.left;
                } else {
                    node.left = node.left.right;
                }
                if(node != null) {return node.left;}
            } else if(node.getData().compareTo(value) > 0) {
                deleteValue(node.left, value);
            } else {
                deleteValue(node.right, value);
            }
        }

        return node;

    }

    @Override
    public String toString() {
        StringBuilder string = stringHelper(root, new StringBuilder());
        return string.toString();
    }

    private StringBuilder stringHelper(Node<E> node, StringBuilder prints) {
        if(node == null) {
            return null;
        }
        stringHelper(node.left, prints);
        prints.append(node.getData() + ",");
        stringHelper(node.right, prints);
        return prints;

    }
}