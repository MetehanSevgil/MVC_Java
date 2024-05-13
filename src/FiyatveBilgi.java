import java.util.Scanner;

public class FiyatveBilgi  implements IFiyatBilgileri,IGirisCikis{

    /**
     *View Sayfası
     */

    int taksit;

    @Override
    public void fiyatAraligi(){
        System.out.println("Mobilya Fiyat Aralığı: 4.000TL-70.000TL");
        System.out.println("Elektronik Eşya Fiyat Aralığı: 250TL-25.000TL");
        System.out.println("Giyim Fiyat Aralığı: 100TL-3.000TL");
        System.out.println("Araç Aksesuarı Fiyat Aralığı: 75TL-1.000TL");
        System.out.println("Market Ürünleri Fiyat Aralığı: 10TL-500TL");
        System.out.println("**************************************");
        System.out.println("**************************************");
    }

    @Override
    public void fiyatbilgi(String esya) {

        if (esya.equals("Kanepe")) {
            System.out.println("Ürün 8.000TL");
            System.out.println("**************************************");
            urunfiyat(8000);
        }
        if (esya.equals("Laptop")) {
            System.out.println("Ürün 9.000TL");
            System.out.println("**************************************");
            urunfiyat(9000);
        }
        if (esya.equals("T-shirt")) {
            System.out.println("Ürün 500TL");
            System.out.println("**************************************");
            urunfiyat(500);
        }
        if (esya.equals("Telefon Tutacağı")) {
            System.out.println("Ürün 650TL");
            System.out.println("**************************************");
            urunfiyat(650);
        }
        if (esya.equals("Diş Macunu")) {
            System.out.println("Ürün 120TL");
            System.out.println("**************************************");
            urunfiyat(120);
        }
    }

    @Override
    public void urunsecenek(String mobilya,String elektronik,String giyim,String arac,String market){
        System.out.println("Ürün seçenekleri: Mobilya---Elektronik---Giyim---Araç---Market");
        System.out.println("Mobilya için 1'i seçiniz");
        System.out.println("Elektronik için 2'yi seçiniz");
        System.out.println("Giyim için 3'ü seçiniz");
        System.out.println("Araç için 4'ü seçiniz");
        System.out.println("Market için 5'i seçiniz");
        int secenek;
        System.out.println("Hangi ürünü seçmek istiyorsunuz:");
        Scanner scanner =new Scanner(System.in);
        secenek=scanner.nextInt();
        if(secenek==1) {
            System.out.println("Mobilya Seçildi.");
            System.out.println("Seçilen ürün: "+mobilya);
            fiyatbilgi(mobilya);
        }
        else if(secenek==2) {
            System.out.println("Elektronik  Seçildi.");
            System.out.println("Seçilen ürün: "+elektronik);
            fiyatbilgi(elektronik);
        }
        else if(secenek==3) {
            System.out.println("Giyim Seçildi.");
            System.out.println("Seçilen ürün: "+giyim);
            fiyatbilgi(giyim);
        }
        else if(secenek==4) {
            System.out.println("Araç Seçildi.");
            System.out.println("Seçilen ürün: "+arac);
            fiyatbilgi(arac);
        }
        else if(secenek==5) {
            System.out.println("Market Seçildi.");
            System.out.println("Seçilen ürün: "+market);
            fiyatbilgi(market);
        }
        else
            System.out.println("Yanlış sayı seçildi.");

    }

    @Override
    public void taksitsecenekleri() {
        System.out.println("Taksit seçenekleri: 1,2,4,6,8");
    }

    // 2. Sayfa Overload1
    public int taksitsecenekleri(int taksit1) {
        System.out.println("Taksit seçenekleri: 1,2,4,6,8,12");
        return taksit1;
    }

    @Override
    public void urunfiyat(int fiyat) {
        System.out.println("Kaç taksit yapmak istersiniz ?");
        taksitsecenekleri();
        Scanner scanner = new Scanner(System.in);
        taksit = scanner.nextInt();
        if (taksit == 1 || taksit==2 || taksit==4  || taksit==6  || taksit==8 ) {
            System.out.println(taksit + " taksit yapıldı.");
            if(fiyat==8000){
                System.out.println("Aylık ödeme miktarı: "+(double)8000/taksit+"TL");
            }
            if(fiyat==9000){
                System.out.println("Aylık ödeme miktarı: "+(double)9000/taksit+"TL");
            }
            if(fiyat==500){
                System.out.println("Aylık ödeme miktarı: "+(double)500/taksit+"TL");
            }
            if(fiyat==650){
                System.out.println("Aylık ödeme miktarı: "+(double)650/taksit+"TL");
            }
            if(fiyat==120){
                System.out.println("Aylık ödeme miktarı: "+(double)120/taksit+"TL");
            }
        }
        else
            System.out.println("Yanlış taksit sayısı seçildi.");

    }

    @Override
    public void giris() {
        System.out.println("Fiyat ve Bilgi sayfasına giriş yapıldı");
        System.out.println("**************************************");
        System.out.println("**************************************");
    }

    // 2. Sayfa Overload2
    public String giris(String random){
        System.out.println("Fiyat ve Bilgi sayfasına giriş yapıldı.");
        System.out.println("Fiyat ve Bilgi sayfası Overload giriş çalıştı");
        return random;
    }

    @Override
    public void cikis() {
        System.out.println("**************************************");
        System.out.println("Fiyat ve Bilgi sayfasından çıkış yapıldı");
    }
}
