public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi() {
        System.out.println("Transportasi air dengan jenis sampan dengan kursi berjumlah " + jumlahKursi
                + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }

    public void berlayar() {
        System.out.println("Tranportasi air dengan jenis sampan sedang berlayar menggunakan " + layar + " layar");
    }

    public void berlabu() {
        System.out.println("Transportasi air dengan jenis sampan sedang berlabuh dipantai tanpa jangkar");
    }

    public void berlabu(int jangkar) {
        System.out.println("Transportasi air dengan jenis sampan sedang berlabuh menggunakan " + jangkar + " jangkar");
    }
}
