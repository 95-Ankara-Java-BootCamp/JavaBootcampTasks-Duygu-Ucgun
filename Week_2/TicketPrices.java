package week2;
import java.util.Scanner;


/*
Sinema Bileti Satışı :
-18 yaş altı için %10
-18 ve 25 yaş arası %5 indirim
-Korku filmi seçimi %10 indirim
 */

public class TicketPrices {
    static int price = 25; 
        public static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        System.out.print("İf you want to watch horror movie please press h: ");
        int horror = scan.nextInt();
    
        if (age < 18 ){
            double newdiscountedPrice = price -(price * 0.10);
            // 18 yaş altına uygulanan indirimli fiyat 
            System.out.println("Your price is:" + newdiscountedPrice + "TL");
    
        }
    
        else if (age > 18 && age < && horror != "h" ) {
            // 18 ve 25 yaş aralığında diğer kategorilerde uygulanan indirimli fiyat
            double newdiscountedPrice = price - ( price * 0.10);
            System.out.println ("Your price is:" + newdiscountedPrice + "TL");
    
        }
        else if(age >= 18 && age <=25 && horror == "h"){ 
            //18 ve 25 yaş aralığında korku kategorisinde uygulanan indirimli fiyat
            double newdiscountedPrice = price - ( price * 0.15); // %5 yaş indirimi %10 kategori indirimi toplam %15 
            System.out.println("Your price is: " + newdiscountedPrice + "TL");
        }

        else if(age > 25 && horror != "h"){ 
            //25 yaşından büyük diğer kategorilerdeki fiyat 
            double newdiscountedPrice = price; //hiçbir indirim uygulanmadı 
            System.out.println("Your price is: " + price + "TL");
        }

        else if(age > 25 && scary == 1){ 
            //25 yaşından büyük korku kategorisi
            double newPrice = price - ( price * 0.10);
            System.out.println("Your price is: " + price + "TL");
        }

    }
}