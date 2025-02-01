package com.example.demospringex;

enum Status {
    RUNNING, STOPPED, ERROR
}

enum Laptop {
    MACBOOK(2000), WINDOWS(2200), UNKNOWN();

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    Laptop() {
    }

    public int getPrice() {
        return price;
    }
}

public class DemoJavaDelete {
    public static void main(String[] args) {
        Status status = Status.RUNNING;
        System.out.println(status.ordinal());

        Status[] values = Status.values();
        System.out.println(values.length);
        for (Status value : values) {
            System.out.println(value + " " + value.ordinal());
        }

        status = Status.STOPPED;
        if (status == Status.RUNNING) {
            System.out.println("I'm running");
        } else if (status == Status.STOPPED) {
            System.out.println("I'm stopped");
        } else if (status == Status.ERROR) {
        }

        status = Status.ERROR;
        System.out.println(status.getClass().getSuperclass());

        switch (status) {
            case RUNNING:
                System.out.println("I'm running");
                break;
            case STOPPED:
                System.out.println("I'm stopped");
                break;
            case ERROR:
                System.out.println("I'm error");
                break;
            default:
                break;
        }

        Laptop laptop = Laptop.MACBOOK;
        System.out.println(laptop.getPrice());

        Laptop[] laptops = Laptop.values();
        for (Laptop l : laptops) {
            System.out.println(l + " " + l.getPrice());
        }
    }
}
