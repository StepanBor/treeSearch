package com.gmail.stepan1983;

public class RecPostOrderSearch implements TreeSearch {

    public void searchNode(Node toSearh, Node treeTop) {
        System.out.println(treeTop.getValue());
        if (treeTop.getLeft()!=null) searchNode(toSearh,treeTop.getLeft());
        if (treeTop.getRight()!=null) searchNode(toSearh,treeTop.getRight());

        if(toSearh.getValue().equalsIgnoreCase(treeTop.getValue())){
            System.out.println(treeTop.toString());
//            return;
        }



    }

}
