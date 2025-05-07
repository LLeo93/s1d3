
    public class Main {
        public static void main(String[] args) {
            // Creazione di due rettangoli
            es1 rettangolo1 = new es1(5.0, 10.0);
            es1 rettangolo2 = new es1(3.5, 7.0);

            // Utilizzo dei metodi
            System.out.println("=== Singolo Rettangolo ===");
            rettangolo1.stampaRettangolo();

            System.out.println("\n=== Due Rettangoli ===");
            es1.stampaDueRettangoli(rettangolo1, rettangolo2);
        }
    }

