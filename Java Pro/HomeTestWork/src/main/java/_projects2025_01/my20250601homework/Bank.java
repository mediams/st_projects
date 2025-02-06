package _projects2025_01.my20250601homework;

public class Bank {
    public static void main(String[] args) {
        Konto kontoOne = new Konto("Konto 1", 27);
        Konto kontoTwo = new Konto("Konto 2", 112);

        transfer(kontoOne, kontoTwo, 5);
        getAktuellKonto(kontoOne, kontoTwo);
        System.out.println(getSum(kontoOne, kontoTwo));
    }

    private static synchronized int getSum(Konto kontoOne, Konto kontoTwo) {
        return kontoOne.getKonto() + kontoTwo.getKonto();
    }

    private static synchronized void getAktuellKonto(Konto kontoOne, Konto kontoTwo) {
        System.out.println("kontoOne: " + kontoOne.getKonto() + ", kontoTwo: " + kontoTwo.getKonto());

    }

    public static void transfer(Konto kontoOne, Konto kontoTwo, int sum) {
        synchronized (kontoOne) {
            synchronized (kontoTwo) {
                kontoOne.setKonto(kontoOne.getKonto() - sum);
                kontoTwo.setKonto(kontoTwo.getKonto() + sum);
            }
        }

    }

}

class Konto {
    String name;
    int konto;

    public Konto(String name, int konto) {
        this.name = name;
        this.konto = konto;
    }

    public String getName() {
        return name;
    }

    public int getKonto() {
        return konto;
    }

    public void setKonto(int konto) {
        this.konto = konto;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "name='" + name + '\'' +
                ", konto=" + konto +
                '}';
    }
}
//3. В банке имеется два счета. Реализовать потокобезопасным способом:
//   - перевод денег со счета A на счет Б
//   - извлечение информации о сумме счета A и счета Б
//   - извлечение общей суммы на двух счетах
