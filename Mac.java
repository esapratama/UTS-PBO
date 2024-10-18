public class Mac extends Laptop {
    String security;

    public Mac(String merek, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBaterai,
            String security) {
        super(merek, kecProcessor, sizeMemory, jnsProcessor, jnsBaterai);
        this.security = security;
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security: " + security);
    }
}
