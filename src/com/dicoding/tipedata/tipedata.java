package com.dicoding.tipedata;

public class tipedata {
    public static void main(String[] args){
        bit8();
        System.out.println();
        bit16();
        System.out.println();
        bit32();
        System.out.println();
        bit64();
        System.out.println();
        desimalkecil();
        System.out.println();
        desimalbesar();
        System.out.println();
        bool();
        System.out.println();
        karakter();
        System.out.println();
        string();
    }

    public static void bit8(){
        System.out.println("Ripe data integer 8 bit yang digunakan untuk menampung angka dalam range yang kecil. Nilai minimum dan maksimum dari tipe data ini adalah -128, dan 127. Tipe data byte memiliki nilai default 0. Ia digunakan untuk menghemat ruang dalam array yang besar, terutama pada bilangan bulat, karena 1 (satu) byte 4 (empat) kali lebih kecil dari tipe data int.");
        byte testmin = -128;
        byte testmax = 127;
        System.out.println("batas byte = " + testmin + " - " + testmax);
    }

    public static void bit16(){
        System.out.println("Merupakan tipe data integer 16 bit yang digunakan untuk menampung angka dalam range menengah, yaitu antara -32,768 sampai 32,767. Sama seperti tipe sebelumnya, nilai default-nya 0. Ia bisa digunakan untuk menghemat memori seperti tipe data byte namun hanya 2 (dua) kali lebih kecil dari tipe data int.");
        short testmin = -32768;
        short testmax = 32767;
        System.out.println("batas short = " + testmin + " - " + testmax);
    }

    public static void bit32(){
        System.out.println("Merupakan tipe data integer 32 bit yang digunakan untuk menyimpan angka dalam range cukup besar, yakni antara -2,147,483,648 sampai 2,147,483,647 dengan nilai default 0. Jika kita tidak memperhatikan penggunaan memori, tipe data inilah yang biasanya dipakai.");
        int testmin = -2147483648;
        int testmax = 2147483647;
        System.out.println("batas int = " + testmin + " - " + testmax);
    }

    public static void bit64(){
        System.out.println("Merupakan tipe data integer yang lebih besar jika dibandingkan dengan tipe data int. Ukurannya 64 bit dan bisa digunakan untuk menyimpan angka dengan range antara -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807. Tipe data long memiliki nilai default 0L.");
        long testmin = -1999999999 ;
        long testmax = 1999999999;
        System.out.println("batas long = " + testmin + " - " + testmax);
    }

    public static void desimalkecil(){
        System.out.println("Merupakan sebuah tipe data yang bisa digunakan untuk menampung angka desimal. Nilai default-nya 0.0f.");
        float test = 3.5f;
        System.out.println("float = " + test);
    }

    public static void desimalbesar(){
        System.out.println("Merupakan sebuah tipe data yang mirip seperti tipe data float, namun memiliki kapasitas yang lebih besar. Nilai default-nya 0.0d.");
        double test = 5.0;
        System.out.println("long = " + test);
    }

    public static void bool(){
        System.out.println("Merupakan sebuah tipe data yang memiliki 2 (dua) macam nilai, yaitu true dan false. Nilai default-nya false.");
        boolean testmin = false;
        boolean testmax = true;
        System.out.println("batas boolean = " + false + " - " + true);
    }

    public static void karakter(){
        System.out.println("Merupakan sebuah tipe data yang bisa digunakan untuk menampung karakter. Nilai karakter tersebut dibungkus di dalam tanda ' '.");
        char test = 'a';
        System.out.println("float = " + test);
    }

    public static void string(){
        String test = "kalimat panjang";
        System.out.println("string = " + test);
    }

    public static void tipedatasendiri(){
        Users user = new Users();
    }
}

