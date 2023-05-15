public class Operasyonlar {

    public void sifirdanBuyukmu(int sayi1, int sayi2) {
        if (sayi1 + sayi2 > 0) {
            System.out.println("True burası");
        } else {
            System.out.println("False kısmına girdi");
        }
    }

    public void forDongusu(int sayi) {
        for (int i = 0; i <= sayi; i++) {
            System.out.println("Samet götten " + i + " kadar yedi");
        }
    }

    public void whileMethodu(int sayi) {
        int sayac = 0;
        while (sayac <= sayi) {
            System.out.println("Sülo usta " + sayac + " kadar döner denedi.");
            sayac++;
        }
    }

    public int toplamlariniGetir(int sayi1, int sayi2) {
        return (sayi1 + sayi2);
    }

    public int ikiyeKatla(int sayi1) {
        int yeniSayi1 = sayi1 * 2;
        return yeniSayi1;
    }

    public String sonunaVarmiEkle(String yazi){
        return yazi + " Var mi?";
    }

}
