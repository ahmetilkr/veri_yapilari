/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

 class Node
{
 Node next;
 int data;
}
 class liste
{
 Node head=null;
 Node tail=null;
 public void ekleme(int x)
 {
   Node eleman=new Node();
    eleman.data=x;
   eleman.next=null;
 if(head==null)
 {
   head=eleman;
   tail=eleman;
 }
  else
 {
  tail.next=eleman;
  tail=eleman;
 }
 }
 public void yazdır()
 {
  Node temp=head;
  while(temp!=null)
  {
      System.out.println(temp.data);
      temp=temp.next;
  }
 }
 


}

public class JavaApplication10 {


    public static void main(String[] args) {
       liste list=new liste();
       list.ekleme(11);
        list.ekleme(22);
         list.ekleme(33);
               list.yazdır();
    }
    
}
