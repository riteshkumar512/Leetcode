class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
         Trie t=new Trie();
        for (String s:dictionary){
            t.insert(s);
        }
        String [] arr=sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
        sb.append(t.getString(arr[i])).append(" ");        }
        return sb.toString().trim();
    }

     public class Trie {
        class Node {
            char ch;
            String isTerminal;
            HashMap<Character, Node> child;

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
            curr.isTerminal=word;
        }

        public String getString(String word){
            Node curr=root;
            for (int i = 0; i < word.length(); i++) {
                char ch=word.charAt(i);
                if (curr.child.containsKey(ch)){
                    curr=curr.child.get(ch);
                    if (curr.isTerminal !=null){
                        return curr.isTerminal;
                    }
                }else {
                    return word;
                }
            }
            return word;
        }
    }

   
}