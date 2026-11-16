/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node,Node> mapCloned=new HashMap();
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        Node cloned= new Node(node.val);
        if(mapCloned.containsKey(node)){
            return mapCloned.get(node);
        }
        else {
        mapCloned.put(node, cloned);
        for(Node neighbor: node.neighbors){
            if(mapCloned.containsKey(neighbor)){
            cloned.neighbors.add(mapCloned.get(neighbor));
            }
            else{
              Node result=cloneGraph(neighbor);
              cloned.neighbors.add(result);
            }
        }
        }

return cloned;

        
    }
}