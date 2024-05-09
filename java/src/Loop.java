

import  java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char devam;
        do{
            System.out.println("Çarpım tablosu için bir sayı giriniz :");
            int sayi=scanner.nextInt();
         for(int i=1;i<=sayi;i++){
             for(int j=1; j<=sayi;j++){
                 System.out.printf( "%4d", i*j);
             }
             System.out.println();
         }
            System.out.println("başka bir çarpım tablosu ister misiniz ? (Evet/Hayır):");
         devam=scanner.next().charAt(0);

        }while(devam=='E' || devam =='e');
        System.out.println("Program sonlandırıldı.");

        }
    }


