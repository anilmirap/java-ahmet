public class CalistirmaYeri {

    public static void main(String[] args) {

        Operasyonlar opera = new Operasyonlar();
        opera.sifirdanBuyukmu(3,-5);
        opera.forDongusu(10);
        opera.whileMethodu(50);

        int sayi1 = 30;
        int sayi2 = 100;

        int ikiyeKatlanmisSayi = opera.ikiyeKatla(sayi1);

        int toplam = ikiyeKatlanmisSayi + sayi2;

        String kontrol = opera.sonunaVarmiEkle("Sende hiç özür");

        System.out.println(kontrol);

    }

}
