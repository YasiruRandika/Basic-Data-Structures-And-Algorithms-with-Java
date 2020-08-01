package L4_Tree;
/*
* Here we are implementing a node to sotre the employee id and the name
* There we use id as the key for tree node
* */
public class Node {
    private int id;//Use as the key value
    private String empName;//Other data
    private Node leftChild;//Node's left child
    private Node rightChild;//Node's right child

    public void displayNode() {
        System.out.println("{ " + id + ", " + empName + " }");
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getEmpName() {
        return empName;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
