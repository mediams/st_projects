package my20240928.homework;

import java.util.Objects;

public class Box {
    Cat cat;

    public Box(Cat cat) {
        this.cat = cat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Box)) {
            return false;
        }

        Box other = (Box) obj;
        return Objects.equals(this.cat, other.cat);
    }

}
