package com.buaa.ds.graph;

public class MSTApp {
    public static void main(String[] args) {
        Graph thegraph = new Graph();
        thegraph.addVertex('A');
        thegraph.addVertex('B');
        thegraph.addVertex('C');
        thegraph.addVertex('D');
        thegraph.addVertex('E');
        thegraph.addEdge(0,1);
        thegraph.addEdge(0,2);
        thegraph.addEdge(0,3);
        thegraph.addEdge(0,4);
        thegraph.addEdge(1,2);
        thegraph.addEdge(1,3);
        thegraph.addEdge(1,4);
        thegraph.addEdge(2,3);
        thegraph.addEdge(2,4);
        thegraph.addEdge(3,4);
        System.out.println("最小生成树：");
        thegraph.mst();
        System.out.println();
    }
}
