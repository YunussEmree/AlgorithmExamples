public class LisansOgrencisi extends Ogrenci{

    String bitirmeprojesi;

    public String getBitirmeprojesi() {
        return bitirmeprojesi;
    }

    public void setBitirmeprojesi(String bitirmeprojesi) {
        this.bitirmeprojesi = bitirmeprojesi;
    }

    public LisansOgrencisi(String ad, String soyad, int numara, String bolum, String bitirmeprojesi) {
        super(ad, soyad, numara, bolum);
        this.bitirmeprojesi = bitirmeprojesi;
    }

    @Override
    public void bilgiVer() {
        String mesaj = String.format("İsim: %10s,   Soyisim: %10s,   Numara: %10d,   Bölüm: %10s,   Bitirme Projesi: %10s", ad,soyad,numara,bolum,bitirmeprojesi);
        System.out.println(mesaj);
    }
}
