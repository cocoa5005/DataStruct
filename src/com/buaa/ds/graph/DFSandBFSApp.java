package com.buaa.ds.graph;

public class DFSandBFSApp {
    public static void main(String[] args) {
        Graph thegraph = new Graph();
        thegraph.addVertex('A');
        thegraph.addVertex('B');
        thegraph.addVertex('C');
        thegraph.addVertex('D');
        thegraph.addVertex('E');
        thegraph.addEdge(0,1);
        thegraph.addEdge(1,2);
        thegraph.addEdge(0,3);
        thegraph.addEdge(3,4);
        System.out.println("深度优先DFS:");
        thegraph.dfs();
        System.out.println();
        System.out.println("广度优先BFS:");
        thegraph.bfs();
    }
}
