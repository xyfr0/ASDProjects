package main.DemoMethod1;

class Kotak{
    double panjang;
    double lebar;
    double tinggi;

    void cetakVolume(){
        System.out.println("Volume Kotak = " + panjang * lebar * tinggi);
    }
}

public class DemoMethod1 {

    public static void main(String[] args) {
        Kotak k1, k2, k3;

        k1 = new Kotak();
        k2 = new Kotak();
        k3 = new Kotak();

        k1.panjang = 4;
        k1.lebar = 3;
        k1.tinggi = 2;

        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;

        k3.panjang = 8;
        k3.lebar = 7;
        k3.tinggi = 6;

        k1.cetakVolume();
        k2.cetakVolume();
        k3.cetakVolume();
    }
}


