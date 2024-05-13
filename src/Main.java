public class Main {
    public static void main(String[] args) {
        Urunler urunler=new Urunler();
        FiyatveBilgi fiyatveBilgi=new FiyatveBilgi();
        Sunum sunum=new Sunum(urunler,fiyatveBilgi);

        sunum.setmobilya("Kanepe");
        sunum.setelektronik("Laptop");
        sunum.setgiyim("T-shirt");
        sunum.setarac("Telefon Tutacağı");
        sunum.setmarket("Diş Macunu");

        fiyatveBilgi.giris();
        fiyatveBilgi.fiyatAraligi();
        fiyatveBilgi.urunsecenek(sunum.getmobilya(), sunum.getelektronik(), sunum.getgiyim(), sunum.getarac(), sunum.getmarket());
        fiyatveBilgi.cikis();
    }
}