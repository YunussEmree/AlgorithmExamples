import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

        OgrenciManager ogrenciManager = new OgrenciManager();

        System.out.println("Eklemek istediğiniz öğrenci kademesini giriniz(1:lisans, 2:yüksek lisans, 3: doktora, 0: iptal) = ");

        int girilendeger = scanner.nextInt();
        while (girilendeger != 0){
            ogrenciManager.OgrenciEkle(ogrenciler,girilendeger,scanner);

            System.out.println("Eklemek istediğiniz öğrenci kademesini giriniz(1:lisans, 2:yüksek lisans, 3: doktora, 0: iptal) = ");
            girilendeger = scanner.nextInt();
        }



        ogrenciManager.OgrencileriListele(ogrenciler);
    }
}