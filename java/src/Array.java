import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
public class Array {
    public static void main(String[] args) {
        // Dizi Başlatma
        int[] tamsayı = {5, 4, 6, 8, 8, 10, 14, 19, 30};
        int sum = 0;
        for (int i = 0; i < tamsayı.length; i++) {
            sum += tamsayı[i];
            System.out.println(tamsayı[i] + " toplam : " + sum);
        }

        // En büyük ve en küçük öğe
        int max = tamsayı[0];
        int min = tamsayı[0];
        for (int i = 1; i < tamsayı.length; i++) {
            if (tamsayı[i] > max) {
                max = tamsayı[i];
            }
            if (tamsayı[i] < min) {
                min = tamsayı[i];
            }
        }
        System.out.println("En büyük eleman :" + max);
        System.out.println("En küçük elaman : " + min);


        // Dizi Sıralama
        Arrays.sort(tamsayı);
        System.out.println("Sıralanmış dizi : " + Arrays.toString(tamsayı));

        //Dizide Arama
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aramak istediğiniz sayıyı giriniz");
        int sayı = scanner.nextInt();

        boolean bulundu = false;
        int indeks = -1;
        for (int i = 0; i < tamsayı.length; i++) {
            if (tamsayı[i] == sayı) {
                bulundu = true;
                indeks = i;
                break;
            }
        }
        if (bulundu) {
            System.out.println("Aranan eleman " + indeks + " .indekste bulundu");
        } else {
            System.out.println("Aranan eleman bulunamadı");
        }

        // Dizi ters çevirme

        for (int i = tamsayı.length - 1; i >= 0; i--) {

            System.out.println(tamsayı[i] + " ");
        }
        System.out.println("----------------Dizi Çoğaltma");
        //Dizi çoğaltma
        ArrayList<Integer> yeniDizi = new ArrayList<>();
        for (int i = 0; i < tamsayı.length; i++) {
            if (!yeniDizi.contains(tamsayı[i])) {
                yeniDizi.add(tamsayı[i]);
            }
        }
        for (int i = 0; i < yeniDizi.size(); i++) {
            System.out.println(yeniDizi.get(i) + " ");
        }


        // İki boyutlu Diziler
        int diziler[][] = {{1, 2, 3},
                {5, 6, 7},
                {10, 11, 12},};
        for (int i = 0; i < diziler.length; i++) {
            for (int j = 0; j < diziler.length; j++) {
                System.out.print(diziler[i][j] + "\t");
            }
            System.out.println();
        }


        //Dizi İşleme
        System.out.println("Kaldırılacak elemanın indeksini girin :");
        int kaldıralacakIndeks = scanner.nextInt();
        System.out.println("Yeni elemanı girin :");
        int yeniEleman = scanner.nextInt();

        if (kaldıralacakIndeks >= 0 && kaldıralacakIndeks < tamsayı.length) {
            tamsayı[kaldıralacakIndeks] = yeniEleman;
            System.out.println("Değiştirilmiş dizi ");
            for (int i = 0; i < tamsayı.length; i++) {
                System.out.println(tamsayı[i]);
            }
        } else {
            System.out.println("Geçersiz indeks !");
        }

        // Dizi istatikleri
        int[] dizi = {7, 2, 3, 9, 10, 15, 2, 20, 12};
        double ortalama=ortalamaBul(dizi);
        System.out.println("Ortalama :" + ortalama);
        double medyan=medyanBul(dizi);
        System.out.println("Medyan :" + medyan);
        double mod=moduHesapla(dizi);
        System.out.println("Mod : " + mod);
    }

    public static double ortalamaBul(int[] dizi) {
        int toplam = 0;
        double ortalama = 0;
        for (int sayi : dizi) {
            toplam += sayi;
        }
        return (double) toplam/ dizi.length;
    }
    public static double medyanBul(int[]dizi){
        Arrays.sort(dizi);
        int ortaIndex= dizi.length/2;
        if(dizi.length%2 ==1){
            return dizi[ortaIndex];
        }else{
            return (dizi[ortaIndex-1]+dizi[ortaIndex])/2.0;
        }
    }
    public static int moduHesapla(int[] dizi) {
        Arrays.sort(dizi);
        int mod = dizi[0];
        int maksTekrar = 0;
        int gecerliTekrar = 1;

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] == dizi[i - 1]) {
                gecerliTekrar++;
            } else {
                if (gecerliTekrar > maksTekrar) {
                    maksTekrar = gecerliTekrar;
                    mod = dizi[i - 1];
                }
                gecerliTekrar = 1;
            }
        }

        if (gecerliTekrar > maksTekrar) {
            mod = dizi[dizi.length - 1];
        }

        return mod;
    }

}
