import java.util.HashMap;

import org.w3c.dom.Node;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        HashMap<Node,Node> map = new HashMap<>();
        return clone(node,map);
    }
    public Node clone(Node node,HashMap<Node,Node> map){
        Node newNode = new Node(node.val);
        map.put(node,newNode);

        for(Node nei:node.neighbors){
            if(!map.containsKey(nei)){
                newNode.neighbors.add(clone(nei,map));
            }
            else{
                newNode.neighbors.add(map.get(nei));
            }
        }
        return newNode;
    }
}
