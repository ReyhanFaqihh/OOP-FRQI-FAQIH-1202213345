public class Handphone extends Perangkat {
    protected boolean fingerprint;

    // constructor
    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        if (fingerprint == true) {
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram
                    + " GB dan processor secepat " + processor + "Ghz. Selain itu handphone ini memiliki fingerprint");
        } else {
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram
                    + " GB dan processor secepat " + processor
                    + "Ghz. Selain itu handphone ini Tidak memiliki fingerprint");
        }

    }

    public void telfon(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.println("Handphone ini berhasil mengirim sms ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone ini berhasil juga mengirim sms ke nomor " + no_hp1 + " dan nomor " + no_hp2);
    }

}