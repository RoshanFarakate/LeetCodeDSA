class TimeMap {
    
    class Node{
        int ts;
        String val;
        Node next;
        Node prev;
        public Node(int ts, String val){
            this.ts = ts;
            this.val = val;
        }
    }
    
    Map<String, Node> myMap; 

    /** Initialize your data structure here. */
    public TimeMap() {
        myMap = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        Node node = new Node(timestamp, value);
        
        Node oldNode = myMap.get(key);
        if(oldNode!= null){
            node.next = oldNode;
            oldNode.prev = node;
        }
        myMap.put(key, node);
    }
    
    public String get(String key, int timestamp) {
        Node node = myMap.get(key);
        if(node!= null){
            return getNodeVal(node, timestamp);
        } 
        return "";
    }
    
    public String getNodeVal(Node node, int ts){
        while(node != null){
            if(node.ts <= ts){
                return node.val;
            }else{
                node = node.next;
            }
        }
        return "";
    }
}
