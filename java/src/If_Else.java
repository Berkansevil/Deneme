import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        // Sınav notu Hesaplayıcı
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sınav notunuzu giriniz :");
        Double note=scanner.nextDouble();
        char grade;
        if(note<=100 && note>=90){
            grade='A';
        } else if (note<90 && note >=80) {
            grade='B';
        }else if (note<80 && note >=60){
            grade ='C';
        } else if (note<60 && note>=40) {
            grade='D';
        }else{
            grade='F';
        }

    if(grade=='F'){
        System.out.println("Sınavda başarısız oldunuz  " +"aldığınız harf notu : " +grade);
    }else{
        System.out.println("Başarılı bir şekilde sınavı geçtiniz " + "aldığınız harf notu :" + grade);
    }
       // Dört işlem Hesaplayıcı
        System.out.println( "İlk sayınızı giriniz :");
        double number1= scanner.nextDouble();
        System.out.println("İkinci sayınızı giriniz :");
        double number2=scanner.nextDouble();

        System.out.println("İşlem türünü seçiniz (+,-,*,/):");
        char type=scanner.next().charAt(0);
        double fınal;
        switch (type){
            case '+':
                fınal=number1+number2;
                break;
            case '-':
                fınal=number1-number2;
                break;
            case '*':
                fınal=number1*number2;
                break;
            case '/':
                if(number2 !=0){
                    fınal=number1/number2;
                }else{
                    System.out.println("İkinci sayı sıfır olamaz !");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem türü");
                return;
        }
        System.out.println("Sonuc :" + fınal);

        //Haftanın Günleri
        System.out.println("1 ile 7 arasında sayı giriniz :");
        int days=scanner.nextInt();

        switch (days){
            case 1:
                System.out.println("Pazartesi Gününe denk gelmektedir");
                break;
            case 2:
                System.out.println("Salı Gününe denk gelmektedir");
                break;
            case 3:
                System.out.println("Çarşamba Gününe denk gelmektedir");
                break;
            case 4:
                System.out.println("Perşembe Gününe denk gelmektedir");
                break;
            case 5:
                System.out.println("Cuma Gününe denk gelmektedir");
                break;
            case 6:
                System.out.println("Cumartesi Gününe denk gelmektedir");
                break;
            case 7:
                System.out.println("Pazar Gününe denk gelmektedir");
                break;

        }

        //Ürün indirimi Hesaplayıcı
        System.out.println("Ürün fiyatını giriniz :");
        double price=scanner.nextDouble();
        System.out.println("İndirim yüzdesi giriniz :");
        double perc=scanner.nextDouble();
        double amount=((price*perc)/100);
        double cons=price-amount;
        System.out.println("İndirim sonrası fiyat " + cons + "TL");



    }
}
