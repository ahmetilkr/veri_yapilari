/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary_search;

class Node
{
 public int deger;
 public Node sagnode;
 public Node solnode;  
}
class tree
{
 public Node kök;
 public void ekle(int gelecekdeger)
 {
  if(kök==null)
  {
   kök=new Node();
   kök.deger=gelecekdeger;
  }
  else
  {
 Node mevcutkonum = kök;
  while(true)
  {
  if(gelecekdeger>mevcutkonum.deger)
  {
   if(mevcutkonum.sagnode==null)
   {
    mevcutkonum.sagnode=new Node();
    mevcutkonum.sagnode.deger=gelecekdeger;
    break;
   }
   else
   {
    mevcutkonum=mevcutkonum.sagnode;
   }
  }
  else if(gelecekdeger<mevcutkonum.deger)
  {
   if(mevcutkonum.solnode==null)
   {
    mevcutkonum.solnode=new Node();
    mevcutkonum.solnode.deger=gelecekdeger;
    break;
   }
   else
   {
    mevcutkonum=mevcutkonum.solnode;        
   }
  }
    else if(gelecekdeger==mevcutkonum.deger)
    {
        System.out.println("eklemek istediğiniz değer ağaç içinde mevcuttur");
        break;
    }
  }                     
 
  }
 }
 public void arama(int aranacakdeger)
 {
  Node mevcutkonum=kök;
  while(true)
  {
   if(mevcutkonum==null)
  {
       System.out.println("sonç bulunamadı");
       break;
       
   }
   else if(mevcutkonum.deger==aranacakdeger)
   {
       System.out.println("sonuç bulundu");
       break;
   }
   else if(mevcutkonum.deger>aranacakdeger)
   {
       mevcutkonum=mevcutkonum.solnode;
   }
      else if(mevcutkonum.deger<aranacakdeger)
      {
               mevcutkonum=mevcutkonum.sagnode;

      }

  }
  
 }
}

public class Binary_search { 
    public static void main(String[] args) {
         tree ikiliAgac = new tree();
        ikiliAgac.ekle(15);
        ikiliAgac.ekle(10);
        ikiliAgac.ekle(20);
        ikiliAgac.ekle(8);
        ikiliAgac.ekle(12);
        ikiliAgac.arama(10); 
        ikiliAgac.arama(5);     
    }
    
}
