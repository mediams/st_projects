package my20250601home.recursion;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Box mainBox = new Box();
// Основная коробка
        Box smallBox = new Box();
// Вложенная коробка
        Key key = new Key();
// Ключ

        smallBox.addItem(key);
// Кладём ключ в маленькую коробку
        mainBox.addItem(smallBox);
// Кладём маленькую коробку в основную коробку


// Поиск ключа
        lookForKey(mainBox);
    }

    public static void lookForKey(Box mainBox) {
        List<Box> pile = new ArrayList<>();
        pile.add(mainBox);
// Начинаем с основной коробки

        while (!pile.isEmpty()) {
            Box box = pile.remove(0);
// Берём первую коробку
            for (Object item : box.getContents()) {
                if (item instanceof Box) {
                    pile.add((Box) item);
// Если это коробка, добавляем её в стопку
                } else if (item instanceof Key) {
                    System.out.println("Нашёл ключ!");
                    return;
// Останавливаем поиск
                }
            }
        }
    }


    // Вспомогательные классы
    static class Box {
        private final List<Object> contents = new ArrayList<>();

        public void addItem(Object item) {
            contents.add(item);
        }

        public List<Object> getContents() {
            return contents;
        }
    }

    static class Key {
    }
}
