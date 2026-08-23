class WordDictionary {

    WordDictionaryNode root;

    class WordDictionaryNode{
        char value;
        boolean isWord;
        WordDictionaryNode[] children;

        WordDictionaryNode(char val) {
            this.value = val;
            this.isWord = false;
            this.children = new WordDictionaryNode[26];
        }
        WordDictionaryNode() {
            this.isWord = false;
            this.children = new WordDictionaryNode[26];
        }
    }

    public WordDictionary() {
         root = new WordDictionaryNode();
    }

    public void addWord(String word) {
        WordDictionaryNode curr = root;
        for(char c: word.toCharArray()) {
            if(curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new WordDictionaryNode();
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root); 
    }

     public boolean dfs(String word, int j, WordDictionaryNode root) {
        WordDictionaryNode curr = root;
        
        for(int i = j; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c == '.') {
                for(WordDictionaryNode child: curr.children) {
                    if(child != null && dfs(word, i+1, child)) {
                        return true;
                    }         
                }
                return false;
            }
            else {
                if(curr.children[c - 'a'] == null) {
                    return false;
                }
                curr = curr.children[c - 'a'];
            }
        }
        return curr.isWord;
    }
}


