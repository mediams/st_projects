package delete01;

public enum Operation {
    ADD{
        @Override
        public double apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT{
        @Override
        public double apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY{
        @Override
        public double apply(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public double apply(int a, int b) {
            return new java.math.BigDecimal(a)
                    .divide(new java.math.BigDecimal(b), 2, java.math.RoundingMode.HALF_UP)
                    .doubleValue();
        }
    };

    public abstract double apply(int a, int b);
}
