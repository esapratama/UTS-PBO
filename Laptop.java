public class Laptop extends Komputer {
    String jnsBaterai;

    public Laptop(String merek, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBaterai) {
        super(merek, kecProcessor, sizeMemory, jnsProcessor);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai: " + jnsBaterai);
    }
}
