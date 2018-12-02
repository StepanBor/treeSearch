package com.gmail.stepan1983;

public class Node {
    private String value;
    private Node left;
    private Node right;
    private Node parent;

    public Node(String value, Node left, Node right, Node parent) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public Node() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", left=" + (left != null ? left.getValue() : left) +
                ", right=" + (right != null ? right.getValue() : right) +
                ", parent=" + (parent != null ? parent.getValue() : parent) +
                '}';
    }

}
