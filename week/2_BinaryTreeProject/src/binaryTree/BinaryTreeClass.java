package binaryTree;

public class BinaryTreeClass {
  BinaryTreeNode rootTree;

  // Default constructor
  public BinaryTreeClass() {
    this.rootTree = null;
  }

  // Operations
  public void put(int num) {
    BinaryTreeNode newNodeTree = new BinaryTreeNode();
    newNodeTree.llink = null;
    newNodeTree.rlink = null;

    BinaryTreeNode currentNode;
    if (rootTree == null) {
      newNodeTree.info = num;
      rootTree = newNodeTree; // this is the first node and it needs a new reference
    } else {
      currentNode = rootTree;
      Boolean insert = false;
      while (!insert) {
        if (num < currentNode.info) {
          if (currentNode.llink == null) {
            currentNode.llink = newNodeTree;
            insert = true;
          }
          currentNode = currentNode.llink; // keep traversing the llink
        } else {
          if (currentNode.rlink == null) {
            currentNode.rlink = newNodeTree;
            insert = true;
          }
          currentNode = currentNode.rlink; // keep traversing the rlink
        }
      }
    }
  }

  public boolean search(int num) {
    boolean found = false;
    BinaryTreeNode currentNode;
    if (rootTree == null) {
      System.out.println("Tree is empty");
    } else {
      currentNode = rootTree;
      while (currentNode != null && !found) {
        if (num == currentNode.info) {
          found = true;
        } else if (num < currentNode.info) {
          currentNode = currentNode.llink;
        } else {
          currentNode = currentNode.rlink;
        }
      }
    }
    return found;
  }

  // Traverse the tree
  // Recursive method to traverse the binary tree in order

  // PreOrder
  public void preOrderTraversal() {
    preOrder(rootTree);
  }

  private void preOrder(BinaryTreeNode oot) {
    System.out.println("--------" + oot.info + "--------");
    if (oot.llink != null) {
      preOrder(oot.llink);
    }
    if (oot.rlink != null) {
      preOrder(oot.rlink);
    }
  }

  // PostOrder
  public void postOrderTraversal() {
    postOrder(rootTree);
  }

  private void postOrder(BinaryTreeNode oot) {

    if (oot.llink != null) {
      preOrder(oot.llink);
    }
    if (oot.rlink != null) {
      preOrder(oot.rlink);
    }
    System.out.println("--------" + oot.info + "--------");
  }

  // InOrder
  public void inOrderTraversal() {
    inOrder(rootTree);
  }

  private void inOrder(BinaryTreeNode oot) {
    if (oot.llink != null) {
      inOrder(oot.llink);
    }
    System.out.println("--------" + oot.info + "--------");
    if (oot.rlink != null) {
      inOrder(oot.rlink);
    }
  }
}
