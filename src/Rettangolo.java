public class Rettangolo extends formaAstratta {
    private final double altezza;

    private final double base;

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
