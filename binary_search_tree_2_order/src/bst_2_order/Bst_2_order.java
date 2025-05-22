/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bst_2_order;
class Node {
    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
        right = null;
        left = null;
    }
}

class Btree {
    Node root;

    public Btree() {
        root = null;
    }

    Node insert(Node root, int data) {
        if (root == null) {
            // Eğer mevcut kök null ise, yeni bir düğüm oluştur ve geri döndür.
            root = new Node(data);
            System.out.println(data + " ağaca eklendi");
            return root;
        }

        // Veriyi karşılaştır ve uygun alt dala ekle
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root; // Güncellenmiş kökü geri döndür
    }
    void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void inOrder(Node root)
    {
        if(root!=null)
        {      
            inOrder(root.left);
            System.out.println(root.data+" ");
            inOrder(root.right);
        }
    }
    void postOrder(Node root)
    {
        if(root!=null)
        {      
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data+" ");

        }
    }
    
}




public class Bst_2_order {
    public static void main(String[] args) {
        Btree bt=new Btree();
        bt.root=bt.insert(bt.root,10);
        bt.root=bt.insert(bt.root,8);
        bt.root=bt.insert(bt.root,15);
        bt.root=bt.insert(bt.root,5);
        bt.root=bt.insert(bt.root,12);
        bt.root=bt.insert(bt.root,20);
        bt.root=bt.insert(bt.root,9);
        System.out.println("preorder");
        bt.preOrder(bt.root);
        System.out.println("inorder");
        bt.inOrder(bt.root);
        System.out.println("postorder");
        bt.postOrder(bt.root);
    }
    
}
