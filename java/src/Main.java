//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    public static int max (int x , int y, int z){
        int max=x;
        if(y>max){
            max=y;
        }  if (z>max) {
            max=z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        System.out.print("İlk sayı : ");
        int ilkSayı=scanner.nextInt();
        System.out.print("İkinci sayı :");
        int ikinciSayı=scanner.nextInt();
        System.out.print("Üçüncü sayı :");
        int üçüncüSayı=scanner.nextInt();

        System.out.println("En büyük sayı " + max(ilkSayı ,ikinciSayı ,üçüncüSayı));
    }
}
