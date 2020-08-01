package L4_Tree;

public class Tree{
    private Node root;

    public Tree() {
        root = null;
    }

    //Method to find the minimum node in the tree
    public Node minimum() {
        Node minNode = root;

        while (root.getLeftChild() != null) {
            minNode = root.getLeftChild();
            root = minNode;
        }
        return minNode;
    }

    //Method to display the values in the tree in descending order
    //We can use inOrder Traversing Method to get this result
    //InOrder -> Left-Root-Right
    //inOrder comes under Depth First Search(DFS)
    public void descOrder(Node localRoot) {
        if (localRoot != null) {
            descOrder(localRoot.getLeftChild());
            localRoot.displayNode();
            descOrder(localRoot.getRightChild());
        }
    }

    //Find Method
    public Node find(int key) {
        Node current = root;

        while (current.getiData() != key) {
            if (key < current.getiData()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }

            if (current == null) {
                return null;
            }
        }

        return current;
    }

    //PreOrder Traversing Method
    //Root-Left-Right
    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            localRoot.displayNode();
            preOrder(localRoot.getLeftChild());
            preOrder(localRoot.getRightChild());
        }
    }

    //PastOrder Traversing Method
    //Left-Right-Root
    public void pastOrder(Node localRoot) {
        if (localRoot != null) {
            pastOrder(localRoot.getLeftChild());
            pastOrder(localRoot.getRightChild());
            localRoot.displayNode();
        }
    }

    //delete
}
