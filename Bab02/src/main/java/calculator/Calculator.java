package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        while(true){
            System.out.println("Pilih operasi: ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");

            switch (in.nextInt()){
                case 1:
                    int n = 1;
                    while (true){
                        System.out.println("Masukkan angka ke-"+n);
                        String num = in.nextLine();
                        n++;
                    }
            }
        }
    }

    double tambah(double a, double b){
        return a+b;
    }

    double kurang(double a, double b){
        return a-b;
    }

    double kali(double a, double b){
        return a*b;
    }

    double bagi(double a, double b){
        return a/b;
    }
}


