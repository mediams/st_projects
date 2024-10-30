package my20241030homework;

import java.util.TreeSet;


public class BankEx {

    public interface BankCard extends Comparable<BankCard> {
        int id();
    }

    public static class MasterCard implements BankCard {
        private int masterCardId;

        public MasterCard(int masterCardId) {
            this.masterCardId = masterCardId;
        }

        @Override
        public int id() {
            return masterCardId;
        }

        @Override
        public int compareTo(BankCard o) {
            return Integer.compare(id(), o.id());
        }

        @Override
        public String toString() {
            return "MasterCard{" +
                    "masterCardId=" + masterCardId +
                    '}';
        }
    }


    public static class Visa implements BankCard {
        private int visaId;

        public Visa(int visaId) {
            this.visaId = visaId;
        }

        @Override
        public int id() {
            return visaId;
        }

        @Override
        public int compareTo(BankCard o) {
            return Integer.compare(id(), o.id());
        }

        @Override
        public String toString() {
            return "Visa{" +
                    "visaId=" + visaId +
                    '}';
        }
    }

    public static void main(String[] args) {
        TreeSet<BankCard> cardTreeSet = new TreeSet<>();
        cardTreeSet.add(new MasterCard(26565));
        cardTreeSet.add(new Visa(646789));

        System.out.println(cardTreeSet);
    }
}
