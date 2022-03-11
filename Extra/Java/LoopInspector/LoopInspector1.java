package LoopInspector;

import org.w3c.dom.Node;
import javax.imageio.metadata.*;

public class LoopInspector1 {

    public int loopSize(Node node) {
        int length = -1;
        int amountnodes = 0;

        while(node.hasChildNodes()){
            length = findLoop(node, amountnodes++);

            if (length!= -1){
                break;
            }

            node = node.getFirstChild();

        }

        return length;
    }

    private int findLoop(Node node, int amountParents){
        Node father;
        int amountParentsBeginning = amountParents;
        int amountParentsActual = amountParents;

        while (amountParentsActual-- != 0) {
            father = node.getParentNode();

            if (node.isSameNode(father)){
                return amountParentsBeginning - amountParentsActual;
            }
        }

        return -1;
    }
  
    public static void main(String[] args) { 
        LoopInspector1 sherlock = new LoopInspector1();
        IIOMetadataNode tester = new IIOMetadataNode("Pepe");

        sherlock.loopSize(tester);
    }
}