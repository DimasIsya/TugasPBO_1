package tugaspbo;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    private final double tinggi;
    private double panjang;
    private double lebar;

    Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (hitungLuas() + (panjang * tinggi) + (lebar * tinggi) + (panjang * lebar));
    }
}
