/*
Union Find Data Structure

Given a set  of N objects (as number, 0 to N-1, for convenient):
1. Union Command: connect two objects
2. Find/connected query: is there a path connecting the two objects with out crossing a connection?

This algorithm is is often used in what's called dynamic connectivity problems.

Applications:
1. Percolation
2. Games (Go, Hex)
3. Dynamic connectivity
4. Least Common Ancestor
5. Equivalence of finite state automata
6. Hoshen-Kopelman algorithm in physics
7. Hinley-Milner polymorphic type interface
8. Kruskal's minimum spanning tree algorithm
9. Compiling equivalence statements in Fortran
10. Morphological attribute openings and closings
11. Matlab's bwlable() function in image processing
 */



// QuickFind implementation for Union Find
class QuickFindUF {
    private int id[]; // two elements, p and q, are connected if they both have the same id

    //Initialize union_find data structure with N objects and assign each elem of N an id, the index in this case
    QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
        }
    }

    /**
     * add connection between p and q. To merge components containing p and q, change all entries whose id = id[p] to id[q]
     * Quick-find defect: The union is too expensive (NxN), not acceptable
     **/
    void union(int p, int q) {
        int p_id = id[p];
        int q_id = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == p_id) id[i] = q_id;
        }
    }

    // are p and q in the same component (if n elements are connected to each other, then its a component of n objects)?
    boolean connected(int p, int q) {
        return id[p] == id[q];
    }
}



//Quick-Union implementation for Union Find, lazy approach
class QuickUnion{
    private int id[]; // of size N. id[i] is parent of i
    //Root of i is id[id[id[...[i]...]]]


    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i<N; i++) id[i] = i;
    }

    /*
    Chase parent pointer until reach root (depth of i array accesses)
     */
    private int root(int i){
        while (i != id[i]) i = id[i];
        return i;
    }

    /*
    check if p and q have the same root (depth of p and q array accessed)

    defect: Trees can get tall, which means connected() is too expensive,but linear
     */
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    /*
    Change root of p to point to root of q (depth of p and q array accessed)
    */
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}


/**
 *Improvement 1: Weighted Quick-union
 * The smaller tree always goes below and it point to the larger tree
 * Same as quick-union but maintain an extra array size[i] to count the number of objects in the tree rooted at i
 *
 * Union: Takes constant time, given roots.
 * Connected: takes time proportional to the depth of p and q
 * Proposition: Depth of any node x is at most log2 N.
 **/

class WeightedQuickUnionUF {
    private int id[]; // of size N. id[i] is parent of i
    //Root of i is id[id[id[...[i]...]]]
    private int size[];


    public WeightedQuickUnionUF(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i<N; i++) id[i] = i;
    }

    /*
    Chase parent pointer until reach root (depth of i array accesses)
     */
    private int root(int i){
        while (i != id[i]) i = id[i];
        return i;
    }

    /*
    check if p and q have the same root (depth of p and q array accessed)
     */
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    /*
    only need to modify the union:
    Link root of smaller tree to root of larger tree
    update size[]
    */
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;

        if(size[i]< size[j]) {
            id[i] = j;size[j] += size[i];
        }
        else { id[j] = i; size[i] += size[j]; }
    }

}


/**
 *Improvement 2: Weighted Quick-union with path compression
 * The smaller tree always goes below and it point to the larger tree
 * Same as quick-union but maintain an extra array size[i] to count the number of objects in the tree rooted at i
 *
 * New: just after computing the root of p, set the id of each examined node to point to that root
 *
 * Make every other node in path point to its grandparent (thereby halving path length)
 **/

class WeightedQuickUnionWithPC {
    private int id[]; // of size N. id[i] is parent of i
    //Root of i is id[id[id[...[i]...]]]
    private int size[];


    public WeightedQuickUnionWithPC(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i<N; i++) id[i] = i;
    }

    /*
    Chase parent pointer until reach root (depth of i array accesses)
     */
    private int root(int i){
        while (i != id[i]) i = id[i];
        id[i] = id[id[i]]; // Only one extra line of code!!
        return i;
    }

    /*
    check if p and q have the same root (depth of p and q array accessed)
     */
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    /*
    only need to modify the union:
    Link root of smaller tree to root of larger tree
    update size[]
    */
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;

        if(size[i]< size[j]) {
            id[i] = j;size[j] += size[i];
        }
        else { id[j] = i; size[i] += size[j]; }
    }

}



