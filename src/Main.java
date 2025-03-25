import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        double phi = 4.0;          // Suku pertama: 4
        double pembilang = 4.0;
        double penyebut = 3.0;     // Dimulai dari penyebut = 3 (suku kedua: 4/3)
        int iterasi = 0;
        boolean isMinus = true;    // Tanda operasi (- untuk suku kedua)
        double targetPi = 3.14159; // Nilai π yang ingin dicapai (5 desimal)
        double toleransi = 0.00001; // Batas kedekatan dengan π

        while (iterasi < 1000000) { // Batas maksimum iterasi
            // Tambah/kurangi nilai phi sesuai tanda
            if (isMinus) {
                phi -= pembilang / penyebut;
            } else {
                phi += pembilang / penyebut;
            }

            penyebut += 2;       // Penyebut bertambah 2 (3, 5, 7, ...)
            isMinus = !isMinus;  // Tanda bergantian (+/-)
            iterasi++;

            // Berhenti jika sudah cukup dekat dengan π
            if (Math.abs(phi - targetPi) < toleransi) {
                break;
            }
        }

        // Format phi ke 5 desimal
        String phiFormatted = String.format("%.5f", phi);
        JOptionPane.showMessageDialog(null,
                "Iterasi ke-" + iterasi + "\nNilai phi: " + phiFormatted);
    }
}