import java.time.LocalDateTime;

public class Muhendis extends Insan{

    String muhAlan;
    String uzmAlani;
    int baslamaYili;
    int tecrube;
    float maas;
    int yil;

    Muhendis() {
        muhAlan="";
        uzmAlani ="";
        baslamaYili = 0;
        maas = 0;
        yil = LocalDateTime.now().getYear();
    }


    Muhendis(String ad,String soyad,int dogumyili,String muhAlan,String uzmAlani,int baslamaYili,float maas) {
        super(ad,soyad,dogumyili);
        this.muhAlan = muhAlan;
        this.uzmAlani = uzmAlani;
        this.baslamaYili = baslamaYili;
        this.tecrube = tarihHesapla(baslamaYili);
        this.maas = maas;
        this.yas=yashesapla(dogumyili);
    }

    void Bilgi(){
        System.out.println("Kişinin Adi : " + this.ad +
                "\nKişinin Soyadi :" +this.soyad +
                "\nKişinin Yasi :" +this.yas +
                "\nMuhendislik Alani :" +this.muhAlan +
                "\nUzmanlik Alani :" +this.uzmAlani +
                "\nTecrubesi :" +this.tecrube +
                "\nMaas :" +this.maas );
    }

    int yashesapla(int dogumyili){
        return  yil-dogumyili;
    }

    int tarihHesapla(int baslamaYili){
        return yil-baslamaYili;
    }

    void Zam(int zamMiktari){
        this.maas = this.maas + zamMiktari;
        System.out.println("Kişinin " + zamMiktari +" tl ile birlikte zamlı maaşı : " + this.maas);
    }

    void Zam(float zamOrani){
        float zamMiktari = this.maas * zamOrani/100;
        this.maas = this.maas + zamMiktari;
        System.out.println("Kişinin " + zamOrani +" zam oranı ile birlikte maaşı : " + this.maas);
    }
}
