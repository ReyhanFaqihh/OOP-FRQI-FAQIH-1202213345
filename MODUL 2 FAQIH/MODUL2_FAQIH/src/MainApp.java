public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir Transportasiair1 = new TransportasiAir(4, 20000);
        Transportasiair1.informasi();
        Transportasiair1.berlayar();
        Transportasiair1.berlabu();
        System.out.println("");

        Sampan Sampan1 = new Sampan(20, 50000, 2);
        Sampan1.informasi();
        Sampan1.berlayar();
        Sampan1.berlabu();
        Sampan1.berlabu(2);
        System.out.println("");

        Kapal Kapal1 = new Kapal(50, 100000, "Diesel");
        Kapal1.informasi();
        Kapal1.berlayar();
        Kapal1.berlayar(20);
        Kapal1.berlabu();
    }
}
