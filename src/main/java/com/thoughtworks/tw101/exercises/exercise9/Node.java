package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    Node left;
    Node right;
    Node root;
    private String name;


    public Node(String name) {
        left = null;
        right = null;
        root = null;
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
        System.out.println("left: " + left);
        System.out.println("right " + right);
        System.out.println("root " + root);
    }

//    public boolean lookup(String name) {
//        return(lookup(root,name));
//    }
//
//    private boolean lookup(Node root, String nameOfNewNode) {
//        if (root==null) {
//            return false;
//        }
//
//        if(root.name.compareTo(nameOfNewNode)==0){
//            return true;
//        }
//        else if (root.name.compareTo(nameOfNewNode) < 0) {
//            return (lookup(root.left,nameOfNewNode));
//        }
//        else {
//            return (lookup(root.right,nameOfNewNode));
//        }
//    }

    public void add(String nameOfNewNode) {
        root = add(this, nameOfNewNode);
    }

    private Node add(Node node, String nameOfNewNode) {
        if (node == null) {
            node = new Node(nameOfNewNode);
        } else {
            if (node.name.compareTo(nameOfNewNode) < 0) {
                node.left = add(node.left, nameOfNewNode);
            } else {
                node.right = add(node.right, nameOfNewNode);
            }
        }
        return (node);
    }

    private void printTree(ArrayList<String> names, Node node) {
        if (node == null) return;

        printTree(names, node.right);
        names.add(node.name);
        printTree(names, node.left);
    }


    public List<String> names() {
        ArrayList<String> names = new ArrayList<>();
        printTree(names, this);
        return names;
    }
}
