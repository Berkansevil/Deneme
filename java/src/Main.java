//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int max(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------- Üç Sayı Arasından En Büyük ");
        Scanner scanner = new Scanner(System.in);
           /* System.out.print("İlk sayı : ");
            int firstNumber = scanner.nextInt();
            System.out.print("İkinci sayı :");
            int secondNumber = scanner.nextInt();
            System.out.print("Üçüncü sayı :");
            int thirdNumber = scanner.nextInt();

            System.out.println("En büyük sayı " + max(firstNumber, secondNumber, thirdNumber));
            System.out.println("---------------------------------------------------  Hesap Makinesi");
            System.out.println("İlk sayıyı giriniz :");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("İkinci sayıyı giriniz :");

            int sayı = scanner.nextInt();
            int sayı1 = scanner1.nextInt();
            System.out.println("İki sayının toplamı :" + (sayı + sayı1));
            System.out.println("İki sayının çıkarımı :" + (sayı - sayı1));
            System.out.println("İki sayının çarpımı :" + (sayı * sayı1));
            System.out.println("İki sayının bölümü :" + (sayı / sayı1));


            System.out.println("---------------------------------Çift veya Tek");
            System.out.print("Sorgulamak istediğiniz sayıyı giriniz :");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.print("Girdiğiniz değer çifttir .");
            } else {
                System.out.print("Girdiğiniz değer tektir.");
            }

            System.out.println("\n---------------------------------- Basit Faiz Hesaplayıcı");
            System.out.println("Ana para miktarı");
            double anaPara = scanner.nextDouble();
            System.out.println("Yıllık faiz oranı : ");
            double faiz = scanner.nextDouble();
            System.out.println("Süre (yıl )");
            int sure = scanner.nextInt();

            double faizMiktarı = anaPara * (faiz / 100) * sure;
            double toplamTutar = anaPara + faizMiktarı;

            System.out.println("Faiz Miktarı : " + faizMiktarı);
            System.out.println("Toplam  tutar : " + toplamTutar);

            System.out.println("---------------------------------- Not Hesaplayıcı :");
            System.out.print("Notunuzu giriniz :");
            int sayi = scanner.nextInt();
            if (sayi > 0 && sayi < 100) {
                if (sayi >= 0 && sayi < 25) {
                    System.out.println("FF");
                } else if (sayi >= 25 && sayi < 50) {
                    System.out.println("DD");

                } else if (sayi >= 50 && sayi < 75) {
                    System.out.println("BB");
                } else if (sayi >= 75 && sayi <= 100) {
                    System.out.println("AA");
                } else {
                    System.out.println("Girdiğiniz not değeri yanlıştır.");
                }
            }

            System.out.println("\n----------------------- Bir Sayının Üssünü Alma");
            System.out.print("Taban sayısını giriniz : ");
            double taban = scanner.nextDouble();

            System.out.println("üs sayısını giriniz : ");
            int us = scanner.nextInt();
            double sonuc = 1;
            for (int i = 1; i <= us; i++) {
                sonuc *= taban;
            }
            System.out.println("Sonuc : " + sonuc);
        */
        System.out.println("\n-------------------------------------- Verilen bir cümlede kaç adet boşluk karakteri bulunduğunu bulan bir Java programı yazın.");
        System.out.println("Bir cümle giriniz : ");
        String text = scanner.nextLine();
        int sayac = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                sayac++;
            }
        }
        System.out.println("Girilen cümle  " + sayac + "tane boşluk karakteri bulundurmaktadır.");

        System.out.println(" \n--------------------------- Bir kullanıcıdan alınan bir kelimenin palindrom olup olmadığını kontrol eden bir Java programı yazın.");
        System.out.print("Sorgulamak istediğiniz kelimeyi giriniz : ");
        String kelime = scanner.nextLine();
        if (isPalindrom(kelime)) {
            System.out.println(kelime + " bir palindrom kelimedir");
        } else {
            System.out.println(kelime + " bir palindrom kelime değildir");
        }


        System.out.println("\n-------------------Kullanıcıdan alınan bir cümlede belirli bir kelimenin kaç kez geçtiğini sayan bir Java programı yazın");
        String word = scanner.nextLine();
        System.out.println("Aranacak kelimeyi giriniz : ");
        String arananKelime = scanner.next();

        int counter = sayKelime(word, arananKelime);
        System.out.println("Girilen cümlede \"" + arananKelime + "\" kelimesi " + sayac + " kez geçmektedir.");


        System.out.println("\n----------Bir cümledeki kelimeleri tersten sıralayarak ekrana yazdıran bir Java programı yazın.");
        System.out.println("Kelime giriniz : ");
        String metin = scanner.nextLine();
        System.out.println(reverse(metin));


        System.out.println("---------------Kullanıcıdan alınan iki kelimenin anagram olup olmadığını kontrol eden bir Java programı yazın.");
        System.out.println("İlk kelimeyi giriniz :");
        String kelime1=scanner.nextLine();
        System.out.println("İkinci kelimeyi giriniz : ");
        String kelime2=scanner.nextLine();

        char[] harfDizisi1 = kelime1.toLowerCase().toCharArray();
        char[] harfDizisi2 = kelime2.toLowerCase().toCharArray();

        Arrays.sort(harfDizisi1);
        Arrays.sort(harfDizisi2);

        boolean anagram =Arrays.equals(harfDizisi1,harfDizisi2);
        if(anagram){
            System.out.println(kelime1+ "  ve " + kelime2 + " anagramdır");
        }else{
            System.out.println(kelime1 +" ve "+ kelime2 + " anagram değildir.");
        }

        System.out.println("---------------Bir cümledeki tüm kelimelerin ilk harfini büyük harfe dönüştüren bir Java programı yazın.");
        System.out.println("Cümle  giriniz : ");
        String sentence=scanner.nextLine();
        String [] words=sentence.split(" ");
        StringBuilder son=new StringBuilder();
        for(String wordy :words){
            if(!wordy.isEmpty()){
                char ılkHarf=Character.toUpperCase(wordy.charAt(0));
                String geriKalan=wordy.substring(1).toLowerCase();
                son.append(ılkHarf).append(geriKalan).append(" ");
            }
        }
        System.out.println("Sonuç :" +son.toString().trim());

        System.out.println("-----------------Bir cümledeki en uzun kelimeyi ve kelime uzunluğunu bulan bir Java programı yazın.");
        System.out.println("Bir cümle giriniz :");
        String cüm=scanner.nextLine();
        String [] kelımeler=cüm.split(" ");
        String enUzunKelime="";
        for(String kelıme:kelımeler){
            if(kelıme.length()>enUzunKelime.length()){
                enUzunKelime=kelime;
            }
        }
        System.out.println("En uzun kelime : " + enUzunKelime + "Kelime uzunluğu :" + enUzunKelime.length());

        System.out.println("--------------------------Bir kelimenin içindeki sesli harfleri ve sessiz harfleri sayan bir Java programı yazın. ");
        System.out.println("Bir metin giriniz :");
        String metın=scanner.nextLine().toLowerCase();
        int sesliHarfSayisi=0;
        String seslıHarfler="aeıioöuü";
        for(int i=0;i<metın.length();i++){
            char karakter=metın.charAt(i);
            if(seslıHarfler.contains(String.valueOf(karakter))){
                sesliHarfSayisi++;
            }
        }
        System.out.println("Metindeki sesli harf sayısı :" + sesliHarfSayisi);
    }

    public static boolean isPalindrom(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int sayKelime(String word, String arananKelime) {
        String[] kelimeler = word.split(" ");
        int counter = 0;
        for (String kelime : kelimeler) {
            if (kelime.equalsIgnoreCase(arananKelime)) {
                counter++;
            }
        }
        return counter;
    }

    public static String reverse(String metin) {
        String result = "";
        int i;
        for (i = metin.length() - 1; i >= 0; i--) {
            result += metin.charAt(i);
        }
        return result;
    }



    }




