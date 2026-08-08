class Trie {

    class Node {
        char ch;
        boolean isTerminal;
        HashMap<Character,Node> child;

        public Node(char ch){
            this.ch=ch;
            child=new HashMap<>();
        }
    }
    private Node root;

    public Trie(){
        root=new Node('*');
    }

    //------------------Insert()----------------
    public void insert(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if (curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }else {
                Node node=new Node(ch);
                curr.child.put(ch,node);
                curr=node;
            }
        }
        curr.isTerminal=true;
    }
    //--------------Search()---------
    public boolean search(String word) {
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if (curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }else {
              return false;
            }
        }
        return curr.isTerminal;
    }
    //-------------startsWith()-----------
    public boolean startsWith(String prefix) {
        Node curr=root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (curr.child.containsKey(ch)) {
                curr = curr.child.get(ch);
            } else {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */