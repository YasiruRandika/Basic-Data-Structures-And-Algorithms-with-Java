package L4_Tree;

public class Node {
    private int iData;//Use as the key value
    private double dData;//Other data
    private Node leftChild;//Node's left child
    private Node rightChild;//Node's right child

    public Node(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void displayNode() {
        System.out.println("{ " + iData + ", " + dData + " }");
    }

    //Getters
    public int getiData() {
        return iData;
    }

    public double getdData() {
        return dData;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
}
