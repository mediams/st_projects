package my20241122class;

import java.util.Optional;

public class FlatMapWithOptional {
    public static void main(String[] args) {
        Optional<Optional<String>> optionalOptional = Optional.of(Optional.of("Data"));
        System.out.println(optionalOptional);

        Optional<String> optional = optionalOptional.flatMap(s -> s);
        Optional<Integer> optionalInteger = optional.map(s -> s.length());
        System.out.println(optionalInteger);
        System.out.println(optional);
        System.out.println(optional.get());


        Insurance insurance = new Insurance("Insurance data");
        Car car = new Car(insurance);
//        String info = car. getInsurance().get().getInfo().get(); --bad
        String info = car.getInsurance().flatMap(Insurance::getInfo).orElse("No insurance info present");
        System.out.println(info);

        Insurance insurance2 = new Insurance();
        Car car2 = new Car();
//        info = car2.getInsurance().getInfo();
//        System.out.println(info);
        String info2 = car2.getInsurance().flatMap(Insurance::getInfo).orElse("No insurance info present");
        System.out.println(info2);


    }

    static class Car {
        public Optional<Insurance> insurance;

        public Car() {
            this.insurance = Optional.empty();
        }

        public Car(Insurance insurance) {
            this.insurance = Optional.of(insurance);
        }

        public Optional<Insurance> getInsurance() {
            return insurance;
        }
    }

    static class Insurance {
        Optional<String> info;

        public Insurance(String info) {
            this.info = Optional.of(info);
        }

        public Insurance() {
        }

        public Optional<String> getInfo() {
            return info;
        }
    }
}

