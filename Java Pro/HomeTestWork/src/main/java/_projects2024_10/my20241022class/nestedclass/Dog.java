package _projects2024_10.my20241022class.nestedclass;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public static class DogFood{
        private String foodName;

        public DogFood(String foodName) {
            this.foodName = foodName;
        }

        @Override
        public String toString() {
            return "DogFood{" +
                    "foodName='" + foodName + '\'' +
                    '}';
        }
    }
}
