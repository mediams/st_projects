package my20250111home.carconveyer;

public class Car {
    CarBody carBody;
    Wheel[] wheels;

    public Car(CarBody carBody, Wheel[] wheels) {
        this.carBody = carBody;
        this.wheels = wheels;
    }
}
