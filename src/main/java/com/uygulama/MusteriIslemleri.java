package com.uygulama;

import java.util.Scanner;

public class MusteriIslemleri {
    /**
     * Müşteri Listele
     * Müşteri Borç Listele
     * Müşteri Ödeme Al
     * Müşteri Arama
     *
     */

    public void init(){
        int secim;
        do{
            secim =  secimAl();
            switch (secim){
                case 1: musteriListele();break;
                case 2: musteriBorcListesi();break;
                case 3: odemeAl();break;
                case 4: musteriArama(); break;
                case 0:
                    System.out.println("ÇIKIŞ YAPILDI"); break;
                default:
                    System.out.println("Lütfen geçerli bir seçim yapınız");
            }
        }while (secim!=0);
    }

    public int secimAl(){
        System.out.println("""
                ************************************
                ***** MÜŞTERİ TAKİP UYGULAMASI *****
                1- Müşteri Listesi
                2- Müşteri Borç Listele
                3- Müşteri Ödeme Al
                4- Müşteri Arama
                0- ÇIKIŞ
                """);
        System.out.print("lütfen seçiniz...: ");
        int secim = new Scanner(System.in).nextInt();
        return secim;
    }

    public void musteriListele(){
        Veriler veriler = new Veriler();
        System.out.println("""
                **** Müşteri Listesi ****
                """);
        for(int i=0; i<veriler.musteriListesi.length;i++){
            System.out.println("Müşteri adı....: "+ veriler.musteriListesi[i]);
        }
        System.out.println("""
                -----------------------------
                """);
    }

    public void musteriBorcListesi(){
        Veriler veriler = new Veriler();
        System.out.println("""
                **** Müşteri Borç Listesi ****
                """);
        for (int i=0; i<veriler.musteriListesi.length;i++){
            System.out.print("Müşteri adı/borcu.....: ");
            System.out.println(veriler.musteriListesi[i]+" - "+ veriler.borcListesi[i]);
        }
        System.out.println("""
                ----------------------------
                """);
    }

    public void odemeAl(){
        System.out.print("Hangi müşteri için ödeme alacaksınız[INDEX]...: ");
        int index = new Scanner(System.in).nextInt();
        System.out.print("yapılan ödeme tutarı.....: ");
        double odemeTutari = new Scanner(System.in).nextDouble();
        Veriler veriler = new Veriler();
        veriler.odemeListesi[index] += odemeTutari; // ödenmiş bilginin üzerine ödeme tutarını ekliyorum.
        System.out.println("""
                ödeme başarı ile alınmıştır.
                -------------------------------
                """);
    }

    public void musteriArama() {
        Veriler veriler = new Veriler();
        System.out.print("Aranan müşteri.....: "); // Ahmet TAŞ
        String arama = new Scanner(System.in).nextLine();
        int bulunanIndex = -1;
        for (int i = 0; i < veriler.musteriListesi.length; i++) {
            if (veriler.musteriListesi[i].equalsIgnoreCase(arama)) {
                bulunanIndex = i;
                break;
            }
        }
        if (bulunanIndex == -1) {
            System.out.println("Hiçbir kayıt bulunamamıştır");
            return;
        }
        System.out.println("Müşteri adı....: " + veriler.musteriListesi[bulunanIndex]);
        System.out.println("Müşteri borcu..: " + veriler.borcListesi[bulunanIndex]);
        System.out.println("Müşteri ödemesi: " + veriler.odemeListesi[bulunanIndex]);
        System.out.println("""
                -------------------------------------------
                """);

    }
}
