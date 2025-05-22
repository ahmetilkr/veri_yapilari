/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
class Sınıf
{
 int sayi;
 Sınıf next;
}

public class JavaApplication7 {

   
    public static void main(String[] args) {
       Sınıf a =new Sınıf(); //düğüm oluşturma
          Sınıf b =new Sınıf();
            Sınıf c =new Sınıf();
            a.sayi=11;
            b.sayi=22;
            c.sayi=33;
            a.next=b;  //a yı b ye bağlama
            b.next=c;
            c.next=null;
            Sınıf temp=a;  //tempi ilk düğüme eşitleme doğrudan a kullanmama sebebi a yı kaybetmemek
            while(temp!=null)
            {
                System.out.println(temp.sayi);
                temp=temp.next;
                
            }
            
            
    }
}
