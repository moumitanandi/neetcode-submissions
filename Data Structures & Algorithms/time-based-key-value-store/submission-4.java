class TimeMap {

    class Pair {
        int timestamp;
        String value;
        
        Pair(int t, String v) {
            this.timestamp = t;
            this.value = v;
        }
    }
    
    Map<String, List<Pair>> tmap;

    public TimeMap() {
        tmap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        tmap.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair> pairs = tmap.getOrDefault(key, new ArrayList<>());
        
        int low = 0;
        int high = pairs.size() -1;
        
        String result = "";
        while (low <= high) {
            int mid = low + (high - low) /2;
            
            if(pairs.get(mid).timestamp == timestamp) return pairs.get(mid).value;
            else if(pairs.get(mid).timestamp > timestamp) {
                high = mid - 1;
            }
            else {
                result = pairs.get(mid).value;
                low = mid + 1;
            }
        }
        return result;
    }
}
