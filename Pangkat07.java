package minggu5;

public class Pangkat07{
    public int nilai, pangkat;

    public Pangkat07(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public int pangkatBF(int basis, int eksponen) {
        int hasil = 1;
        for (int i = 0; i < eksponen; i++) {
            hasil = hasil * basis;
        }
        return hasil;
    }

    public int pangkatDC(int basis, int eksponen) {
        if (eksponen == 0) {
            return 1;
        } else {
            if (eksponen % 2 == 1) { // eksponen ganjil
                return (pangkatDC(basis, eksponen / 2) * pangkatDC(basis, eksponen / 2) * basis);
            } else { // eksponen genap
                return (pangkatDC(basis, eksponen / 2) * pangkatDC(basis, eksponen / 2));
            }
        }
    }
}
