class LRUCache {
    private final Map<Integer, Integer> cacheMap;
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }
    
    public int get(int key) {
        return cacheMap.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        cacheMap.put(key, value);
    }
}
