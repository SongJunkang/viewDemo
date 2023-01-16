package leetcode.string;

public class Trie208 {

    //https://blog.csdn.net/m0_46202073/article/details/107253959

    TrieNode root ;


    public Trie208() {

        root = new TrieNode();

    }
    class TrieNode{

        boolean isWord;
        TrieNode[] children;

        public TrieNode() {
            isWord = false;
            children = new TrieNode[26];
        }
    }

    public void insert(String word) {

        TrieNode cur = root;

        for (int i = 0;i< word.length();i++){

            int c = word.charAt(i) - 'a';           // (关键) 将一个字符用数字表示出来，并作为下标
            if (cur.children[c] == null) {
                cur.children[c] = new TrieNode();
            }
            cur = cur.children[c];

        }
        cur.isWord = true;// 一个单词插入完毕，此时cur指向的节点即为一个单词的结尾


    }

    //【判断一个单词word是否完整存在于字典树中】
    // 思路：cur从根节点开始，按照word的字符一直尝试向下走：
    //          如果走到了null，说明这个word不是前缀树的任何一条路径，返回false;
    //          如果按照word顺利的走完，就要判断此时cur是否为单词尾端：如果是，返回true；如果不是，说明word仅仅是一个前缀，并不完整，返回false
    public boolean search(String word) {
        TrieNode cur = root;

        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            if (cur.children[c] == null) {
                return false;
            }
            cur = cur.children[c];
        }
        return cur.isWord;
    }

    //【判断一个单词word是否是字典树中的前缀】
    // 思路：和sesrch方法一样，根据word从根节点开始一直尝试向下走：
    //          如果遇到null了，说明这个word不是前缀树的任何一条路径，返回false;
    //          如果安全走完了，直接返回true就行了———我们并不关心此事cur是不是末尾(isWord)
    public boolean startsWith(String word) {
        TrieNode cur = root;

        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            if (cur.children[c] == null) {
                return false;
            }
            cur = cur.children[c];
        }
        return true;
    }


    public static void main(String[] args) {
        Trie208 trie = new Trie208();

        trie.insert("apple");

        System.out.println("trie.search(\"apple\") = " + trie.search("apple"));
        System.out.println("trie.search(\"app\") = " + trie.search("app"));
        System.out.println("trie.startsWith(\"app\") = " + trie.startsWith("app"));
    }
}

