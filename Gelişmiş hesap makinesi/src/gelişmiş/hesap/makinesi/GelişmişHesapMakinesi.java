
package gelişmiş.hesap.makinesi;

import java.util.Scanner;

public class GelişmişHesapMakinesi {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan =new Scanner(System.in);
        int operation;
        do {            
            
 
            String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        System.out.print("Please choose a operation: ");
        operation=scan.nextInt();
        int resault=0;
        switch(operation){
            case 1:
                resault=plus();
                System.out.println("resault= "+resault);
                break;
            case 2:
                resault=minus();
                System.out.println("resault= "+resault);
                break;
            case 3:
                resault=times();
                System.out.println("resault= "+resault);
                break;
            case 4:
                double resault1=divided();
                System.out.println("resault= "+resault1);
                
                break;
            case 5:
                resault=power();
                System.out.println("resault= "+resault);
                
                break;
            case 6:
                resault=factorial();
                System.out.println("resault= "+resault);
                
                break;
            case 7:
                resault=mod();
                System.out.println("resault= "+resault);
                
                break;
            case 8:
                rectangle();
                break;
            case 0:
                System.out.println("you log out.");
                break;
                
            default:
                System.out.println("Your output is wrong , try again.");
        }
        
                } while (operation!=0);

    }
    public static int plus(){

        Scanner scan =new Scanner(System.in);

        int number,resault=0,i=0;
        
        while (true) {            
            System.out.print(i++ +". sayı: ");
            number=scan.nextInt();
            if(number==0)break;
            
            resault+=number;
        
        }
        return resault;
    }
    
      public static int minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, resault = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                resault += number;
                continue;
            }
            resault -= number;
        }
       return resault;
       }
    
      public static int times(){
      Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        return result;
      }
      
      public static double divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
      return result;
      }
      
      public static int power(){
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter base value :");
        int base = scan.nextInt();
        System.out.print("Enter power value:");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
      }
       
      public static int factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
      
      public static int mod(){
                 
          Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
          System.out.print("Enter a number that you want take mod: ");
          int n2=scan.nextInt();
        return n%n2;
      }
      
      public static void rectangle(){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Dikdörtgenin uzun kenarını girin: ");
        double uzunKenar = scanner.nextDouble();

        System.out.print("Dikdörtgenin kısa kenarını girin: ");
        double kisaKenar = scanner.nextDouble();

        double alan = uzunKenar * kisaKenar;
        double cevre = 2 * (uzunKenar + kisaKenar);

        System.out.println("Dikdörtgenin alanı: " + alan);
        System.out.println("Dikdörtgenin çevresi: " + cevre);
}
      
}
