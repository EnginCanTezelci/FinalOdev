public class FinalOdevi {
    public static void main(String args[]) {
        Muhendis muh = new Muhendis();
        Doktor dok = new Doktor();
        Ogretmen ogrt = new Ogretmen();

        System.out.println("***Mühendis Bilgisi***\n");
        muh.ad ="Engin Can";
        muh.soyad ="Tezelci";
        muh.dogumyili =2000;
        muh.muhAlan ="Bilgisayar";
        muh.uzmAlani ="Web";
        muh.baslamaYili =2020;
        muh.maas =1500;
        muh.Bilgi();
        muh.Zam(100);

        System.out.println("\n***Doktor Bilgisi***\n");
        dok.ad ="Ali";
        dok.soyad ="Ak";
        dok.dogumyili =1989;
        dok.dokAlani ="Egitim Arastirma";
        dok.uzmAlani ="Ortopedi";
        dok.ameliyatSayisi = 12;
        dok.baslamaYili =2013;
        dok.maas =7000;
        dok.Bilgi();

        System.out.println("\n***Öğretmen Bilgisi***\n");
        ogrt.ad ="Ayşe";
        ogrt.soyad ="Pak";
        ogrt.dogumyili =1986;
        ogrt.dersSaati = 50;
        ogrt.brans ="Kimya";
        ogrt.baslamaYili =2008;
        ogrt.maas =3000;
        ogrt.Bilgi();

    }
}


