import java.util.LinkedList;
import java.util.Queue;

/**
 * Symbol Table data structures are data types that are often in the format of a key and value.
 * Some ST:
 *  List, LinkedList, BST, Map, HashMap, etc.
 *  See the documentation for further definitions.
 * @param <K>
 * @param <V>
 */

public class SymbolTable<K, V> {
    public static void main(String[] args) {
        System.out.println("aks fadsf");

    }
}


/**
 * Implementation of Binary Search Tree
 * @param <Key>
 * @param <Value>
 */
class BinarySearcTree<Key extends Comparable<Key>, Value> {
    private Node root;

    public void put(Key key, Value val) {
        root = put(root, key, val);
    }

    public Value get(Key key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) x = x.left;
            else if (cmp > 0) x = x.right;
            else return x.val;
        }
        return null;
    }

    public void delete(Key key) {
        delete(root, key);
    }

    //Delete smallest key
    public void deleteMin() {
        root = deleteMin(root);
    }

    public Key min() {
        return minKey(root);
    }

    //largest key
    public Key max() {
        return maxKey(root);
    }

    //Delete largest key
    public void deleteMax() {
        root = deleteMax(root);
    }

    /**
     * Returns the number of keys < key
     * Ex: Key = [4, 56, 57, 45, 34, 35] and key = 34
     * Then rank(key) = 4
     */
    public int rank(Key key) {
        return rank(key, root);
    }

    //Number of key-value pairs in each subtree, if x==root, it's the size of the entire tree.
    public int size() {
        return size(root);
    }

    //key of rank k.
    public Key select(Key key) {
        int rank = rank(key);
        return select(root, rank);
    }

    //Number of keys in [lo...hi]
    public int size(Key lo, Key hi) {
        if (lo == null) throw new IllegalArgumentException("first argument to size() is null");
        if (hi == null) throw new IllegalArgumentException("second argument to size() is null");
        if (lo.compareTo(hi) > 0) return 0;
        if (contains(hi)) return rank(hi) - rank(lo) + 1;
        else return rank(hi) - rank(lo);
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    //Largest key less than or equal to key
    public Key floor(Key key) {
        Node x = floor(root, key);
        if (x == null) return null;
        return x.key;
    }

    //Smallest key greater than or equal to key
    public Key ceiling(Key key) {
        Node x = ceiling(root, key);
        if (x == null) return null;
        return x.key;
    }

    //Inorder traversal
    public Iterable<Key> iterator() {
        Queue<Key> q = new LinkedList<Key>();
        inorder(root, q);
        return q;
    }

    private class Node {
        private Key key;
        private Value val;
        private Node left, right;
        private int count;

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    private Node put(Node x, Key key, Value val) {
        if (x == null) return new Node(key, val);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, val);
        else if (cmp > 0) x.right = put(x.right, key, val);
        else x.val = val;
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    private Node deleteMax(Node x) {
        if (x.right == null) return x.left;
        x.right = deleteMin(x.right);
        x.count = 1 + size(x.right) + size(x.left);
        return x;
    }

    private Node delete(Node root, Key key) {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;

        /* Otherwise, recur down the tree */
        int cmp = key.compareTo(root.key);
        if (cmp < 0) root.left = delete(root.left, key);
        else if (cmp > 0) root.right = delete(root.right, key);
            // if key is same as root's
            // key, then This is the
            // node to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.key = minKey(root.right);

            // Delete the inorder successor
            root.right = delete(root.right, root.key);
        }
        return root;
    }

    private Key minKey(Node root) {
        Key minKey = root.key;
        while (root.left != null) {
            minKey = root.left.key;
            root = root.left;
        }
        return minKey;
    }

    private Key maxKey(Node root) {
        Key maxKey = root.key;
        while (root.right != null) {
            maxKey = root.right.key;
            root = root.right;
        }
        return maxKey;
    }

    private Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    private int rank(Key key, Node x) {
        if (x == null) return 0;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return rank(key, x.left);
        else if (cmp > 0) return 1 + size(x.left) + rank(key, x.right);
        else return size(x.left);
    }

    private Key select(Node x, int rank) {
        if (x == null) return null;
        int leftSize = size(x.left);
        if (leftSize > rank) return select(x.left, rank);
        else if (leftSize < rank) return select(x.right, rank - leftSize - 1);
        else return x.key;
    }

    private int size(Node x) {
        if (x == null) return 0;
        return x.count;
    }

    private Node floor(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp < 0) return floor(x.left, key);

        Node t = floor(x.right, key);
        if (t != null) return t;
        else return x;

    }

    private Node ceiling(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp < 0) return floor(x.right, key);

        Node t = floor(x.left, key);
        if (t != null) return t;
        else return x;

    }

    private void inorder(Node x, Queue<Key> q) {
        if (x == null) return;
        inorder(x.left, q);
        q.add(x.key);
        inorder(x.right, q);
    }
}

/**
 * Implementation of the 2-3 Search Tree as red-black Binary Search Tree
 * @param <Key>
 * @param <Value>
 */

class TwoThreeSearchTree<Key extends Comparable<Key>, Value>{
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    public boolean isRed(Node x){ return x.right.color==RED;}

    private Node rotateLeft(Node h){
        assert isRed(h.right);
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node rotateRight(Node h){
        assert isRed(h.left);
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColor(Node h){
        assert !isRed(h);
        assert !isRed(h.left);
        assert isRed(h.right);
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    private class Node{
        Key key;
        Value value;
        Node left, right;
        boolean color;

        public Node(Key key, Value value, Node left, Node right, boolean color) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.color = color;
        }
    }

}

/**
 * Generalizing 2-3 trees by allowing up to M-1 key-link pairs per node.
 */
class B_Tree{

}