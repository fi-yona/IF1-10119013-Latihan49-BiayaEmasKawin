/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan49.biayaemaskawin;

/**
 *
 * @author Fiona Avila
 */


public class OOBiayaEmasKawin {
    
    private String nama = "Hendi";
    private double beratEmasKawin = 15.7;
    private double hargaEmas = 570000;
    
    public String getNamaPembeli(){
        return nama;
    }
    
    public void setNamaPembeli(String nama){
        this.nama = nama;
    }
    
    public double getBeratEmasKawin(){
        return beratEmasKawin;
    }
    
    public void setBeratEmasKawin(double beratEmasKawin){
        this.beratEmasKawin = beratEmasKawin;
    }
    
    public double getHargaEmas(){
        return hargaEmas;
    }
    
    public void setHargaEmas(double hargaEmas){
        this.hargaEmas = hargaEmas;
    }
    
    public double hitungBiaya(){
        return beratEmasKawin * hargaEmas;
    }
    
    public static void main(String[] args) {
        OOBiayaEmasKawin oo = new OOBiayaEmasKawin();
        String nama = oo.getNamaPembeli();
        double beratEmasKawin = oo.getBeratEmasKawin();
        double hargaEmas = oo.getHargaEmas();
        double biaya = oo.hitungBiaya();
        System.out.println("Nama pembeli : " + nama);
        System.out.println();
        System.out.println("Berat emas kawin :" + beratEmasKawin + " gram");
        System.out.println("Harga emas per gram : Rp " + hargaEmas);
        System.out.println("-----------------------------------");
        System.out.println("Biaya yang harus dibayar : Rp " + biaya);
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
