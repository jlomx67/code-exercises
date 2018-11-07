package com.hackerrank.java.language.medium;

import java.util.*;

public class JavaVisitorPattern {

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

    private static int[] nodeValues;
    private static Color[] nodeColors;
    private static Map<Integer, Set<Integer>> nodesMap = new HashMap<>();

    public static Tree solve(){
        Scanner capture = new Scanner(System.in);
        int nodesNumber = capture.nextInt();

        nodeValues = new int[nodesNumber];
        nodeColors = new Color[nodesNumber];

        for(int i = 0; i < nodesNumber; i++){
            nodeValues[i] = capture.nextInt();
        }

        for(int i = 0; i < nodesNumber; i++){
            nodeColors[i] = (capture.nextInt() == 0) ? Color.RED : Color.GREEN;
        }

        Tree rootNode;

        if(nodesNumber == 1){
            rootNode = new TreeLeaf(nodeValues[0], nodeColors[0], 0);
        } else {
            for(int i = 0; i < (nodesNumber - 1); i++){
                int firstNode = capture.nextInt();
                int secondNode = capture.nextInt();

                Set<Integer> firstNodeEdges = nodesMap.get(firstNode);
                Set<Integer> secondNodeEdges = nodesMap.get(secondNode);

                if(firstNodeEdges == null){firstNodeEdges = new HashSet<>();}
                if(secondNodeEdges == null){secondNodeEdges = new HashSet<>();}

                firstNodeEdges.add(secondNode);
                nodesMap.put(firstNode, firstNodeEdges);

                secondNodeEdges.add(firstNode);
                nodesMap.put(secondNode, secondNodeEdges);
            }

            rootNode = new TreeNode(nodeValues[0], nodeColors[0], 0);
            Set<Integer> rootEdges = nodesMap.get(1);
            Iterator<Integer> rootIterator = rootEdges.iterator();

            while(rootIterator.hasNext()){
                Integer nodeId = rootIterator.next();
                nodesMap.get(nodeId).remove(1);
                createEdge(rootNode, nodeId);
            }
        }
        return rootNode;
    }

    private static void createEdge(Tree parentNode, Integer nodeId){
        Set<Integer> nodeEdges = nodesMap.get(nodeId);
        boolean hasChild = false;

        if(nodeEdges != null && !nodeEdges.isEmpty()){
            hasChild = true;
        }

        if(hasChild){
            TreeNode node = new TreeNode(nodeValues[nodeId - 1],
                    nodeColors[nodeId - 1], parentNode.getDepth() + 1);
            ((TreeNode) parentNode).addChild(node);
            Iterator<Integer> nodeIterator = nodeEdges.iterator();

            while(nodeIterator.hasNext()){
                Integer nextNodeId = nodeIterator.next();
                nodesMap.get(nextNodeId).remove(nodeId);
                createEdge(node, nextNodeId);
            }
        } else {
            TreeLeaf leaf = new TreeLeaf(nodeValues[nodeId - 1], nodeColors[nodeId - 1],
                    parentNode.getDepth() + 1);
            ((TreeNode) parentNode).addChild(leaf);
        }
    }
}


enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {

    private int result = 0;

    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        result+= leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {

    private long result = 1;
    private int tenToNinePlusSeven = 1000000007;

    public int getResult() {
        return (int) result;
    }

    public void visitNode(TreeNode node) {
        if(node.getColor().equals(Color.RED)){
            result = (result * node.getValue()) % tenToNinePlusSeven;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor().equals(Color.RED)){
            result = (result * leaf.getValue()) % tenToNinePlusSeven;
        }
    }
}

class FancyVisitor extends TreeVis {

    private int deepLeavesCount = 0;
    private int greenLeavesCount = 0;

    public int getResult() {
        return Math.abs(deepLeavesCount - greenLeavesCount);
    }

    public void visitNode(TreeNode node) {
        if(node.getDepth()%2 == 0){
            deepLeavesCount += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor().equals(Color.GREEN)){
            greenLeavesCount += leaf.getValue();
        }
    }
}
