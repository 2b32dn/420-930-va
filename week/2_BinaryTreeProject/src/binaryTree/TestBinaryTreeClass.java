package binaryTree;

import java.util.*;

public class TestBinaryTreeClass {
  public static void main(String[] args) {
    BinaryTreeClass myTree = new BinaryTreeClass();

    myTree.put(60);
    myTree.put(50);
    myTree.put(70);
    myTree.put(80);
    myTree.put(40);

    System.out.println("InOrder Binary Tree Traversal ");
    myTree.inOrderTraversal();

    System.out.println("PreOrder Binary Tree Traversal ");
    myTree.preOrderTraversal();

    System.out.println("PostOrder Binary Tree Traversal ");
    myTree.postOrderTraversal();

    System.out.println("Let's search for value x: ");
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    if (myTree.search(x)) {
      System.out.println("Value " + x + " is in the tree");
    } else {
      System.out.println("Value " + x + " is not in the tree");
    }
    input.close();
  }
}
