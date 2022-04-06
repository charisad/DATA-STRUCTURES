package com.sovereign;

import java.util.Scanner;

public class Main {

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    TreeNode root;

    Main(){
        root = null;
    }

    public TreeNode insert(TreeNode root,int dataToBeInserted){
        if (root == null){
            root = new TreeNode(dataToBeInserted);
            return root;
        }
        if (root.data > dataToBeInserted){
            root.left = insert(root.left,dataToBeInserted);
        }else if (root.data < dataToBeInserted){
            root.right = insert(root.right,dataToBeInserted);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int dataToBeSearched){
        if(root == null || root.data == dataToBeSearched){
            return root;
        }
        if (root.data > dataToBeSearched)
            return search(root.left,dataToBeSearched);

        //else
        return search(root.right,dataToBeSearched);
    }

    public void inOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    public void insertIntoTree(int dataToBeInserted){
        root = insert(root,dataToBeInserted);
    }
    public TreeNode searchTree(int dataToBeSearched){
        return search(root,dataToBeSearched);
    }

    public void inOrderTraversal(){
        inOrder(root);
    }
    private void postOrderTraversal() {
        postOrder(root);
    }

    private void postOrder(TreeNode root) {
        if(root == null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");

    }

    private void preOrderTraversal() {
        preOrder(root);
    }

    private void preOrder(TreeNode root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        int n,num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many number the three has");
        n = scanner.nextInt();
        System.out.println("Enter "+n+" numbers : " );
        for(int i=0;i<n;i++){
            num = scanner.nextInt();
            m.insertIntoTree(num);
        }
        System.out.println("Tree insertion done");

        System.out.println("Enter number to be searched");
        n = scanner.nextInt();
        if (m.searchTree(n) != null){
            System.out.println("number found");
        }else {
            System.out.println("Number not found");
        }
        System.out.println("inorder traversal of binary search tree");
        m.inOrderTraversal();
        System.out.println("preorder traversal of binary search tree");
        m.preOrderTraversal();
        System.out.println("postorder traversal of binary search tree");
        m.postOrderTraversal();
    }
}
