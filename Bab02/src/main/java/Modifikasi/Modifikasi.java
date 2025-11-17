package Modifikasi;

public class Modifikasi {
    public static void main(String[] args) {
        Balok balok1 = new Balok(5, 3, 4);
        Balok balok2 = new Balok(4, 2, 3);
        Persegi persegi1 = new Persegi(4, 4);
        Persegi persegi2 = new Persegi(6, 3);

        System.out.println("Volume Balok 1: " + balok1.hitungVolume());
        System.out.println("Luas Permukaan Balok 1: " + balok1.hitungLuasPermukaan());
        System.out.println("Volume Balok 2: " + balok2.hitungVolume());
        System.out.println("Luas Permukaan Balok 2: " + balok2.hitungLuasPermukaan());
        System.out.println("Luas Persegi 1 adalah: " + persegi1.hitungLuas());
        System.out.println("Luas Persegi 2 adalah: " + persegi2.hitungLuas());
        balok1.ubahNilai(10, 10, 12);
        persegi1.ubahNilai(12, 12);
        System.out.println("Volume Balok 1 Setelah Diubah: " + balok1.hitungVolume());
        System.out.println("Luas Permukaan Balok 1 Setelah Diubah: " + balok1.hitungLuasPermukaan());
        System.out.println("Luas Persegi 1 adalah Setelah Diubah: " + persegi1.hitungLuas());

    }
}

class Balok{
    double panjang;
    double lebar;
    double tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double hitungVolume(){
        return panjang * lebar * tinggi;
    }

    double hitungLuasPermukaan(){
        return (panjang*lebar*2) + (lebar*tinggi*2) + (panjang*tinggi*2);
    }

    void ubahNilai(double p, double l, double t){
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }
}

class Persegi{
    double panjang;
    double lebar;

    Persegi(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas(){
        return panjang*lebar;
    }
    void ubahNilai(double p, double l){
        panjang = p;
        lebar = l;
    }
}
