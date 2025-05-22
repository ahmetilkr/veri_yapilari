/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack.liste;

class Node
{
 int data;
 Node next;
}
class Stack
{
  Node top=null;
  public void push(int sayı)
  {
   Node eleman=new Node();
   eleman.data=sayı;
   if(top==null)
   {
    eleman.next=null;
    top=eleman;
   }
   else
   {
    eleman.next=top;
    top=eleman;
   }
  }
  public void yazdır()
  {
   Node temp=top;
   while(temp!=null)
   {
       System.out.println(temp.data);
       temp=temp.next;
   }
  }
  public void pop()
  {
   if(top==null)
     System.out.println("çıkarılacak bir eleman yok");
   else if(top.next==null)
     top=null;
   else
   {
    top=top.next;
   }
  
  
  }
}
public class StackListe {

   
    public static void main(String[] args) {
       Stack stack=new Stack();
       stack.push(10);
       stack.push(20);
       stack.push(30);
       stack.yazdır();
       stack.pop();
       stack.yazdır();
       
    }
    
}
