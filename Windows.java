public class Windows extends Laptop {
    String fitur;

    public Windows(String merek, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBaterai,
            String fitur) {
        super(merek, kecProcessor, sizeMemory, jnsProcessor, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur: " + fitur);
    }
}
