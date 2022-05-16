package Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SortingNodesInABinaryTree {
    public static List<Integer> treeByLevels(Node node){
        List<Integer> sortedNodes = new ArrayList<Integer>();

        if (node == null){ return sortedNodes;}

        Node nodeToAdd;
        Queue<Node> newNodes = new LinkedList<Node>();
        newNodes.offer(node);
        do {
            nodeToAdd = newNodes.poll();
            if (nodeToAdd != null){
                sortedNodes.add(nodeToAdd.value);

                newNodes.offer(nodeToAdd.left);
                newNodes.offer(nodeToAdd.right);
            }

        } while (! newNodes.isEmpty());
        
        return sortedNodes;
    }

    private static class Node {
        public Node left;
        public Node right;
        public int value;
        
        public Node(Node l, Node r, int v) {
        left = l;
        right = r;
        value = v;
        }
    }

    public static void main(String[] args) {
    //    System.out.println(treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1)));System.out.println(treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1)));
        System.out.println(treeByLevels(new Node(new Node(null, new Node(null, null, 1), 8), new Node(new Node(null, null, 5), new Node(null, null, 6), 9), 2)));
        System.out.println(treeByLevels(new Node(new Node(null, new Node(null, null, 4), 8), new Node(new Node(null, null, 5), new Node(null, null, 6), 4), 1)));
    
    }
}
