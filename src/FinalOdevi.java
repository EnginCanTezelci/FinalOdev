public class FinalOdevi {
    public static void main(String args[]) {
        Muhendis muh = new Muhendis("Engin Can","Tezelci",2000,"Bilgisayar","Web",2020,1500);
        Doktor dok = new Doktor("Ali","Ak",1989,"Egitim Arastirma","Ortopedi",12,2013,7000);
        Ogretmen ogrt = new Ogretmen("Ayşe","Pak",1986,"Kimya",2003,60,3000);

        System.out.println("***Mühendis Bilgisi***\n");
        muh.Bilgi();
        muh.Zam(100);
        System.out.println("\n***Doktor Bilgisi***\n");
        dok.Bilgi();
        System.out.println("\n***Öğretmen Bilgisi***\n");
        ogrt.Bilgi();

    }
}


