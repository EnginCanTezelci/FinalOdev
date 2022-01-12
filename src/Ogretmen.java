import java.time.LocalDateTime;

public class Ogretmen extends Insan{

    String brans;
    int baslamaYili;
    int tecrube;
    int dersSaati;
    float maas;
    int yil;

    Ogretmen() {
        brans="";
        baslamaYili=0;
        tecrube=0;
        dersSaati=0;
        maas=0;
        yil=LocalDateTime.now().getYear();
    }


    Ogretmen(String ad,String soyad,int dogumyili,String brans,int baslamaYili,int dersSaati,float maas) {

        super(ad,soyad,dogumyili);
        this.brans = brans;
        this.baslamaYili = baslamaYili;
        this.tecrube = tarihHesapla(baslamaYili);
        this.dersSaati = dersSaati;
        this.maas = maas;
    }

    void Bilgi(){
        System.out.println("Kişinin Adi : " + this.ad +
                "\nKisinin Soyadi :" +this.soyad +
                "\nKisinin Yasi :" +this.yas +
                "\nKisinin Bransi :" +this.brans +
                "\nDers Saati :" +this.dersSaati +
                "\nTecrubesi :" +this.tecrube +
                "\nMaas :" +this.maas );
    }

    int tarihHesapla(int baslamaYili){
        return yil-baslamaYili;
    }

}
