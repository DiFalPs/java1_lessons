package ru.geekbrains.jalgorimts.lesson6;
import java.util.Random;

public class Tree {
    TreeNode root;
    public void insert(TreeNode node) {
        if (root == null) {
            root = node;
        } else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (node.value < current.value) {
                    current = current.left;
                    if (current == null) {
                        parent.left = node;
                        return;
                    }
                } else if (node.value > current.value) {
                    current = current.right;
                    if (current == null) {
                        parent.right = node;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void preOrderTraverse(TreeNode currentNode) {
        if (currentNode != null) {
            System.out.println(currentNode);
            preOrderTraverse(currentNode.left);
            preOrderTraverse(currentNode.right);
        }
    }

    public void displayTree() {
        preOrderTraverse(root);
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Tree tree = new Tree();
            int randomValue = random.nextInt(200) - 100;
            tree.insert(new TreeNode(randomValue));
            tree.displayTree();
        }


    }
}
