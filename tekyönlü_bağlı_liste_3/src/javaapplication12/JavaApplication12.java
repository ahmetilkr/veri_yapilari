/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;
import java.util.Scanner;
class Node
{
 int data;
 Node next;
}
class liste
{
 Node head=null;
 Node tail=null;
 public void ekle(int sayı)
 {
  Node eleman=new Node();
  eleman.data=sayı;
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
 public void baştançıkar()
 {
  if(head.next==null)
  {
    head=null;
    tail=null;
  }
  else
  {
   head=head.next;
  }       
 }
 public void sondançıkar()
 {
  if(head.next==null)
  {
    head=null;
    tail=null;
  }
  else
  {
   Node temp=head;
   Node temp2=head;
   while(temp.next!=null)
   {
      temp2=temp;
      temp=temp.next;     
   }
   temp2.next=null;
   tail=temp2;
  }       
 }
 public void aradançıkar(int indis_p)
 {
  if(head==null)
         System.out.println("silinecek eleman yok");
  else if(head.next==null&&indis_p==0)
  {
   head=null;
   tail=null;
  }
  else if(head.next!=null&&indis_p==0)
  {
    head=head.next;
  }
  else
  {
     int i=0;
     Node temp=head;
     Node temp2=head;
     while(temp!=null)
     {
       i++;
       temp2=temp;
       temp=temp.next;
     }
     if(i==indis_p)
     {
       temp2.next=null;
       tail=temp2;
     }
     else
     {
      temp=head;
      temp2=head;
      int j=0;
      while(j!=indis_p)
      {
        temp2=temp;
        temp=temp.next;
        j++; 
      }
      temp2.next=temp.next;
     }
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
public class JavaApplication12 {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        liste list=new liste();
        list.ekle(11);
        list.ekle(22);
        list.ekle(33);
        list.ekle(44);        
        list.yazdır();
        System.out.println("hangi indisteki elemanı çıkarmak istersiniz");
        int indis=input.nextInt();
        list.aradançıkar(indis);
        list.yazdır();
    } 
}
