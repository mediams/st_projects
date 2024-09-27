package summary20240927.equals;

import java.util.Objects;

public class Item {

    private String value;
    public int num;

    public Item(String value) {
        this.value = value;
    }

    public Item(int num) {
        this.num = num;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true; // Оба объекта ссылаются на один и тот же экземпляр
//        }
//        if (obj instanceof String) {
//            return this.value.equals(obj); // Сравнение со строкой
//        }
//        // Дальнейшие проверки будут проводиться, только если ссылки разные
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        // Остальные сравнения полей объектов
//        Item other = (Item) obj;
//        return this.value.equals(other.value);
//    }
        Item other = (Item) obj;
        return Objects.equals(this.value, other.value);
    }
}

