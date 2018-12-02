package com.gmail.stepan1983;

import java.util.LinkedList;
import java.util.Queue;

public class BroadSearch implements TreeSearch {

    Queue<Node> nodeQueue=new LinkedList<Node>();

    public void searchNode(Node toSearh, Node treeTop) {

        do {
            if (toSearh.getValue().equalsIgnoreCase(treeTop.getValue())){
                System.out.println(treeTop.toString());
            }
            if (treeTop.getLeft()!=null) nodeQueue.add(treeTop.getLeft());
            if (treeTop.getRight()!=null) nodeQueue.add(treeTop.getRight());
            if(!nodeQueue.isEmpty()){
                System.out.println(treeTop.getValue());
                treeTop=nodeQueue.poll();
            }

        } while (!nodeQueue.isEmpty());


    }

}
