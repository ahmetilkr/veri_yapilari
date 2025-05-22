/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashing;

import java.awt.BorderLayout;

class Node
{
int key;
String  isim;
Node next;
public Node()
{
 next=null;
}
public Node(int key,String isim)
{
this.key=key;
this.isim=isim;
next=null;
}
}
class Tablo
{
 Node dizi[];
 int size;
 public Tablo(int size)
 {
  this.size=size;
  dizi=new Node[size];
  for(int i=0;i<size;i++)
  {
   dizi[i]=new Node();
  }
 }
  int indexüret(int key)
  {
   return key%size;
  }
  public void ekle(int key,String isim)
  {
   int index=indexüret(key);
   Node eleman=new Node(key,isim);
   if (dizi[index].next == null) 
        {
            dizi[index].next = eleman;
            System.out.println(eleman.isim + " eklendi.");
        } else
            {            
            Node temp = dizi[index].next;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = eleman;
            System.out.println(eleman.isim + " eklendi.");
             }
 }
 public void sil(int key)
 {
  int indis=indexüret(key);
  Node temp=dizi[indis];
  Node temp2=dizi[indis];
  if(temp.next==null)
  {
      System.out.println(key+"numaralı kişi yok");
  }
  else
  {
    while(temp.next!=null)
    {  
      temp2=temp;
      temp=temp.next;  
      
      if(temp.key==key)
      {
        System.out.println(temp.isim +"silindi");
        temp2.next=temp.next;   
      }            
       
    }
  }
  
 }
 public void yazdır()
{ 
    for (int i = 0; i < size; i++) 
    { 
        Node temp=dizi[i];   
     if(temp.next!=null)
     {
       while(temp.next!=null)
       {
           System.out.print(temp.next.key+"-"+temp.next.isim+"->");
           temp=temp.next;
       }
         System.out.println("");
     }
    }
}
}

public class Hashing { 
    public static void main(String[] args) {
     Tablo hTablo=new Tablo(5);
      hTablo.ekle(0,"davut");
      hTablo.ekle(10,"mehmet");
      hTablo.ekle(11,"ahmet");
      hTablo.ekle(21,"kaan");
      hTablo.ekle(22,"ali");
      hTablo.ekle(32,"ibo");
      hTablo.ekle(33,"veli");
      hTablo.ekle(43,"seyhan");
      hTablo.ekle(44,"murat");
      hTablo.ekle(54,"hasan");
      hTablo.yazdır();
      hTablo.sil(0);
      hTablo.yazdır();

    }
}
