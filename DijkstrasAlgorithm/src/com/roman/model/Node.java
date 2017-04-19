package com.roman.model;

/**
 * Created by Roman Boiko1 on 03.04.2017.
 */
public class Node {
    private int node;
    private int edgeToNode;

    public Node(int node, int value) {
        this.node = node;
        this.edgeToNode = value;
    }

    int getNode() {
        return node;
    }

    int getEdgeToNode() {
        return edgeToNode;
    }

}
