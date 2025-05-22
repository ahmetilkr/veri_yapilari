/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package çiftyönlü;
import java.util.Scanner;
 class Node
 {
  int data;
  Node prev;
  Node next;
  public Node(int data)
  {
   this.data=data;  
  }
 }
class liste
{
 Node head=null;
 Node tail=null;
 public void başaekle(int data)
 {
  Node eleman=new Node(data);
  if(head==null)
  {
   head=eleman;
   tail=eleman;
  }
  else
  {
   eleman.next=head;
   head.prev=eleman;
   head=eleman;
  }
 }
 public void sonaekle(int data)
 {
  Node eleman=new Node(data);
  if(head==null)
  {
   head=eleman;
   tail=eleman;
  }
  else
  {
   tail.next=eleman;
   eleman.next=null;
   eleman.prev=tail;
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
 public void sondanyazdır()
 {
  Node temp=tail;
   while(temp!=null)
   {
       System.out.println(temp.data);
       temp=temp.prev;
   }
 }
 public void arayaekle(int indis,int sayı)
 {
  Node eleman=new Node(sayı);
  if(indis==0)
  {
   eleman.next=head;
   head.prev=eleman;
   head=eleman;
  }
  else if(head==null)
  {
   head=eleman;
   tail=eleman;
  } 
  else
  {
   Node temp=head;
   Node temp2=head;
   int n=0;
   while(temp!=null)
   {
     n++;  
     temp=temp.next;
   }
   if(n==indis)
   {
    tail.next=eleman;
    eleman.prev=tail;
    tail=eleman;
   }
    else
    {
     int j=0;
     temp=head;
     temp2=head;     
     while(j!=indis)
     {
       j++;
       temp2=temp;
       temp=temp.next;
     }
     temp2.next=eleman;
     eleman.prev=temp2;
     eleman.next=temp;
     temp.prev=eleman;
    }
   }
  }
 public void baştansil()
{
    if(head!=null)
    {
        if(head.next==null)
        {
            head=null;
            tail=null;          
        }
        else
        {
          head=head.next;
          head.prev=null;
        }
    }   
}
  public void sondansil()
{
    if(head!=null)
    {
        if(head.next==null)
        {
            head=null;
            tail=null;          
        }
        else
        {
          tail=tail.prev;
          tail.next=null;        
        }
    }   
}
 public void aradansil(int indis)
 {
  if(indis==0)
  {
    head=head.next;
    head.prev=null;
  }
  else if(head==null)  
   {
      System.out.println("silinecek eleman yok");     
   }
  else if(head.next==null)
  {
   head=null;
   tail=null;
  }
  else
  {
    int n=0;
    Node temp=head;  
    while(temp!=null)
    {
     n++;
     temp=temp.next;
    }
    if(n>=indis)
    {
     tail=tail.prev;
     tail.next=null;
    }
    else
    {   
     temp=head;
     int i=0;
     while(i<indis)
     {
      i++;
      temp=temp.next;
     }
     temp.next.prev=temp.prev;   
     temp.prev.next=temp.next;
    }
  }
 }
  
}
public class Çiftyönlü {
 
    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       liste list=new liste();
       list.başaekle(10);
       list.başaekle(20);
       list.başaekle(30);
       list.başaekle(40);
       list.yazdır();    
       //System.out.println("hangi indise eleman eklemek istersiniz");
       //int seçim1=input.nextInt();
       //System.out.println("hangi sayıyı eklemek istersiniz");
       //int seçim2=input.nextInt();
       //list.arayaekle(seçim1,seçim2);
       //list.yazdır();
       System.out.println("hangi indisteki elemanı silmek istersiniz");
       int seçim3=input.nextInt();
       list.aradansil(seçim3);
       list.yazdır();
    }   
}
