/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

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
 public void başaekleme(int sayı)
 {
  Node eleman=new Node();
  eleman.data=sayı;
  if(head==null)
  {   eleman.next=null;
      head=eleman;
      tail=eleman;
  }
  else
  {
   eleman.next=head;
   head=eleman;
  }
 }
 public void sonaekleme(int sayı)
 {  Node eleman=new Node();
    eleman.data=sayı;
   if(head==null)
  {   eleman.next=null;
      head=eleman;
      tail=eleman;
  }
   else
   {
    eleman.next=null;
    tail.next=eleman;
    tail=eleman;
   }
   
 }
 public void arayaekleme(int sayı,int seçim_p)
 { 
   Node eleman=new Node();
   eleman.data=sayı;

   if(head==null&&seçim_p==0)
   {
     eleman.next=null;
      head=eleman;
      tail=eleman;   
   }
   else if(head!=null&&seçim_p==0)
   {
    başaekleme(seçim_p);
   }
   else
   {
     int n=0;
     Node temp=head;
     Node temp2=head;
     while(temp.next!=null)
     {
       n++;
       temp2=temp;
       temp=temp.next;
     }
     if(n==seçim_p)
     {
        temp2.next=eleman;
        eleman.next=null;
        tail=eleman;
     }
     else
     {
      temp=head;
      temp2=head;
      int i=0;
      while(i!=seçim_p)
      {
          temp2=temp;
       temp=temp.next;
       i++;
      }
      temp2.next=eleman;
      eleman.next=temp; 
     }
            
   }
   
 }
}

public class JavaApplication11 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         liste list=new liste();
       list.ekleme(11);
        list.ekleme(22);
         list.ekleme(33);
               list.başaekleme(30);
               list.sonaekleme(40);
        System.out.println("hangi indise eklemek istersiniz");
        int seçim=input.nextInt();
        list.arayaekleme(50,seçim);
           list.yazdır();
         
        
    }
}
