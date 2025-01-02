package _projects2024_12.my20241205home.my20241217class;

import java.time.LocalTime;

public class DaemonThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println(Thread.currentThread().getName() + " running i = " + i++ + " " + LocalTime.now());
//                try {
////                    Thread.
//                }
            }
        });
    }
}
