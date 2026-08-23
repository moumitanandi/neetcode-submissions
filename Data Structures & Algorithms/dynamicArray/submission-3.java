class DynamicArray {
    int[] dArray;
    int length;

    public DynamicArray(int capacity) {
        dArray = new int[capacity];
        length = 0;

    }

    public int get(int i) {
       return dArray[i];
    }

    public void set(int i, int n) {

        dArray[i] = n;
    }

    public void pushback(int n) {
        if (length == dArray.length) {
            resize(); 
        }
        dArray[length] = n; 
        length++;            
    }

    public int popback() {
        int tmp = dArray[length-1];
        length--;
        return tmp;
    }

    private void resize() {
        int[] newArray = new int[dArray.length*2];
        for (int i = 0; i < length; i++) {
            newArray[i] = dArray[i];
        }
        
        dArray = newArray;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return dArray.length;
    }

}
