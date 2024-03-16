package minggu5;

public class Akar07 {
    public double angka;

    public double akarBF(double angka) {
        double rendah = 0, tinggi = angka, tengah;
        while (rendah <= tinggi) {
            tengah = rendah + (tinggi - rendah) / 2;
            if (tengah * tengah == angka) {
                return tengah;
            } else if (tengah * tengah < angka) {
                rendah = tengah + 0.00001; 
            } else {
                tinggi = tengah - 0.00001; 
            }
        }
        return rendah;
    }

    public double akarDC(double angka, double rendah, double tinggi) {
        double tengah = rendah + (tinggi - rendah) / 2;
        if (tinggi - rendah < 0.00001) {
            return tengah;
        }
        if (tengah * tengah == angka) {
            return tengah;
        } else if (tengah * tengah < angka) {
            return akarDC(angka, tengah, tinggi);
        } else {
            return akarDC(angka, rendah, tengah);
        }
    }
}

