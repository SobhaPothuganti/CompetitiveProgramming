import java.util.*;
public class MillionGazillion {

    // implement a trie and use it to efficiently store string
    static final int ALPHABET_SIZE = 26;

    static class Trie {
        
        Trie[] children = new Trie[ALPHABET_SIZE];
      
        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;
         
        Trie(){
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
        
        static Trie root=new Trie();
        public boolean addWord(String word) {
            if(!search(word)) {
                insert(word);
                return true;
            }
            return false;
        }
        static void insert(String key)
    {
        int level;
        int length = key.length();
        int index;
      
        Trie pCrawl = root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new Trie();
      
            pCrawl = pCrawl.children[index];
        }
      
        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }

    static boolean search(String key)
    {
        int level;
        int length = key.length();
        int index;
        Trie pCrawl = root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
      
            if (pCrawl.children[index] == null)
                return false;
      
            pCrawl = pCrawl.children[index];
        }
      
        return (pCrawl != null && pCrawl.isEndOfWord);
    }

    }

