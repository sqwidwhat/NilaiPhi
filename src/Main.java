import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        double phi = 4.0;
        double pembilang = 4.0;
        double penyebut = 3.0;
        int iterasi = 0;
        boolean kurang = true;
        double targetPi = 3.14159;
        double toleransi = 0.000001;

        while (iterasi < 1000000) {
            if (kurang) {
                phi -= pembilang / penyebut;
            } else {
                phi += pembilang / penyebut;
            }

            penyebut += 2;
            kurang = !kurang;
            iterasi++;

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