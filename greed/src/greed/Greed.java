/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greed;

class GreedyParaBozma
{
    
    public static void paraBoz(int miktar) {
        // Madeni para birimleri (büyükten küçüğe sıralı)
        int[] madeniParalar = {50, 20, 10, 5, 1};
        
        // Kullanılacak madeni paraların sayısını saklamak için bir dizi
        int[] paraSayilari = new int[madeniParalar.length];
        
        // Miktarı bozmaya başla
        for (int i = 0; i < madeniParalar.length; i++) {
            if (miktar >= madeniParalar[i]) {
                paraSayilari[i] = miktar / madeniParalar[i]; // Bu madeni paradan kaç tane kullanılacağı
                miktar -= paraSayilari[i] * madeniParalar[i]; // Kalan miktarı hesapla
            }
        }
        
        // Sonuçları yazdır
        if (miktar == 0) {
            System.out.println("En az sayıda madeni para ile ödeme:");
            for (int i = 0; i < madeniParalar.length; i++) {
                if (paraSayilari[i] > 0) {
                    System.out.println(madeniParalar[i] + " birimi: " + paraSayilari[i] + " tane");
                }
            }
        } else {
            System.out.println("Verilen miktar, mevcut madeni paralarla tam olarak bozulamadı.");
        }
    }
}
public class Greed {

    
    public static void main(String[] args) {
          // Örnek miktar
          GreedyParaBozma g1=new GreedyParaBozma();
        int miktar = 68; // 68 birimlik para
        g1.paraBoz(miktar); // Greedy algoritmasını çağır
    }
    
}
