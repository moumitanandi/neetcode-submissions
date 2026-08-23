class LRUCache {
    int capacity;
    Map<Integer, Node> cache;
    Node left;
    Node right;

    public LRUCache(int capacity) {
      this.capacity = capacity;
      this.cache = new HashMap<>();
      this.left = new Node(0, 0);
      this.right = new Node(0, 0);
      this.left.next = this.right;
      this.right.prev = this.left;
        
    }
    
    public void insert(Node node) {
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }

    public void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
        
    }
    public int get(int key) {
        if(cache.containsKey(key)) {
            Node temp = cache.get(key);
            remove(temp);
            insert(temp);
            return temp.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            remove(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);

        if(cache.size() > capacity) {
            Node temp = this.left.next;
            remove(temp);
            cache.remove(temp.key);
        }
    }
}

public class Node {
    int key;
    int val;
    Node prev;
    Node next;

    Node() {}

    Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
