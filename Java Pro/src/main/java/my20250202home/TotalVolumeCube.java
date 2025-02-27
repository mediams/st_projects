package my20250202home;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TotalVolumeCube {
    private Cube cube;
    private static double totalCubeVolume;

    public TotalVolumeCube(Cube cube) {
        this.cube = cube;
        totalCubeVolume += cube.getX() * cube.getY() * cube.getZ();
    }

    @Override
    public String toString() {
        return "TotalVolumeCube{" +
                "cube=" + cube +
                ", totalCubeVolume=" + totalCubeVolume +
                '}';
    }
}
