public class Komputer {
    String merek;
    int kecProcessor;
    int sizeMemory;
    String jnsProcessor;

    public Komputer(String merek, int kecProcessor, int sizeMemory, String jnsProcessor) {
        this.merek = merek;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jnsProcessor = jnsProcessor;
    }

    public void tampilData() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan Processor: " + kecProcessor + " GHz");
        System.out.println("Ukuran Memory: " + sizeMemory + " GB");
        System.out.println("Jenis Processor: " + jnsProcessor);
    }
}
