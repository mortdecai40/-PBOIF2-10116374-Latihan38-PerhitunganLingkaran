package pboif2.pkg10116374.latihan38.perhitunganlingkaran;

/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menghitung lingkaran
 *
 */
class Lingkaran {
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    
    private int hitungJariJari() {
        return diameter / 2;
    }
    
    private double hitungLuas() {
        return Math.PI * Math.pow(hitungJariJari(), 2);
    }
    
    private double hitungKeliling() {
        return 2 * Math.PI * hitungJariJari();
    }
    
    private String formatNilai(double nilai) {
        return String.format("%.2f", nilai).replace('.', ',');
    } 
    
    public void hitungLingkaran() {
        System.out.println("\n====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = " +
                hitungJariJari() + " cm");
        System.out.println("Luas Lingkaran = " +
                formatNilai(hitungLuas()) + " cm");
        System.out.println("Keliling Lingkaran = " +
                formatNilai(hitungKeliling()) + " cm");
        System.out.println("(Developed by : Aufa Ilyasha)");
    }
    
}
