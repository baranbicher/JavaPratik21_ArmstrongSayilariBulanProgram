import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        number=input.nextInt();
        int tempNumber=number;
        int total=0;
        while (tempNumber != 0) {
            total += tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println("Sayının basamakları toplamı = " + total);




        /*

        System.out.print("Sayı Girin: ");
        int number = input.nextInt();
        int basNumber = 0, tempNumber = number, basValue, result = 0, basPow = 1;


        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        System.out.println("Basamak Sayısı: " + basNumber);

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;

            basPow = 1;

            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;

        }

        if (result == number) {
            System.out.println(number + " Sayısı Amstrongdur.");
        } else {
            System.out.println(number + " Sayısı Amstrong değildir.");
        }
        */

    }
}