/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary_search_tree;
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

class Btree 
{
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
    Node delete(Node root,int x)
    {  
        Node t1,t2;
       if(root==null)
       {
          return null;
       }
       if(root.data==x)
       {
           if(root.left==root.right)
           {
              root=null;
              return null;
           }
           else if(root.left==null)
           {
              t1=root.right;
              return t1; 
           }
            else if(root.right==null)
           {
              t1=root.left;
              return t1; 
           }
           else
            {
             t1=t2=root.right;
              while(t1.left!=null)
              {
                  t1=t1.left;
              }
              t1.left=root.left;
              return t2;
            }
       }
       else
       {
          if(x<root.data)
          {
               root.left=delete(root.left,x);             
          }
          else
          {
              root.right=delete(root.right,x);  
          }
       }
       return root;
    }
}


public class Binary_Search_tree {

    
    public static void main(String[] args) {
        
        Btree bt=new Btree();
        bt.root=bt.insert(bt.root,10);
        bt.root=bt.insert(bt.root,5);
        bt.root=bt.insert(bt.root,15);
        bt.root=bt.insert(bt.root,20);
        bt.root=bt.insert(bt.root,4);
        bt.root=bt.insert(bt.root,8);
        bt.root=bt.insert(bt.root,12);
        bt.root=bt.delete(bt.root,10);

    }
    
}
