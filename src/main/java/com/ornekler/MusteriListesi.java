package com.ornekler;

import com.uygulama.Veriler;

import java.util.Scanner;

public class MusteriListesi {
    /*
    * Müşteri Listesi sınıfı içinde
    * 1-Müşterileri Listeleyen bir method
    * 2-İstenilen index e müşteri ekleyen bir method
    * 3-indexi verilen  müşteriyi dönen bir method tanımla
    *
    * müişteri dizisi ilk etapta boş bir dizidir
    * bu nedenle  dizinin başlatılması  gereklidir .bu işlemi yapan bir method yazınız
    *
    * bu method dizinin boyutunu istesin ve diziyi oluştursun.diğer methodlar
    * dizi başlatılmadan çalışırsa uyarı versin.
    * */
    Scanner sc=new Scanner(System.in);



   public String[] musteriler;
    public boolean diziBaslatildiMi = false;


    public void diziBaslat(int boyut) {

        if (boyut > 0) {
            musteriler = new String[boyut];
            diziBaslatildiMi = true;
            System.out.println("Dizi " + boyut + " boyutunda başlatıldı.");
        } else {
            System.out.println("Dizi boyutu pozitif bir sayı olmalıdır.");
        }
    }


    public void musterileriListele() {
        if (!diziBaslatildiMi) {
            System.out.println("Dizi başlatılmadı. Lütfen önce diziyi başlatın.");
            return;
        }

        System.out.println("""
                Müşteriler:
                
                """);
        for (int i = 0; i < musteriler.length; i++) {
            System.out.println("Index " + i + ": " + musteriler[i]);
        }
    }


    public  void musteriEkle(int index,String musteri) {


        if (!diziBaslatildiMi) {
            System.out.println("Dizi başlatılmadı. Lütfen önce diziyi başlatın.");
            return;
        }

        if ( index >= 0 && index < musteriler.length) {
            musteriler[index] = musteri;
            System.out.println("Müşteri " + musteri + " index " + index + " eklendi.");
        }
    }


    public String musteriGetir(int index) {

        if (!diziBaslatildiMi) {
            System.out.println("Dizi başlatılmadı. Lütfen önce diziyi başlatın.");
            return null;
        }

        if (index >= 0 && index < musteriler.length) {
            return musteriler[index] != null ? musteriler[index] : "Bu indexte müşteri bulunmamaktadır .";
        }
        return null;

    }



}
