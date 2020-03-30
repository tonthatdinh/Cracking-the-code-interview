package Tree;

/**
 * Ref: https://www.baeldung.com/java-binary-tree
 *
 */
class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        this.right = this.left = null;
    }
}

class BinaryTree{
    Node root;

    private Node addRecursive(Node current, int value){
        if (current == null){
            return new Node(value);
        }

        if (value < current.value){
            current.left = addRecursive(current.left, value);
        } else if (value > current.value){
            current.right = addRecursive(current.right, value);
        } else{
            return current;
        }
        return current;
    }

    public void add(int value){
        root = addRecursive(root, value);
    }
}

public class Main {
    public static void main(String args[]){
        System.out.println("Hello Binary Tree");
    }
}
