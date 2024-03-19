import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<HashMap<String, String>> students = new LinkedList<>();

        for (int i = 1; i <= 3; i++) {
            HashMap<String, String> studentsInfo = new HashMap<>();

            System.out.println("Öğrenci #" + i + " bilgilerini girin: ");
            System.out.print("Ad: ");
            studentsInfo.put("ad", scanner.nextLine());

            System.out.print("Soyad: ");
            studentsInfo.put("soyad", scanner.nextLine());

            System.out.print("Vize Notu: ");
            studentsInfo.put("vizeNotu", scanner.nextLine());

            System.out.print("Final Notu: ");
            studentsInfo.put("finalNotu", scanner.nextLine());

            students.add(studentsInfo);
        }
        System.out.println("Öğrenci Listesi: ");
        System.out.println(students);

        System.out.print("Aranacak adı giriniz:");
        String aranacakad = scanner.nextLine();
        System.out.print("Aranacak soyadı giriniz:");
        String aranacaksoyad = scanner.nextLine();
        boolean ogrencibulundu = false;

        for (HashMap<String, String> ogrencimap : students) {
            if(ogrencimap.get("isim").equals(aranacakad) && ogrencimap.get("soyisim").equals(aranacaksoyad)) {
                System.out.println("Öğrenci bulundu: ");
                String msg = String.format("Ad: %10s, Soyad: %10s, Vize: %5s, Final: %5s", ogrencimap.get("ad"), ogrencimap.get("soyad"), ogrencimap.get("vizeNotu"), ogrencimap.get("finalNotu"));
                System.out.println(msg);
                ogrencibulundu = true;
            }
        }
        if(!ogrencibulundu){
            System.out.println("Öğrenci bulunamadı");
        }
    }
}