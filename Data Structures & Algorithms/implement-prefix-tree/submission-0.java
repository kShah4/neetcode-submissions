public class TrieNode{
    TrieNode [] children =  new TrieNode[26];
    boolean isEnd = false;
}

class PrefixTree {
    private TrieNode root;
    


    public PrefixTree() {
        root =  new TrieNode();
         
    }

    public void insert(String word) {
        TrieNode curr  = root;
        for(char c :  word.toCharArray()){
            int i =  c - 'a';
            if(curr.children[i] == null){
                curr.children[i] =  new TrieNode();
            }
            curr =  curr.children[i];

        }
        curr.isEnd = true;

    }

    public boolean search(String word) {
        TrieNode curr  = root;
        for(char c :  word.toCharArray()){
            int i =  c- 'a';
            if(curr.children[i] == null){
                return false;
            }
            curr=  curr.children[i];

        }

        return curr.isEnd;

    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (cur.children[i] == null) {
                return false;
            }
            cur = cur.children[i];
        }
        return true;

    }
}
