public class Pc extends Komputer {
    int ukuranMonitor;

    public Pc(String merek, int kecProcessor, int sizeMemory, String jnsProcessor, int ukuranMonitor) {
        super(merek, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor: " + ukuranMonitor + " inch");
    }
}
