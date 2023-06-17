package timus;

import java.util.Scanner;

public class Task_1607 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int pricePeter = in.nextInt();
        int stepPricePeter = in.nextInt();
        int priceDriver = in.nextInt();
        int stepDiscountDriver = in.nextInt();

        while (pricePeter <= priceDriver){
            pricePeter += stepPricePeter;
            if (pricePeter > priceDriver){
                pricePeter = priceDriver;
            }
            priceDriver -= stepDiscountDriver;

        }
        System.out.println(pricePeter);
    }
}
