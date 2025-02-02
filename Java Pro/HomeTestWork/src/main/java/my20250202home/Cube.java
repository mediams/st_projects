package my20250202home;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cube {
    private int x;
    private int y;
    private int z;

    private double cubeVolume;

    public Cube(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.cubeVolume = x*y*z;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", cubeVolume=" + cubeVolume +
                '}';
    }
}
