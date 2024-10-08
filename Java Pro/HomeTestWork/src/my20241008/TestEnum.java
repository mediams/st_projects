package my20241008;

public class TestEnum {
    public static void main(String[] args) {
        Planet planet = Planet.EARTH;
        System.out.println("Surface gravity on Earth: " + planet.calculateSurfaceGravity());
    }
}
