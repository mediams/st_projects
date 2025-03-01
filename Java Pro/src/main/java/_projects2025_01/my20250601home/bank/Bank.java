package _projects2025_01.my20250601home.bank;

public class Bank {
    public static void main(String[] args) {
        Konto kontoA = new Konto("Konto A", 100);
        Konto kontoB = new Konto("Konto B", 55);

        transfer(kontoB, kontoA, 12);
        getInfo(kontoB, kontoA);
        getSum(kontoB, kontoA);

    }

    private synchronized static void getSum(Konto kontoB, Konto kontoA) {
        System.out.println(kontoB.count + kontoA.count + "$, sum" );
    }

    private synchronized static void getInfo(Konto... kontos) {
        for (Konto konto : kontos) {
            System.out.println(konto.count + "$, " + konto.getName());
        }
    }

    private static synchronized void transfer(Konto konto1, Konto konto2, int i) {
        synchronized (konto2) {
            konto2.count += i;
            synchronized (konto1) {
                konto1.count -= i;
            }
        }
    }
}
