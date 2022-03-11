package LoopInspector;

import org.w3c.dom.Node;

/** 
 * Esta solución la saqué después de ver el artículo de dmitry. El algoritmo de un nodo lento y dos rápidos
 * es suyo!!
 */
public class LoopInspector3 {
    public int loopSize(Node node) {
        node = findLoopOfNode(node);
        Node firstNode = node;
        int loopSize = 0;

        while(node != null){
            ++loopSize;
            node = node.getFirstChild();

            if (node == firstNode){ return loopSize;}
        }

        return -1;
    }

    private Node findLoopOfNode(Node node){
        Node slowNode = node;
        Node fastNode1 = node.getFirstChild();
        Node fastNode2 = fastNode1.getFirstChild();

        do {
            if (slowNode == fastNode1 || slowNode == fastNode2){ return slowNode;}

            slowNode = slowNode.getFirstChild();
            fastNode1 = fastNode2.getFirstChild();
            fastNode2 = fastNode1.getFirstChild();
        } while (slowNode != null);

        return null;
    }
}
