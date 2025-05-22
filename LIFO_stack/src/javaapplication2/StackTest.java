/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

 class Stack
 {
     int capacity;
     int last;
     int size;
     int[]arr;   
  public Stack(int capacity)
  {
  this.capacity=capacity;
  arr=new int[capacity];
  last=-1;
  }
  public void push(int değer)
  {
  if(last==capacity-1)
  {
  System.out.println("dizi dolu");
  }
  else
  {last++;
  size++;
  arr[last]=değer;
  }
  }
  public void pop()
  {
  if(last<0)
  {
  System.out.println("dizi boş eleman");
  }
  else
  {
  int değer=arr[last];
  System.out.println(değer+"cikarildi");
  last--;
  }
  }
 }
public class StackTest {
    
    public static void main(String[] args) {
    Stack s=new Stack(2);
    s.push(15);
    s.push(20);
    s.pop();
   
    }
    
}
