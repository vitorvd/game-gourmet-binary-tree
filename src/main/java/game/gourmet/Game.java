package game.gourmet;

import game.gourmet.core.BinaryTree;
import game.gourmet.core.Node;

public class Game extends GameLayout{

    private BinaryTree binaryTree;

    public Game() {
       super();
    }

    public void start() {
        this.showMessageDialog("Pense em um prato que gosta");

        buildDefaultBinaryTree();

        startFrom(binaryTree.getRoot());
    }

    private void startFrom(Node node) {
        if(node == null) return;

        if(node.hasBothChildren()){
            boolean rightAnswer = this.showConfirmDialog(String.format("O prato que você pensou é %s?", node.getData()));

            if(rightAnswer) {
                startFrom(node.getRight());
            }else{
                startFrom(node.getLeft());
            }
        }

        boolean rightAnswer = this.showConfirmDialog(String.format("O prato que você pensou é %s?", node.getData()));

        if(rightAnswer){
            won();
            return;
        }

        //Getting new answers
        String plateAnswered = this.showQuestionDialog("Qual prato você pensou?");

        String questionFormatted = String.format("%s é _____ mas %s não.", plateAnswered, node.getData());
        String characteristic = this.showQuestionDialog(questionFormatted);

        Node.updateArchitectureBinaryTree(node, characteristic, plateAnswered);

        startFrom(binaryTree.getRoot());
    }

    private void won() {
        this.showMessageDialog("Acertei de novo!");
        startFrom(binaryTree.getRoot());
    }

    private void buildDefaultBinaryTree() {
        Node root = new Node("Massa");
        Node rootLeft = new Node("Bolo de Chocolate");
        Node rootRight = new Node("Lasanha");

        root.setLeft(rootLeft);
        root.setRight(rootRight);

        this.binaryTree = new BinaryTree(root);
    }

}
