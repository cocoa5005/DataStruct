package com.buaa.ds.graph;

import com.buaa.ds.StackAndQueue.Queue;
import com.buaa.ds.StackAndQueue.Stack;

public class Graph {
    private final int MAX_VERTS = 10;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Stack stack;//深度优先
    private Queue queue;//广度优先

    public Graph(){
        this.vertexList = new Vertex[MAX_VERTS];
        this.adjMat  = new int[MAX_VERTS][MAX_VERTS];
        this.nVerts = 0;

        for (int j=0;j<MAX_VERTS;j++){
            for (int k=0;k<MAX_VERTS;k++){
                this.adjMat[j][k] = 0;
            }
        }
        this.stack = new Stack(MAX_VERTS);
        this.queue = new Queue(MAX_VERTS);
    }
    public void addVertex(char lab){
        this.vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start,int end){
        this.adjMat[start][end] = 1;
        this.adjMat[end][start] = 1;
    }

    public void displayVertex(int v){
        System.out.print(this.vertexList[v].label+" ");
    }

    public int getAdjUnvisitedVertex(int v){
        for (int i = 0; i <nVerts ; i++) {
            if(this.adjMat[v][i]==1&&this.vertexList[i].wasvisited == false){
                return i;
            }
        }
        return -1;
    }

    //深度优先
    public void dfs(){
        this.vertexList[0].wasvisited = true;
        displayVertex(0);
        this.stack.push(0);

        while(!this.stack.isEmpty()){
            int v = this.getAdjUnvisitedVertex((int) this.stack.peek());
            if(v==-1){
                this.stack.pop();
            }else{
                this.vertexList[v].wasvisited = true;
                displayVertex(v);
                this.stack.push(v);
            }
        }
        this.resetVertexVisted();
    }
    //基于深度优先的最小生成树
    public void mst(){
        this.vertexList[0].wasvisited = true;
        this.stack.push(0);

        while(!this.stack.isEmpty()){
            int currentvertex = (int) this.stack.peek();
            int v = this.getAdjUnvisitedVertex(currentvertex);
            if(v==-1){
                this.stack.pop();
            }else{
                this.vertexList[v].wasvisited = true;
                this.stack.push(v);
                displayVertex(currentvertex);
                displayVertex(v);
                System.out.println(" ");
            }
        }
        this.resetVertexVisted();
    }
    //广度优先
    public void bfs(){
        this.vertexList[0].wasvisited=true;
        displayVertex(0);
        this.queue.insert(0l);
        int v2;
        while(!this.queue.isEmpty()){
            int v1 = (int) this.queue.remove();
            while((v2=this.getAdjUnvisitedVertex(v1))!=-1){
                this.vertexList[v2].wasvisited = true;
                displayVertex(v2);
                this.queue.insert(v2);
            }
        }
        this.resetVertexVisted();
    }

    public void resetVertexVisted(){
        for (int j = 0; j <nVerts ; j++) {
            this.vertexList[j].wasvisited = false;
        }
    }
}
