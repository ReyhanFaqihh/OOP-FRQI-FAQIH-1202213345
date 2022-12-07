public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi() {
        System.out.println("Tranportasi air dengan jenis yang tidak diketahui dengan kursi " + jumlahKursi
                + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }

    public void berlayar() {
        System.out.println("Tranportasi air dengan jenis yang tidak diketahui sedang berlayar");
    }

    public void berlabu() {
        System.out.println("Transportasi air dengan jenis yang tidak diketahui berlabuh di pantai");
    }
}
