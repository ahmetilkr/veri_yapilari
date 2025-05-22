/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linear;
import java.util.Scanner;
class Arama
 {
    public void linearSearch(int dizi[],int boyut,int aranan)
    {
      boolean bul=false;
      for(int i=0;i<boyut;i++)
      {
        if(aranan==dizi[i])
        {
            System.out.println("aranan sayı bulundu");
            bul=true;
            break;
        }
      }
        if(bul==false)
        System.out.println("bulunamadı");
    }
    
 }






public class Linear {   
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("dizinin boyutunu giriniz");
        int boyut=scanner.nextInt();
        int[]dizi=new int[boyut];
        for(int i=0;i<boyut;i++)
        {
            dizi[i]=scanner.nextInt();
        }
        System.out.println("aranacak sayıyı yazın");
        int aranan=scanner.nextInt();
        Arama l=new Arama();
        l.linearSearch(dizi,boyut,aranan);
}  
}
