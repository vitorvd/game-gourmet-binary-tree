package game.gourmet.core;

public class Node {

    private String data;
    private Node left;
    private Node right;

    public Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean hasBothChildren(){
        return this.getLeft() != null && this.getRight() != null;
    }

    public static void updateArchitectureBinaryTree(Node node, String characteristic, String plateAnswered) {
        Node newLeftNode = new Node(node.getData());
        node.setLeft(newLeftNode);

        Node newRightNode = new Node(plateAnswered);
        node.setRight(newRightNode);

        node.setData(characteristic);
    }

}
