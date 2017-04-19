package com.roman.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.roman.model.*;
import com.roman.view.*;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

/**
 * Created by Roman Boiko1 on 17.03.2016.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        BufferedReader dataIn = inputPathToDataInFileWithScanner(sc);
        //HashMap<Integer, ArrayList<Node>> graph =
        readNodesAndEdgesFromFile(dataIn);
        //model.defineGraph(graph);
        boolean nodesExist = false;
        while (!nodesExist) {
            try {
                int[] fromAndToNodes = inputNodes(sc);
                long shortestPath = model.searchShortestWay(fromAndToNodes[0], fromAndToNodes[1]);
                view.printMessage(View.SHORTEST_WAY_VALUE + String.valueOf(shortestPath));
                nodesExist = true;
            } catch (ValueException ex) {
                view.printMessage(ex.getMessage());
            }
        }

       // view.printMessage(View.SHORTEST_WAY_VALUE + String.valueOf(shortestPath));
    }

    // The Utility methods
    private BufferedReader inputPathToDataInFileWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_PATH_DATE_IN_FILE);
        BufferedReader dataIn = null;
        boolean fileExist = false;
        while(!fileExist) {
            try {
                dataIn = new BufferedReader(new FileReader(sc.next()));
                fileExist = true;
            }
            catch (IOException ex) {
                view.printMessage(View.WRONG_INPUT_INT_DATA);
                view.printMessage(ex.getMessage());
            }
        }
        return dataIn;
    }
     private int[] inputNodes(Scanner sc) {
         int[] fromAndToNodes = new int[2];
         int countOfInputs = 0;
         while (countOfInputs < 2) {
             if (countOfInputs == 0){
                 view.printMessage(View.INPUT_OUTGOING_NODE);
             }
             else {
                 view.printMessage(View.INPUT_INCOMING_NODE);
             }
             if (!sc.hasNextInt()) {
                 view.printMessage(View.WRONG_INPUT_INT_DATA);
                 sc.next();
                 continue;
             }
             fromAndToNodes[countOfInputs] = Integer.parseInt(sc.next());
             countOfInputs++;
         }
         return fromAndToNodes;
     }

    //need a little change later!!!!!!!!!!!!!!!!!!!!!!!
    private void readNodesAndEdgesFromFile(BufferedReader dataIn){
        HashMap<Integer, ArrayList<Node>> graph = new HashMap<Integer, ArrayList<Node>>();
        Set allNodes = new HashSet<Integer>();
        try {
            String line;
            String[] lineParts;
            ArrayList<Node> temp;
            Node node;
            int outgoingNode, edge, incomingNode;
            line = dataIn.readLine();
            while ((line = dataIn.readLine()) != null) {
                lineParts = line.split(" ");
                outgoingNode = Integer.parseInt(lineParts[0]);
                incomingNode = Integer.parseInt(lineParts[1]);
                edge = Integer.parseInt(lineParts[2]);
                allNodes.add(outgoingNode);
                allNodes.add(incomingNode);
                node = new Node(incomingNode, edge);
                if (graph.get(outgoingNode) == null) {
                    graph.put(outgoingNode, temp = new ArrayList<Node>());
                } else {
                    temp = graph.get(outgoingNode);
                }
                temp.add(node);
            }
        }
        catch (Exception ex) {
            view.printMessage(View.WRONG_INPUT_FORMAT);
        }
        model.setAllNodes(allNodes);
        model.setGraph(graph);
    }

}
