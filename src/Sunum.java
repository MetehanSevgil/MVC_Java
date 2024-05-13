public class Sunum implements IGirisCikis{

    /**
     *Controller Sayfası
     */
    Urunler urunler;
    FiyatveBilgi fiyatveBilgi;

    Sunum(Urunler urunler,FiyatveBilgi fiyatveBilgi){
        this.urunler=urunler;
        this.fiyatveBilgi=fiyatveBilgi;
    }

    public void setmobilya(String mobilya){
        urunler.setMobilya(mobilya);
    }
    public String getmobilya(){
        return urunler.getMobilya();
    }
    public void setelektronik(String elektronik){
        urunler.setElektronik(elektronik);
    }
    public String getelektronik(){
        return urunler.getElektronik();
    }
    public void setgiyim(String giyim){
        urunler.setGiyim(giyim);
    }
    public String getgiyim(){
        return urunler.getGiyim();
    }
    public void setarac(String arac){
        urunler.setArac(arac);
    }
    public String getarac(){
        return urunler.getArac();
    }
    public void setmarket(String market){
        urunler.setMarket(market);
    }
    public String getmarket(){
        return urunler.getMarket();
    }

    @Override
    public void giris() {
        System.out.println("Sunum sayfasına giriş yapıldı.");
    }
    //3. Sayfa Overload1
    public String giris(String random){
        System.out.println("Sunum sayfasına giriş yapıldı.");
        System.out.println("Sunum sayfası Overload giriş çalıştı");
        return random;
    }
    @Override
    public void cikis() {
        System.out.println("Sunum sayfasından çıkış yapıldı.");
    }
    //3. Sayfa Overload2
    public String cikis(String random){
        System.out.println("Sunum sayfasından çıkış yapıldı.");
        System.out.println("Sunum sayfası Overload çıkış çalıştı");
        return random;
    }
}
