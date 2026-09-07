public class Node{
int key;
int val;
Node prev;
Node next;

    public Node(int key, int val){
        this.key =  key;
        this.val =  val;
        this.prev =  null;
        this.next =  null;

    }

}



class LRUCache {
    HashMap<Integer, Node> cache;
    Node left;
    Node right;
    int cap;


    public LRUCache(int capacity) {
        this.cap =  capacity;
        this.cache = new HashMap<>();
        this.left= new Node(0,0);
        this.right =  new Node(0,0);
        this.left.next =  right;
        this.right.prev =  left;
        
    }

    public void insert(Node node){

        Node tmp =  this.right.prev;
        tmp.next = node;
        node.prev = tmp;
        node.next = this.right;
        this.right.prev =  node;

    }
    public void remove(Node node){

        Node prev =  node.prev;
        Node next =  node.next;
        prev.next =  next;
        next.prev =  prev;


    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node =  cache.get(key);
            remove(node);
            insert(node);
            return node.val;

        }
      return  -1;  
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node =  cache.get(key);
            remove(node);
        }
        Node newNode =  new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);
        if(cache.size() > cap){
            Node lru  =  this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
        
    }
}
