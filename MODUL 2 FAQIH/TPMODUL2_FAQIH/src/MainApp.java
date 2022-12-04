public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat Perangkat1 = new Perangkat("WD", 8, (float) 3.40);
        Perangkat1.informasi();
        System.out.println("");

        Laptop Laptop1 = new Laptop("Transcend", 8, (float) 3.10, true);
        Laptop1.informasi();
        Laptop1.bukaGame("valo");
        Laptop1.kirimEmail("faqih@gmail.com");
        Laptop1.kirimEmail("Reyhan@gmail.com", "Ashuri@gmail.com");
        System.out.println("");

        Handphone Handphone1 = new Handphone("Toshiba", 4, (float) 2.60, false);
        Handphone1.informasi();
        Handphone1.telfon(62853468);
        Handphone1.kirimSMS(62853468);
        Handphone1.kirimSMS(628539968, 628531077);

    }
}
