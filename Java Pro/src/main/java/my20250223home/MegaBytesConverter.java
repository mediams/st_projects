package my20250223home;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500); //→ should print the following text: "2500 KB = 2 MB and 452 KB"

        printMegaBytesAndKiloBytes(-1024); //→ should print the following text: "Invalid Value" because parameter is less than 0.

        printMegaBytesAndKiloBytes(5000); //→ should print the following text: "5000 KB = 4 MB and 904 KB"
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int mb = kiloBytes / 1024;
        int kb = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
    }
//    XX represents the original value kiloBytes.
//    YY represents the calculated megabytes.
//    ZZ represents the calculated remaining kilobytes.
}
