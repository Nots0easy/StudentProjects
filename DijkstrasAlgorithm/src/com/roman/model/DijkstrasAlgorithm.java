package com.roman.model;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.*;

/**
 * Created by Roman Boiko1 on 03.04.2017.
 */
public class DijkstrasAlgorithm {
    private int countOfUniquePaths;
    private Set allNodes;
    private HashMap<Integer, ArrayList<Node>> graph;
    private HashMap<Integer, Long> shortestWayToStartNodeFromCurrent = new HashMap<Integer, Long>();
    private HashMap<Integer, ArrayList<Integer>> priviousNodeInShortestWay = new HashMap<Integer, ArrayList<Integer>>();

    public DijkstrasAlgorithm(HashMap<Integer, ArrayList<Node>> graph, Set nodes){
        this.graph = graph;
        allNodes = nodes;
    }

    public long shortestWayToNode(int node){
        return shortestWayToStartNodeFromCurrent.get(node);
    }

    public void search(int start, int end) throws ValueException{
        if ((!allNodes.contains(start)) || (!allNodes.contains(end))){
            throw new ValueException("Input node doesn't exist");
        }
        HashMap<Integer, Long> shortestWaySet = new HashMap<Integer, Long>();
        int currentNode = start;
        long shortestWay = 0;
        long min;
        Set x = new HashSet<Integer>();
        for ( Object node: allNodes ) {
            shortestWayToStartNodeFromCurrent.put((int)node, Long.MAX_VALUE );
            priviousNodeInShortestWay.put((int)node, new ArrayList<>());
        }
        shortestWayToStartNodeFromCurrent.put(start, (long) 0);
        x.add(start);
        while (x.size() != allNodes.size()){
            if (graph.get(currentNode) != null) {
                for (Node node : graph.get(currentNode)) {
                    shortestWay = shortestWayToStartNodeFromCurrent.get(currentNode) + node.getEdgeToNode();
                    if (shortestWayToStartNodeFromCurrent.get(node.getNode()) == shortestWay) {
                        priviousNodeInShortestWay.get(node.getNode()).add(currentNode);
                    } else if (shortestWayToStartNodeFromCurrent.get(node.getNode()) > shortestWay) {
                        shortestWayToStartNodeFromCurrent.put(node.getNode(), shortestWay);
                        priviousNodeInShortestWay.get(node.getNode()).clear();
                        priviousNodeInShortestWay.get(node.getNode()).add(currentNode);
                        shortestWaySet.put(node.getNode(), shortestWay);
                    }
                }
            }
            if (shortestWaySet.size() == 0){
                return;
            }
            min = Long.MAX_VALUE;
            for(int not: shortestWaySet.keySet()){
                if (shortestWaySet.get(not) < min){
                    min = shortestWaySet.get(not);
                    currentNode = not;
                }
            }
            shortestWaySet.remove(currentNode);
            x.add(currentNode);
            if (currentNode == end){
                break;
            }
        }
    }

    public int findQuantityOfUniquePaths(int start, int end) {
        countOfUniquePaths = 1;
        findQuantityOfUniquePathsRecurcive(start, end);
        return countOfUniquePaths;
    }

    private void findQuantityOfUniquePathsRecurcive(int start, int end){
        if (start == end) return;
        ArrayList<Integer> temp = priviousNodeInShortestWay.get(end);
        if (temp.size() > 1) {
            countOfUniquePaths += temp.size() - 1;
        }
        for (int o : temp){
            findQuantityOfUniquePathsRecurcive(start, o);}
    }

}
