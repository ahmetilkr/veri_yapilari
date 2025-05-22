/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;
import java.util.Scanner;
class Sort
{
 public void quicksort(int[]dizi,int bas,int son)
 {
  int i,j,pivot,temp;
  i=bas;
  j=son;
  pivot=dizi[(i+j)/2];
  
 do
 {
   while(dizi[i]<pivot)
   {
    i++;
   }
   while(dizi[j]>pivot)
   {
    j--;
   }
   if(i<=j)
   {
    temp=dizi[i];
    dizi[i]=dizi[j];
    dizi[j]=temp;
    i++;
    j--;
   }
 }while(i<j);
 if(i<son)
 {
  quicksort(dizi,i,son);
 }
 if(bas<j)
 {
    quicksort(dizi,bas,j);
 }
}



}

public class Quicksort { 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("dizi boyutu giriniz");
        int boyut=input.nextInt();
        int[]dizi=new int[boyut];
        for(int i=0;i<boyut;i++)
        {
         System.out.println("sayıları giriniz");
         dizi[i]=input.nextInt();
        }
        Sort s=new Sort();
        s.quicksort(dizi,0,boyut-1);
        for (int i = 0; i < boyut; i++) 
        {
            System.out.println(dizi[i]);
        }
    }
    
}
