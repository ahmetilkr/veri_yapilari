/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

class Queue {
    int[] arr;        // Kuyruğu tutan dizi
    int front;        // Kuyruğun başındaki eleman
    int rear;         // Kuyruğun sonundaki eleman
    int size;         // Kuyruğun büyüklüğü
    int capacity;     // Kuyruğun kapasitesi

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;  // Kuyruğun başı
        rear = -1;  // Kuyruğun sonu başlangıçta boş
        size = 0;   // Kuyruk başlangıçta boş
    }

    // Kuyruğa eleman ekleme (enqueue)
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Kuyruk dolu");
        } else {
            rear++; // Sonraki boş pozisyona ekleme yapıyoruz
            arr[rear] = value;
            size++;  // Kuyruğun boyutunu artırıyoruz
            System.out.println(value + " kuyruğa eklendi");
        }
    }

    // Kuyruktan eleman çıkarma (dequeue)
    public void dequeue() {
        if (size == 0) {
            System.out.println("Kuyruk boş");
        } else {
            System.out.println(arr[front] + " kuyruğundan çıkarıldı");
            front++;  // Kuyruğun başındaki elemanı çıkarıyoruz
            size--;   // Kuyruğun boyutunu azaltıyoruz
        }
    }

    // Kuyruğun başındaki elemanı gösterme (peek)
    public int peek() {
        if (size == 0) {
            System.out.println("Kuyruk boş");
            return -1; // Boş kuyruk durumunda -1 döner
        } else {
            return arr[front]; // Kuyruğun başındaki elemanı döndürür
        }
    }

    // Kuyruğun boş olup olmadığını kontrol etme
    public boolean isEmpty() {
        return size == 0;
    }

    // Kuyruğun büyüklüğünü döndürme
    public int size() {
        return size;
    }
}

public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue q = new Queue(3); // Kuyruğun kapasitesi 3
        
        q.enqueue(10);  // Kuyruğa 10 ekle
        q.enqueue(20);  // Kuyruğa 20 ekle
        q.enqueue(30);  // Kuyruğa 30 ekle
        
        System.out.println("Kuyruğun başındaki eleman: " + q.peek());
        
        q.dequeue();    // Kuyruktan 10 çıkar
        q.dequeue();    // Kuyruktan 20 çıkar
        
        System.out.println("Kuyruğun başındaki eleman: " + q.peek());
        
        q.enqueue(40);  // Kuyruğa 40 ekle
        System.out.println("Kuyruğun başındaki eleman: " + q.peek());
    }
    
}
