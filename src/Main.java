import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(convertMillisec(100000));
    }
    
    public static boolean isValidTranscation(int price, int balance){
        return price <= balance;
    }
    
    public static String recommendation(String type){
        
        if(type.equalsIgnoreCase("vegetarisch")) return "Salatbar";
        if (type.equalsIgnoreCase("low carb")) return "Menü 2";
        if(type.equalsIgnoreCase("kleiner Hunger")) return "Menü 1";
        if(type.equalsIgnoreCase("Hunger")) return "Grill";
        
        return null;
    }
    
    public static float price(String menu){
        if (menu.equalsIgnoreCase("Salatbar")) return 2.5f;
        if (menu.equalsIgnoreCase("Menü 2")) return 1.0f;
        if (menu.equalsIgnoreCase("Menü 1")) return 1.2f;
        if (menu.equalsIgnoreCase("Grill")) return 3.8f;
        return 0;
    }
    
    public static String convertMillisec(long milliseconds){
        //outputformat hh::mm:ss
        
        var hours = milliseconds / 3600000;
        var minutes = (milliseconds % 3600000) / 60000;
        var seconds = ((milliseconds % 3600000) % 60000) / 1000;
        
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void pyramide(int zeilen) {
        int zahl = 1; // Startzahl

        for (int i = 1; i <= zeilen; i++) {
            // Drucke Leerzeichen für die Zentrierung
            for (int j = 0; j < zeilen - i; j++) {
                System.out.print("   "); // Drei Leerzeichen für jede fehlende Zahl
            }

            // Drucke die Zahlen in jeder Zeile
            for (int j = 0; j < i; j++) {
                System.out.printf("%06d ", zahl); // Formatierung für 3-stellige Zahlen
                zahl++;
            }

            // Neue Zeile nach jeder Zeile der Pyramide
            System.out.println();
        } 
    }
    public static int summe(int zahl){
        var string = String.valueOf(zahl);
        var summe = 0;
        for (var i = 1; i <string.length()-1;i++){
            summe += Integer.parseInt(String.valueOf(string.charAt(i)));
        }
        return summe;

       
    }
}
