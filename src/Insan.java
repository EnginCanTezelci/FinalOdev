import java.time.LocalDateTime;

public class Insan {

    String ad;
    String soyad;
    int dogumyili;
    int yas;
    int yil;

    Insan() {
        ad = "Girilmedi";
        soyad = "Girilmedi";
        dogumyili = 2000;
        yil = LocalDateTime.now().getYear();
    }

    Insan(String ad,String soyad,int dogumyili) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumyili = dogumyili;
        this.yas = yashesapla(dogumyili);
    }

    int yashesapla(int dogumyili){
        return  yil -dogumyili;
    }
}