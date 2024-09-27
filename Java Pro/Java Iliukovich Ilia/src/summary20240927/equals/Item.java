package summary20240927.equals;

public class Item {

    private String value;

    public Item(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object another) {
        if (another == null || another.getClass() != Item.class) {
            return false;
        }
        Item anotherItem = (Item) another;
        if (this.value == null && anotherItem.value == null) {
            return true;
        } else if (this.value != null) {
            return this.value.equals(anotherItem.value);
        } else {
            return false;
        }
//        return Objects.equals(this.value, anotherItem.value))
    }
}
