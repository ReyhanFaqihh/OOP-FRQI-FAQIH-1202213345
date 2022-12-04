public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        if (webcam == true) {
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan memiliki ram sebesar " + ram
                    + " GB dan memiliki processor secepat " + processor + "Ghz. Laptop ini memiliki webcam");
        } else {
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan memiliki ram sebesar " + ram
                    + " GB dan memiliki processor secepat " + processor + "Ghz. Laptop ini tidak memiliki webcam");
        }

    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop ini memiliki game " + nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop ini telah mengirimkan email ke " + email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop ini juga telah mengirimkan email ke " + email1 + " dan email " + email2);
    }
}
