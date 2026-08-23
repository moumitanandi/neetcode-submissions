class TimeMap {

    private Map<String, List<Pair<Integer, String>>> tMap;
    public TimeMap() {
        tMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        tMap.computeIfAbsent(key, k-> new ArrayList<>()).add(new Pair<>(timestamp, value));
    }
    
   public String get(String key, int timestamp) {
        List<Pair<Integer, String>> values = tMap.getOrDefault(key, new ArrayList<>());
        int left = 0, right = values.size() - 1;
        String result = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (values.get(mid).getKey() <= timestamp) {
                result = values.get(mid).getValue();
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    private V getValue() {
        return value;
    }
}
