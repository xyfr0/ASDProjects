package com.example;

import java.util.Random;

class Node {
    String data;
    Node nodeKiri;
    Node nodeKanan;

    public Node(int dt) {
        String stringDt = Integer.toString(dt);
        data = stringDt;
        nodeKiri = nodeKanan = null;
    }

    public void sisipDt(int dtSisip) {
        int intData = Integer.parseInt(data);
        if (dtSisip < intData) {
            if (nodeKiri == null)
                nodeKiri = new Node(dtSisip);
            else
                nodeKiri.sisipDt(dtSisip);
        } else if (dtSisip > intData) {
            if (nodeKanan == null)
                nodeKanan = new Node(dtSisip);
            else
                nodeKanan.sisipDt(dtSisip);
        }
    }
}

public class TreePlus {
    private Node root;

    public TreePlus() {
        root = null;
    }

    public void sisipDtNode(int dtSisip) {
        if (root == null)
            root = new Node(dtSisip);
        else
            root.sisipDt(dtSisip);
    }

    public void preorderTraversal() {
        preorder(root);
    }

    private void preorder(Node node) {
        if (node == null)
            return;
        System.out.printf("%d ", Integer.parseInt(node.data));
        preorder(node.nodeKiri);
        preorder(node.nodeKanan);
    }

    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.nodeKiri);
        System.out.printf("%d ", Integer.parseInt(node.data));
        inorder(node.nodeKanan);
    }

    public void postorderTraversal() {
        postorder(root);
    }

    private void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.nodeKiri);
        postorder(node.nodeKanan);
        System.out.printf("%d ", Integer.parseInt(node.data));
    }

    int totalNode(Node root) {
        if (root == null) {
            return 0;
        } else {
            int l = totalNode(root.nodeKiri);
            int r = totalNode(root.nodeKanan);

            return 1 + l + r;
        }
    }

    int countLeaves(Node root) {
        if (root == null) {
            return 0;
        } else if (root.nodeKiri == null && root.nodeKanan == null) {
            return 1;
        }

        int l = totalNode(root.nodeKiri);
        int r = totalNode(root.nodeKanan);

        return l + r;
    }

    int getHeight(Node root) {
        if (root == null) {
            return -1;
        } else {
            int lHeight = getHeight(root.nodeKiri);
            int rHeight = getHeight(root.nodeKanan);

            return Math.max(lHeight, rHeight) + 1;
        }
    }

    int getLevel(Node root) {        
        if (root == null) {
            return 0;
        } else{
            int lHeight = getLevel(root.nodeKiri);            
            int rHeight = getLevel(root.nodeKanan); 
                       
            return 1 + Math.max(lHeight, rHeight);
        }
    }

    public static void main(String args[]) {
        TreePlus Tree = new TreePlus();
        int nilai;
        Random randomNumber = new Random();
        System.out.println("sisip nilai data berikut : ");
        // sisipDt 10 bilangan acak dari 0-99 ke dalam tree
        for (int i = 1; i <= 10; i++) {
            nilai = randomNumber.nextInt(100);
            System.out.print(nilai + " ");
            Tree.sisipDtNode(nilai);
        }
        System.out.println("\n\nPreorder traversal");
        Tree.preorderTraversal();
        System.out.println("\n\nInorder traversal");
        Tree.inorderTraversal();
        System.out.println("\n\nPostorder traversal");
        Tree.postorderTraversal();
        System.out.println();
        System.out.println();
        System.out.println("Jumlah Node:");
        System.out.println(Tree.totalNode(Tree.root));
        System.out.println();
        System.out.println("Jumlah Leaf:");
        System.out.println(Tree.countLeaves(Tree.root));
        System.out.println();
        System.out.println("Tinggi Binary Tree:");
        System.out.println(Tree.countLeaves(Tree.root));
        System.out.println();
        System.out.println("Jumlah level Node:");        
        System.out.println(Tree.getLevel(Tree.root));

    }
}
