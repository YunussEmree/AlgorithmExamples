import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciManager {

    public void OgrenciEkle(ArrayList<Ogrenci> liste, int kademe, Scanner scanner){
        System.out.println("Öğrenci Bilgileri: ");
        System.out.println("İsim: ");
        String isim = scanner.next();
        System.out.println("Soyisim: ");
        String soyisim = scanner.next();
        System.out.println("Numara: ");
        int numara = scanner.nextInt();
        System.out.println("Bölüm: ");
        String bolum = scanner.next();

        if(kademe == 1){
            System.out.println("Bitirme projesi: ");
            String bitirmeprojesi = scanner.next();
            LisansOgrencisi lisansOgrencisi = new LisansOgrencisi(isim,soyisim,numara,bolum,bitirmeprojesi);
            liste.add(lisansOgrencisi);
        }
        if(kademe == 2){
            System.out.println("Tez konusu: ");
            String tezkonusu = scanner.next();
            System.out.println("Danışman: ");
            String danisman = scanner.next();
            YuksekLisansOgrencisi yukseklisansOgrencisi = new YuksekLisansOgrencisi(isim,soyisim,numara,bolum,tezkonusu,danisman);
            liste.add(yukseklisansOgrencisi);
        }
        if(kademe == 3){
            System.out.println("Tez konusu: ");
            String tezkonusu = scanner.next();
            System.out.println("Danışman: ");
            String danisman = scanner.next();
            System.out.println("Yeterlilik: ");
            boolean yeterlilik = scanner.nextBoolean();
            DoktoraOgrencisi doktoraOgrencisi = new DoktoraOgrencisi(isim,soyisim,numara,bolum,tezkonusu,danisman,yeterlilik);
            liste.add(doktoraOgrencisi);
        }
    }



    public void OgrencileriListele(ArrayList<Ogrenci> liste){
        for(Ogrenci ogrenci : liste){
            ogrenci.bilgiVer();
        }
    }


}
