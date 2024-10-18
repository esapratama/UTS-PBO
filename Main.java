public class Main {
    public static void main(String[] args) {

        // Instantiate Mac object
        System.out.println("==========================");
        Mac macBook = new Mac("Apple", 3, 16, "M1", "Lithium", "FaceID");
        System.out.println("|      Data MacBook:     |");
        System.out.println("--------------------------");
        macBook.tampilMac();
        System.out.println("==========================");
        System.out.println();

        // Instantiate Windows object
        System.out.println("==========================");
        Windows windowsLaptop = new Windows("Dell", 2, 8, "Intel i7", "Lithium-Ion", "Cortana");
        System.out.println("|  Data Windows Laptop:  |");
        System.out.println("--------------------------");
        windowsLaptop.tampilWindows();
        System.out.println("==========================");
        System.out.println();
        // Instantiate Pc object
        System.out.println("==========================");
        Pc desktopPc = new Pc("Lenovo", 4, 32, "AMD Ryzen", 27);
        System.out.println("|     Data PC Desktop:   |");
        System.out.println("--------------------------");
        desktopPc.tampilPc();
        System.out.println("==========================");
    }
}
