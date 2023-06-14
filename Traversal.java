public class Traversal {
    public static void main(String st[]){
        Node node = new Node(1);
        node.left = new Node(2);;
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

       // printNodeDetail(node);

        Node node1 = new Node(1);
        node1.left = null;
        node1.right = new Node(2);
        node1.right.left = new Node(3);

        printNodeDetail(node1);
    }

    static void printNodeDetail(Node node) {

        if(node!=null){
            printNodeDetail(node.left);
            System.out.println(node.data);
            printNodeDetail(node.right);
        }

    }
}
