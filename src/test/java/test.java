public class test {
    public static void main(String[] args) {
        TreeSet<Integer> newTree = new TreeSet<>(14);
        int[] list = {4, 3, 15, 18, 16, 9, 20, 7};
        for (int i = 0; i < list.length; i++) {
            newTree.insert(new Node<>(list[i]));
        }
        System.out.println(newTree.toString());

        newTree.remove(18);
        System.out.println(newTree);
    }


}
