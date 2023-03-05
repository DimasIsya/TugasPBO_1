package tugaspbo;

public class Tabung extends Lingkaran implements MenghitungRuang {
    private double tinggi;

    Tabung(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return (2 * super.hitungLuas()) + (hitungKeliling() * tinggi);
    }
}
