import java.time.LocalDateTime;

public class Doktor extends Insan{

    String dokAlani;
    String uzmAlani;
    int ameliyatSayisi;
    int baslamaYili;
    int tecrube;
    float maas;
    int yil;

    Doktor() {
        dokAlani="";
        uzmAlani="";
        ameliyatSayisi=0;
        baslamaYili=0;
        tecrube=0;
        maas=0;
        yil=LocalDateTime.now().getYear();
    }


    Doktor(String ad,String soyad,int dogumyili,String dokAlani,String uzmAlani,int ameliyatSayisi,
           int baslamaYili,float maas) {

        super(ad,soyad,dogumyili);
        this.dokAlani = dokAlani;
        this.uzmAlani = uzmAlani;
        this.ameliyatSayisi = ameliyatSayisi;
        this.baslamaYili = baslamaYili;
        this.tecrube = tarihHesapla(baslamaYili);
        this.maas = maas;
    }

    void Bilgi(){
        System.out.println("Kişinin Adi : " + this.ad +
                "\nKişinin Soyadi :" +this.soyad +
                "\nKişinin Yasi :" +this.yas +
                "\nDoktorluk Alani :" +this.dokAlani +
                "\nUzmanlik Alani :" +this.uzmAlani +
                "\nAmeliyat Sayisi :" +this.ameliyatSayisi +
                "\nTecrubesi :" +this.tecrube +
                "\nMaas :" +this.maas );
    }

    int tarihHesapla(int baslamaYili){
        return yil-baslamaYili;
    }
}
