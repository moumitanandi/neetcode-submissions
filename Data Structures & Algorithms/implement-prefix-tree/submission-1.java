class PrefixTree {

    PrefixTreeNode root;

    class PrefixTreeNode{
        char value;
        boolean isWord;
        PrefixTreeNode[] children;

        PrefixTreeNode(char val) {
            this.value = val;
            this.isWord = false;
            this.children = new PrefixTreeNode[26];
        }
    }

    public PrefixTree() {
        root = new PrefixTreeNode('\0'); 
    }

    public void insert(String word) {
        PrefixTreeNode curr = root;
        for(char c: word.toCharArray()) {
            if(curr.children[c - 'a'] == null) {
               curr.children[c - 'a'] = new PrefixTreeNode(c);
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        PrefixTreeNode curr = getLast(word);
        if (curr == null) return false;
        return curr.isWord;
    }

     public PrefixTreeNode getLast(String word) {
        PrefixTreeNode curr = root;
        for(char c: word.toCharArray()) {
            if(curr.children[c - 'a'] == null) {
               return null;
            }
            curr = curr.children[c - 'a'];
        }
        return curr;
     }

    public boolean startsWith(String prefix) {
        PrefixTreeNode curr = getLast(prefix);
        if(curr == null) return false;
        return true;

    }
}
