/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b.tree;
class BTreeNode {
    int[] keys;       // Anahtarlar
    BTreeNode[] children; // Çocuk düğümler
    int n;            // Anahtar sayısı
    boolean isLeaf;   // Yaprak mı?

    // Constructor
    public BTreeNode(int t, boolean isLeaf) {
        this.keys = new int[2 * t - 1]; // Maksimum 2t-1 anahtar
        this.children = new BTreeNode[2 * t]; // Maksimum 2t çocuk
        this.n = 0;
        this.isLeaf = isLeaf;
    }
}

// B-Tree Sınıfı
class Btree {
    private BTreeNode root; // Kök düğüm
    private int t;          // Minimum derece

    // Constructor
    public Btree(int t) {
        this.root = null;
        this.t = t;
    }

    // Arama
    public boolean search(int key) {
        return root != null && searchInNode(root, key);
    }

    private boolean searchInNode(BTreeNode node, int key) {
        int i = 0;
        while (i < node.n && key > node.keys[i]) {
            i++;
        }

        if (i < node.n && node.keys[i] == key) {
            return true; // Anahtar bulundu
        }

        if (node.isLeaf) {
            return false; // Yaprakta bulunamadı
        }

        return searchInNode(node.children[i], key);
    }

    // Ekleme
    public void insert(int key) {
        if (root == null) {
            root = new BTreeNode(t, true);
            root.keys[0] = key;
            root.n = 1;
        } else {
            if (root.n == 2 * t - 1) {
                BTreeNode newRoot = new BTreeNode(t, false);
                newRoot.children[0] = root;
                splitChild(newRoot, 0, root);

                int i = (key > newRoot.keys[0]) ? 1 : 0;
                insertNonFull(newRoot.children[i], key);

                root = newRoot;
            } else {
                insertNonFull(root, key);
            }
        }
    }

    private void insertNonFull(BTreeNode node, int key) {
        int i = node.n - 1;

        if (node.isLeaf) {
            while (i >= 0 && key < node.keys[i]) {
                node.keys[i + 1] = node.keys[i];
                i--;
            }
            node.keys[i + 1] = key;
            node.n++;
        } else {
            while (i >= 0 && key < node.keys[i]) {
                i--;
            }
            i++;
            if (node.children[i].n == 2 * t - 1) {
                splitChild(node, i, node.children[i]);
                if (key > node.keys[i]) {
                    i++;
                }
            }
            insertNonFull(node.children[i], key);
        }
    }

    private void splitChild(BTreeNode parent, int i, BTreeNode fullChild) {
        BTreeNode newChild = new BTreeNode(t, fullChild.isLeaf);
        newChild.n = t - 1;

        for (int j = 0; j < t - 1; j++) {
            newChild.keys[j] = fullChild.keys[j + t];
        }

        if (!fullChild.isLeaf) {
            for (int j = 0; j < t; j++) {
                newChild.children[j] = fullChild.children[j + t];
            }
        }

        fullChild.n = t - 1;

        for (int j = parent.n; j >= i + 1; j--) {
            parent.children[j + 1] = parent.children[j];
        }
        parent.children[i + 1] = newChild;

        for (int j = parent.n - 1; j >= i; j--) {
            parent.keys[j + 1] = parent.keys[j];
        }
        parent.keys[i] = fullChild.keys[t - 1];
        parent.n++;
    }
}





public class BTree {  
    public static void main(String[] args) {
        Btree tree = new Btree(2);
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(6);
        tree.insert(12);

        // Anahtar arama
        System.out.println(tree.search(6) ? "Bulundu" : "Bulunamadı"); // Bulundu
        System.out.println(tree.search(15) ? "Bulundu" : "Bulunamadı"); // Bulunamadı
        
    }
    
}
