/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

class DaireselKuyruk
{
int rear;
int front;
int[] arr;
int capacity;
int size;
public  DaireselKuyruk(int capacity)
{
  rear=-1;
  front=-1;
  size=0;
  this.capacity=capacity;
  arr=new int[capacity];
}
public boolean isFull()
{
 return capacity==size;
}
public boolean isEmpty()
{
 return size==0;
}
public void ekleme(int değer)
{
 if(isFull())
{
 System.out.println("dizi dolu ekleme işlemi yapılamıyor");
}
 else
 {
    if (front == -1) {
                front = 0;  
                rear = 0;
            } else {
                rear = (rear + 1) % capacity;  
            }
            arr[rear] = değer;
            size++;
 }
}
  public void çıkarma()    
{
 if(isEmpty())
{
 System.out.println("dizi dolu ekleme işlemi yapılamıyor");
}
 else if(front==rear)
 {
  front=rear=-1;
 }
 else
{
  System.out.println(arr[front] + " kuyruğundan çıkarıldı.");
            front = (front + 1) % capacity;  // Dairesel artış
            size--;
}
        
}
 public void yazdır()
{
     
        if (isEmpty()) {
            System.out.println("Kuyruk boş.");
        } else {
            System.out.print("Kuyruğun elemanları: ");
            int i = front;
            while (i != rear) {
                System.out.print(arr[i] + " ");
                i = (i + 1) % capacity; 
            }
            System.out.println(arr[rear]); 
        }
  
}
}

public class JavaApplication5 {

   
    public static void main(String[] args) {
     DaireselKuyruk k1=new DaireselKuyruk(4);
          k1.ekleme(20);  
         k1.ekleme(30);
         k1.ekleme(40);
          k1.ekleme(50);
          k1.yazdır();
          k1.çıkarma();
          k1.yazdır();
           k1.ekleme(60);
           k1.yazdır();
    }   
}
