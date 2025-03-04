/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphian;

/**
 *
 * @author Olla
 */


    /**
     * @param args the command line arguments
     */
    abstract class BangunDatar { // Kelas abstrak sebagai superclass
    abstract double luas();  // Method abstrak untuk menghitung luas
    abstract double keliling(); // Method abstrak untuk menghitung keliling
}

class Persegi extends BangunDatar { // `Persegi` mewarisi `BangunDatar`
    double sisi; // Atribut panjang sisi

    public Persegi(double sisi) { // Constructor untuk menginisialisasi sisi
        this.sisi = sisi;
    }

    @Override
    double luas() { // Implementasi method luas()
        return sisi * sisi; 
    }

    @Override
    double keliling() { // Implementasi method keliling()
        return 4 * sisi; 
    }
}

class Lingkaran extends BangunDatar { // `Lingkaran` mewarisi `BangunDatar`
    double r; // Atribut jari-jari

    public Lingkaran(double r) { // Constructor untuk menginisialisasi jari-jari
        this.r = r;
    }

    @Override
    double luas() { // Implementasi method luas()
        return Math.PI * r * r; // Rumus luas lingkaran
    }

    @Override
    double keliling() { // Implementasi method keliling()
        return 2 * Math.PI * r; // Rumus keliling lingkaran
    }
}

class Segitiga extends BangunDatar { // `Segitiga` mewarisi `BangunDatar`
    double alas, tinggi; // Atribut alas dan tinggi

    public Segitiga(double alas, double tinggi) { // Constructor untuk inisialisasi
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double luas() { // Implementasi method luas()
        return 0.5 * alas * tinggi; // Rumus luas segitiga
    }

    @Override
    double keliling() { // Implementasi method keliling()
        return 3 * alas; // Asumsi segitiga sama sisi
    }
}
public class Polymorphian {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(4); // Membuat objek Persegi
        BangunDatar lingkaran = new Lingkaran(7); // Membuat objek Lingkaran
        BangunDatar segitiga = new Segitiga(6, 8); // Membuat objek Segitiga

        BangunDatar[] bangunDatars = {persegi, lingkaran, segitiga}; // Array dengan polymorphism

        for (BangunDatar bangunDatar : bangunDatars) { // Loop untuk memproses setiap objek
            System.out.println("Luas: " + bangunDatar.luas()); // Memanggil method luas()
            System.out.println("Keliling: " + bangunDatar.keliling()); // Memanggil method keliling()
            System.out.println("--------------------");
        }
    }
}
    
    
