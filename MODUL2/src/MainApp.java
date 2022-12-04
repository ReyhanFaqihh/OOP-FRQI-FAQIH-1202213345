public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat Perangkat1 = new Perangkat("Adata", 2, (float) 1.80);
        Perangkat1.informasi();
        System.out.println("");

        Laptop Laptop1 = new Laptop("Seagate", 8, (float) 2.40, true);
        Laptop1.informasi();
        Laptop1.bukaGame("valo");
        Laptop1.kirimEmail("faqih@gmail.com");
        Laptop1.kirimEmail("Reyhan@gmail.com", "Ashuri@gmail.com");
        System.out.println("");

        Handphone Handphone1 = new Handphone("Sandisk", 3, (float) 2.20, false);
        Handphone1.informasi();
        Handphone1.telfon(62853468);
        Handphone1.kirimSMS(62853468);
        Handphone1.kirimSMS(628539968, 628531077);

    }
}
