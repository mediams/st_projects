package my20241126class;

import java.util.ArrayList;
import java.util.List;

public class Box<Item> {

    private Item item;

    public void put(Item item) {
        this.item = item;
    }

    public Item get() {
        return item;
    }

    public Item remove() {
        Item temp = item;
        item = null;
        return temp;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
