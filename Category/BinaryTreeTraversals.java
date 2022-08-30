package Category;
class Node { // 이진트리의 노드는 data와 왼쪽 오른쪽 2개의 자식노드로 구성

    int data;
    Node left;
    Node right;
}
class Tree { // Tree 클래스에 Tree의 시작점 root를 선언

    public Node root;

    public void setRoot(Node node) {
        root = node;
    }

    public Node getRoot() {
        return root;
    }

    public Node makeNode(Node left, int data, Node right) {
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }

    public void inorder(Node node) {

        if (node != null) {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }

    public void preorder(Node node) {

        if (node != null) {
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }
}
public class BinaryTreeTraversals {

    public static void main(String[] args) {

        Tree t = new Tree();
        Node n4 = t.makeNode(null, 5, null);
        Node n5 = t.makeNode(null, 13, null);
        Node n2 = t.makeNode(n4, 6, n5);
        Node n3 = t.makeNode(null, 11, null);
        Node n1 = t.makeNode(n2, 10, n3);
        t.setRoot(n1);
        System.out.println("inorder 결과");
        t.inorder(t.getRoot());
        System.out.println("preorder 결과");
        t.preorder(t.getRoot());
        System.out.println("postorder 결과");
        t.postorder(t.getRoot());
    }
}

