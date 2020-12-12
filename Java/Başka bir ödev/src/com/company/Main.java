package com.company;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import javax.lang.model.type.NullType;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz:");
        int satır = deger.nextInt();
        System.out.println("Lütfen sütun sayısını giriniz:");
        int sutun = deger.nextInt();
        int[][] dizi = new int[satır][sutun];


        System.out.println("20-80 arası zorluk girin lütfen!!");
        int zorluk = deger.nextInt();
        int[][] mayınlar = new int[satır][sutun];
        int mayin_sayisi = satır * sutun * zorluk / 100;
        Random rnd_sutun = new Random();
            Random rnd_satir = new Random();
        for (int i = 0; i < mayin_sayisi; i++) {
            int rnd_satir_value = rnd_satir.nextInt(satır -1);
            int rnd_sutun_value = rnd_sutun.nextInt(sutun -1);
            if(mayınlar[rnd_satir_value][rnd_sutun_value]==0){
                mayınlar[rnd_satir_value][rnd_sutun_value]=1;
            }
            else
                i--;
        }


// Bu satır bombalarımızın açık halinin gösterildiği kod parçası.

 //       for (int x = 0; x < satır; x++) {
   //         for (int y = 0; y < sutun; y++) {
     //           System.out.print(mayınlar[x][y] + " ");
       //     }
         //   System.out.println();
       // }


        for (int i =0;i<satır;i++){
            for (int j=0;j<sutun;j++){
                if(dizi[i][j]!=mayınlar[i][j]){
                    dizi[i][j]=1;
                }
            }
        }

        //int mayınsayı = (int) (satır * sutun * z);
        //System.out.println(z);
        int puan = 0;
        /*


        * ? Mayınların krdinatlarını hafızada tut, aynı yere 2 mayın gelmesin
             */

        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("* " );
            }
            System.out.println("");
        }


        while (true) {
            System.out.println("Lütfen kontrol etmek istediğiniz satırı giriniz");
            int x = deger.nextInt();
            System.out.println("Lütfen kontrol etmek istediğiniz satırı giriniz");
            int y = deger.nextInt();
            if (dizi[x-1][y-1] == 0) {
                System.out.println("Temiz!");
                puan = puan + 10;
                System.out.println("Puanınız:" + puan);
                } else if (dizi[x-1][y-1] == 1) {
                    System.out.println("Mayına bastınız 'Puanınız':" + puan);
                    break;
                     }
        }

    }
}








