public abstract class Ogrenci {

    String ad;
    String soyad;
    int numara;
    String bolum;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public Ogrenci(String ad, String soyad, int numara, String bolum){
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        this.bolum = bolum;
    }

    public abstract void bilgiVer();

}
