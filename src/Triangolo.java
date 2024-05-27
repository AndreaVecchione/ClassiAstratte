public class Triangolo extends formaAstratta {
    private final double base;
    private final double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
//Metto un override del metodo su formaAstratta per andarmi a calcolare l'area
    @Override
    public double calcolaArea() {
        return base * altezza / 2;
    }
}
