import java.util.Scanner;

public class Main {
    static void matris2dyazdir(String[][] matris, int sutunsayi, int satirsayi){
        for (int i = 0; i < satirsayi; i++) {
            for (int j = 0; j < sutunsayi; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.print(" \n");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dersin adını giriniz ? ");
        String dersadi = scanner.next();
        System.out.print("Derse ait kaç adet değerlendirme kriteri var ? ");
        int kritersayi = scanner.nextInt();
        String[] kriteradlari = new String[kritersayi];
        int[] kriteretkileri = new int[kritersayi];

        for (int i = 0; i < kritersayi; i++) {
            System.out.print((i+1) + ". kriterin adı nedir : ");
            kriteradlari[i] = scanner.next();
            System.out.print((i+1) + ". kriterin etkisi nedir : ");
            kriteretkileri[i] = scanner.nextInt();
        }
        System.out.print("Kaç öğrenci notu gireceksiniz : ");
        int ogrenciadet = scanner.nextInt();

        String[][] dizi = new String[1+ogrenciadet][3+kritersayi];
        dizi[0][0] = "Adı";
        dizi[0][1] = "Soyadı";
        dizi[0][2+kritersayi] = "Ortalama";

        for (int i = 0; i < kritersayi; i++) { //kriter adlarını tabloya yazmak için
            dizi[0][2+i] = kriteradlari[i];
        }
        double ortalama = 0;
        double[] ortalamaliste = new double[ogrenciadet];
            for (int j = 0; j < ogrenciadet; j++) {
                System.out.print((j+1) + ". Öğrencinin adı:");
                dizi[j+1][0] = scanner.next();
                System.out.print((j+1) + ". Öğrencinin soyadı:");
                dizi[j+1][1] = scanner.next();
                for (int k = 0; k < kritersayi; k++) {
                    System.out.print((j+1) + ". Öğrencinin " + kriteradlari[k] + " notu:");
                    double not = scanner.nextInt();
                    ortalama += not * ((double) kriteretkileri[k] /100);
                    dizi[j+1][2+k] = String.valueOf(not);
                }
                dizi[j+1][2+kritersayi] = String.valueOf(ortalama);
                ortalama = 0;
            }
        matris2dyazdir(dizi, 3+kritersayi, 1+ogrenciadet);
    }
}