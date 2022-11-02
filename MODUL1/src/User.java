public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    public String nama;
    public int noHP;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHP(int noHP) {
        this.noHP = noHP;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number
    // and success message

    public void userRegister() {

        System.out.println("Nama : " + nama);
        System.out.println("No Handphone : " + noHP);
        System.out.println("Success");
    }
}
