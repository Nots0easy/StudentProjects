package com.roman.model;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Roman Boiko1 on 17.03.2016.
 */
public class Model {
    private DijkstrasAlgorithm algorithm;
    private HashMap<Integer, ArrayList<Node>> graph;
    private Set allNodes;

    public void setAllNodes(Set allNodes) {
        this.allNodes = allNodes;
    }

    public void setGraph(HashMap<Integer, ArrayList<Node>> graph) {
        this.graph = graph;
    }

    // The Program logic

    /**
     * in this method provides searching the shortest way between two nodes
     */

    public long searchShortestWay(int outgoingNode, int incomingNode) throws ValueException {
        if ((graph != null) && (allNodes != null)) {
            algorithm = new DijkstrasAlgorithm(graph, allNodes);
            algorithm.search(outgoingNode, incomingNode);
            return algorithm.shortestWayToNode(incomingNode);
        }
        else return 0;   //костиль!!
    }

}
