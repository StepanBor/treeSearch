package com.gmail.stepan1983;

public class MainSearch {
    public static void main(String[] args) {

        Node a = new Node("A", null, null, null);
        Node b = new Node("B", null, null, null);
        Node c = new Node("C", null, null, null);
        Node d = new Node("D", null, null, null);
        Node e = new Node("E", null, null, null);
        Node f = new Node("F", null, null, null);
        Node g = new Node("G", null, null, null);
        Node h = new Node("H", null, null, null);
        Node i = new Node("I", null, null, null);

        Node search = new Node("I", null, null, null);

        f.setLeft(b);
        f.setRight(g);

        b.setParent(f);
        b.setLeft(a);
        b.setRight(d);

        a.setParent(b);

        d.setLeft(c);
        d.setRight(e);
        d.setParent(b);

        c.setParent(d);

        e.setParent(e);

        g.setParent(f);
        g.setRight(i);

        i.setParent(g);
        i.setLeft(h);

        h.setParent(i);

        System.out.println("pre order search");

        TreeSearch treeSearch = new RecPreOrder();

        treeSearch.searchNode(search, f);

        System.out.println("in order search");

        treeSearch=new RecInOrderSearch();

        treeSearch.searchNode(search,f);

        System.out.println("post order search");

        treeSearch=new RecPostOrderSearch();

        treeSearch.searchNode(search,f);

        System.out.println("Broad search");

        treeSearch=new BroadSearch();

        treeSearch.searchNode(search,f);

    }
}
