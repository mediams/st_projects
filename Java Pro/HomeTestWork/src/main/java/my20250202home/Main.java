package my20250202home;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(5, 4, 3); //60
        Cube cube1 = new Cube(8, 4, 6); //192
        TotalVolumeCube totalVolumeCube = new TotalVolumeCube(cube);
        System.out.println(totalVolumeCube);
        totalVolumeCube = new TotalVolumeCube(cube1);
        System.out.println(totalVolumeCube.toString());
    }
}
