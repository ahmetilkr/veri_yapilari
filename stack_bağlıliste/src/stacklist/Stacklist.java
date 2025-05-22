/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stacklist;

class Node
{
  int data;
  Node next;
 public Node(int data)
 {
  this.data=data;
 }
}
class Liste
{
  int size;
  int cnt;
  Node top;
 public Liste(int size)
 {
  this.size=size;
  cnt=0;
  top=null;
 }
 void push(int data)
 {
  Node eleman=new Node(data);
  if(ısFull())
  {
         System.out.println("dizi dolu");
  }
  else
  {
    if(ısEmpty())
    {
      top=eleman;
      top.next=null;
    }
    else
    {
     eleman.next=top;
     top=eleman;
    }
    cnt++;
  }
 }
 void pop()
 {
  if(ısEmpty())
  {
      System.out.println("dizi boş çıakrtacak eleman yok");
  }
  else
  {
    top=top.next;
    cnt--;
  }
 }
 boolean ısFull()
 {
   return cnt==size;
 }
 boolean ısEmpty()
 {
  return cnt==0;
 }
 public void yazdır()
 {
  if(ısEmpty())
  {
      System.out.println("dizi boş");
  }
  else
  {
    Node temp=top;
    while(temp!=null)
    {
        System.out.println(temp.data);
      temp=temp.next;
    }
  }
 }
  public void topgoster()
  {
      System.out.println("en üstteki eleman:"+top.data);
  }
}
public class Stacklist {  
    public static void main(String[] args) {
      Liste liste=new Liste(10);
      liste.push(10);
      liste.push(20);
      liste.push(30);
      liste.push(40);
      liste.yazdır();
      liste.pop();
      liste.pop();
      liste.yazdır();
    }    
}
