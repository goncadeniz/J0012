package com.ornekler;

public class Soru1 {
    public static void main(String[] args) {

        MusteriListesi musteriListesi = new MusteriListesi();
        musteriListesi.diziBaslat(5);

        musteriListesi.musteriEkle(0,"ahmet");
        musteriListesi.musteriEkle(1,"ayşe");
        musteriListesi.musteriEkle(2,"ali");
        musteriListesi.musteriEkle(3,"mehmet");
        musteriListesi.musteriEkle(4,"zeynep");

        musteriListesi.musterileriListele();

        System.out.println(musteriListesi.musteriGetir(2));
        musteriListesi.musteriGetir(3);



    }
}
