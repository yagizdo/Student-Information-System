package programm;

import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {
        System.out.println("Program başlıyor..." + " | Öğretmen : Mert Acel");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Öğrenci sayısını giriniz.. ; ");
        int ogrenciSayisi = Scanner.nextInt();
        System.out.println("Ders sayısını giriniz.. ; ");
        int dersSayisi = Scanner.nextInt();
        int[][][] dizi = new int[ogrenciSayisi][dersSayisi][2];
        double dersOrt = 0;
        for (int i = 0; i < ogrenciSayisi; i++) {
            for (int j = 0; j < dersSayisi; j++) {
                System.out.println((i+1) + ". öğrencinin " + (j+1) + ". dersinin vize notunu giriniz : ");
                dizi[i][j][0] = Scanner.nextInt();
                System.out.println((i+1) + ". öğrencinin " + (j+1) + ". dersinin final notunu giriniz : ");
                dizi[i][j][1] = Scanner.nextInt();

            }

        }
        System.out.println("");
        System.out.println("Notlar Tablosu ");
        System.out.println("--------------------------------------");
        System.out.println("Öğrenci    Ders    Vize      Final        ortalama    Geçti/Kaldı");
        for (int k = 0; k < ogrenciSayisi; k++) {
            for (int m = 0; m < dersSayisi; m++) {
                dersOrt = (dizi[k][m][0] * 40 / 100 + dizi[k][m][1] * 60 / 100);
                System.out.print((k + 1) + "          " + (m + 1) + "        " + dizi[k][m][0] + "         " + dizi[k][m][1] + "            " + dersOrt);
                if (dersOrt > 50) {

                    System.out.println("           Geçti");

                } else {

                    System.out.println("           Kaldı");
                }
            }

        }

    }
}
