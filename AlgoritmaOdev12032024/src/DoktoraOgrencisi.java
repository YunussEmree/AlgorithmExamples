public class DoktoraOgrencisi extends Ogrenci{

    String tezkonusu;
    String danisman;
    boolean yeterlilik;

    public String getTezkonusu() {
        return tezkonusu;
    }

    public void setTezkonusu(String tezkonusu) {
        this.tezkonusu = tezkonusu;
    }

    public String getDanisman() {
        return danisman;
    }

    public void setDanisman(String danisman) {
        this.danisman = danisman;
    }

    public boolean isYeterlilik() {
        return yeterlilik;
    }

    public void setYeterlilik(boolean yeterlilik) {
        this.yeterlilik = yeterlilik;
    }

    public DoktoraOgrencisi(String ad, String soyad, int numara, String bolum, String tezkonusu, String danisman, boolean yeterlilik) {
        super(ad, soyad, numara, bolum);
        this.tezkonusu = tezkonusu;
        this.danisman = danisman;
        this.yeterlilik = yeterlilik;
    }


    @Override
    public void bilgiVer() {
        String mesaj = String.format("İsim: %10s,   Soyisim: %10s,   Numara: %10d,   Bölüm: %10s,   Tez Konusu: %10s,   Danışman: %10s,   Yeterlilik: %10s", ad,soyad,numara,bolum,tezkonusu,danisman,yeterlilik);
        System.out.println(mesaj);
    }


}
