class LinkedList {
    List<Integer> list;

    public LinkedList() {
        list = new ArrayList<>();
    }

    public int get(int index) {
        if(index >= list.size()) return -1;
        return list.get(index);
    }

    public void insertHead(int val) {
        List<Integer> newList = new ArrayList<>();
        newList.add(val);
        for(int i = 0; i < list.size(); i++) {
            newList.add(list.get(i));
        }
        list = newList;
        
    }

    public void insertTail(int val) {
        list.add(val);
    }

    public boolean remove(int index) {
        if(index >= list.size()) return false;
        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
             if(i != index) {
                newList.add(list.get(i));
             }
        }
        list = newList;
        return true;
    }

    public ArrayList<Integer> getValues() {
        return new ArrayList<>(list);
    }
}
