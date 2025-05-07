public class es1 {
    private double altezza;
    private double larghezza;

    // Costruttore
    public es1(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Metodo per calcolare l'area
    public double calcolaArea() {
        return altezza * larghezza;
    }


    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }


    public void stampaRettangolo() {
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }

    // Metodo statico per stampare due rettangoli e sommare area e perimetro
    public static void stampaDueRettangoli(es1 r1, es1 r2) {
        System.out.println("Rettangolo 1:");
        r1.stampaRettangolo();
        System.out.println("Rettangolo 2:");
        r2.stampaRettangolo();

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma Aree: " + sommaAree);
        System.out.println("Somma Perimetri: " + sommaPerimetri);
    }
}

