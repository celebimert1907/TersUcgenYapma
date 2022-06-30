package TersUcgen;

import java.util.Scanner;

public class YildizTersUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz: ");

        int value;
        value = input.nextInt();

        for (int i=value; i>=0; i--) {
            for (int x = 1; x<=(value-i); x++){
                System.out.print(" ");
            }
            for (int y = 1; y<= ((2*i) - 1); y++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
