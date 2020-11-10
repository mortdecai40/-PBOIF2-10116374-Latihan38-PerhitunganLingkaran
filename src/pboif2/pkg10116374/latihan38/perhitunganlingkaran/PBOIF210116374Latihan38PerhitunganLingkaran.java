package pboif2.pkg10116374.latihan38.perhitunganlingkaran;
import java.util.Scanner;
/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menghitung lingkaran
 *
 */
public class PBOIF210116374Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setDiameter(inputDiameter());
        lingkaran.hitungLingkaran();
    }
    
    
    /**
     * Fungsi untuk input diameter
     * 
     * @return integer
     */
    public static int inputDiameter() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======Perhitungan Lingkaran======");
        
        boolean looped = false;
        
        do {
            if(looped) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                scanner.nextLine();
           }
            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            
            looped = true;
        } while(!scanner.hasNextInt());
        
        return scanner.nextInt();
    }
    
}
