/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graph;
import java.util.*;

class Graph1 {
    private int dugumSayisi; // Grafın düğüm sayısı
    private LinkedList<Integer>[] komsulukListesi; // Kenarları depolamak için komşuluk listesi

    // Yapıcı metod
    public Graph1(int dugumSayisi) {
        this.dugumSayisi = dugumSayisi;
        komsulukListesi = new LinkedList[dugumSayisi];

        for (int i = 0; i < dugumSayisi; i++) {
            komsulukListesi[i] = new LinkedList<>();
        }
    }

    // Grafa bir kenar eklemek için metod
    public void kenarEkle(int kaynak, int hedef) {
        komsulukListesi[kaynak].add(hedef);
        komsulukListesi[hedef].add(kaynak); // Yönsüz graf için
    }

    // Grafı ekrana yazdırmak için metod
    public void grafiYazdir() {
        for (int i = 0; i < dugumSayisi; i++) {
            System.out.print("Düğüm " + i + " şu düğümlere bağlı: ");
            for (Integer komsu : komsulukListesi[i]) {
                System.out.print(komsu + " ");
            }
            System.out.println();
        }
    }
}

public class Graph {
  
    public static void main(String[] args) {
    
        Graph1 graf = new Graph1(5);

        graf.kenarEkle(0, 1);
        graf.kenarEkle(0, 4);
        graf.kenarEkle(1, 2);
        graf.kenarEkle(1, 3);
        graf.kenarEkle(1, 4);
        graf.kenarEkle(2, 3);
        graf.kenarEkle(3, 4);

        graf.grafiYazdir();
    }
 }

