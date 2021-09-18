package hu.nye.progtech;
import java.util.Scanner;

public class Main {

    final static String ENG = "Hello";
    final static String DE = "Hallo";
    final static String HU = "Szia";

    public static void main(String[] args) {
        System.out.println("Add meg a neved és a nyelvet(Magyar, Angol, Német) ! [Keresztnév;Nyelv] ");
        Scanner read = new Scanner(System.in);
        String line = read.nextLine();
        String array[] = line.split(";");
        String temp = "HU";
        if (array.length > 1) {
            switch (array[1].toLowerCase()) {
                case "angol":
                    temp = "ENG";
                    break;
                case "német":
                    temp = "DE";
                    break;
            }
            ;
        }
        greeting(array[0],temp);
    }
    static void greeting(String name,String lang){
        switch (lang) {
            case "ENG":
                System.out.println(ENG+" "+name);
                break;
            case "DE":
                System.out.println(DE+" "+name);
                break;
            default:
                System.out.println(HU+" "+name);
                break;
        }

    }
}
