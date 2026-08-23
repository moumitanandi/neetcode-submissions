class TimeMap {

    class Pair {
        String key;
        Integer value;

        Pair(String k, Integer v) {
            this.key = k;
            this.value = v;
        }
    }

    Map<String, List<Pair>> tMap;
    public TimeMap() {
        tMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        tMap.computeIfAbsent(key, k -> new ArrayList<Pair>()).add(new Pair(value, timestamp));    
    }
    
    public String get(String key, int timestamp) {
        List<Pair> tvList = tMap.getOrDefault(key, new ArrayList<>());
            int i = 0;
            int j = tvList.size() - 1;
            String result = "";
            while (i <= j) {
                int mid = i + (j - i)  / 2;
                if (tvList.get(mid).value == timestamp) {
                    return tvList.get(mid).key;
                } else if (tvList.get(mid).value > timestamp) {
                    j = mid - 1;
                } else {
                    result = tvList.get(mid).key;
                    i = mid + 1;
                }
            }
        return result;
    }
}
