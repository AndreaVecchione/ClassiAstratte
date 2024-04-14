public class Rettangolo extends formaAstratta {
    private double altezza;

    private double base;

    public double getAltezza() {
        return altezza;
    }

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
