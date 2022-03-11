package LoopInspector;

import java.util.ArrayList;
import org.w3c.dom.Node;

public class LoopInspector2 {
    public int loopSize(Node node) {
        ArrayList<Node> nodosAntecesores = new ArrayList<Node>();

        while(node.getFirstChild() != null){
            nodosAntecesores.add(node);

            for (Node node2 : nodosAntecesores) {
                if (node2 == node.getFirstChild()){
                    return nodosAntecesores.indexOf(node2)+1;
                }
            }

            node = node.getFirstChild();
        }

        return -1;
    }
}
