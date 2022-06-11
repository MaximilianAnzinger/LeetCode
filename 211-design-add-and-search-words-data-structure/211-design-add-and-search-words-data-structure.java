class WordDictionary {

    private Node root;
    
    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        root.addWord(word, 0);
    }
    
    public boolean search(String word) {
        return root.search(word, 0);
    }
    
    private class Node {
        boolean terminal;
        HashMap<Character, Node> childs;
        
        Node() {
            terminal = false;
            childs = new HashMap<>();
        }
        
        public void addWord(String word, int i) {
            if(i == word.length()) {
                terminal = true;
                return;
            }
            if(!childs.containsKey(word.charAt(i)))
                childs.put(word.charAt(i), new Node());
            childs.get(word.charAt(i)).addWord(word, i + 1);
        }
        
        public boolean search(String word, int i) {
            if(i == word.length())
                return terminal;
            if(word.charAt(i) == '.') {
                for(Node child : childs.values())
                    if(child.search(word, i + 1))
                        return true;
                return false;
            }
            if(childs.containsKey(word.charAt(i)))
                return childs.get(word.charAt(i)).search(word, i + 1);
            return false;
        }
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */