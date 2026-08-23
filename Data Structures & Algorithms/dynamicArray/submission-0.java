class DynamicArray {
    private int[] dArray;
    private int capacity;
    private int length;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.dArray = new int[capacity];
    }

    public int get(int i) {
        return dArray[i];
    }

    public void set(int i, int n) {
        dArray[i] = n;

    }

    public void pushback(int n) {
        if(length == capacity){
            resize();
        }
        dArray[length] = n;
        length++;
    }

    public int popback() {
        if(length > 0) {
            length--;
        }
        return dArray[length];
    }

    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < length; i++) {
            newArray[i] = dArray[i];
        }
        dArray = newArray;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
