/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble;
import java.util.Scanner;
class BubbleSort
{
 public void bubble(int[]dizi,int n)
 {
     for (int i = 0; i <n-1; i++) 
     {
         for (int j = 0; j <n-i-1; j++)
         {
          if(dizi[j]>dizi[j+1])
          {
            int gecici;
            gecici=dizi[j];
            dizi[j]=dizi[j+1];
            dizi[j+1]=gecici; 
          }
             
             
             
             
         }
     }     
 }
    
    
}
public class Bubble {
    public static void main(String[] args) {
    
      Scanner scanner=new Scanner(System.in);
      System.out.println("dizi kaç boyutlu olsun");
      int n=scanner.nextInt();
      int[] dizi=new int[n];
      for(int i=0;i<n;i++)
      {
         dizi[i]=scanner.nextInt();
      }
      BubbleSort b=new BubbleSort();
      b.bubble(dizi,n);
      for(int i=0;i<n;i++)
      {
          System.out.println(dizi[i]+"");
      }
    }           
}
