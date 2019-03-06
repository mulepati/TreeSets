public class test {
    public static void main(String[] args) {
        Tree<Integer> bal = new Tree<>(0);
        Node<Integer> testNode = new Node<>(6);
        Node<Integer> n = new Node<>(5);
        testNode.addChild(n);
        bal.getFirst().addChild(testNode);

        System.out.println(bal.getFirst().data);
        System.out.println(bal.getFirst().getChildren().get(0).data);
        System.out.println(bal.getFirst().getChildren().get(0).getChildren().get(0).data);

    }


}
