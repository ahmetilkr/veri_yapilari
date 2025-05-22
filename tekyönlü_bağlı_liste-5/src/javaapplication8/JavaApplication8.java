/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
class node
{
int data;  //her düğümün taşıdığı veriyi tutar
node next;
}
class liste
{
node head=null;
node tail=null;
public void ekle(int x)
{
 node eleman=new node();   // Yeni bir node nesnesi oluşturuluyor. 
 eleman.data=x;            // Eleman verisi 'x' olarak atanıyor.
 eleman.next=null;           // Yeni eklenen elemanın 'next' özelliği null
  if(head==null)
  {
    head=eleman;          // 'head' yeni elemanı işaret eder.
  tail=eleman;            // 'tail' de aynı şekilde yeni elemanı işaret eder.
      System.out.println("düğüm oluşturuldu ve ilk düğüm oluşturuldu");
  }
  else
  {
   tail.next=eleman;           // 'tail'in sonrasına yeni elemanı ekleriz.
   tail=eleman;                // 'tail' son elemanı işaret eder.
      System.out.println("listenin sonuna elemena eklendi");
  }        
 }
public void yazdır()
{
 if(head==null)
 {
     System.out.println("liste yapısı boş");
 }
 else
 {
 node temp=head;
 while(temp!=null)
 {
     System.out.println(temp.data);
     temp=temp.next;
 }
 
 }
}
}

public class JavaApplication8 {

   
    public static void main(String[] args) {
        liste liste1=new liste();
        liste1.ekle(11);
         liste1.ekle(22);
    liste1.ekle(33);
     liste1.ekle(44);
     liste1.yazdır();
        
    }   
}
