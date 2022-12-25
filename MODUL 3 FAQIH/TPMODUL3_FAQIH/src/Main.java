import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        Restaurant r = new Restaurant();
        int customerID, orderQty;

        try {
            System.out.print("Masukkan Customer ID : ");
            customerID = inputan.nextInt();

            System.out.print("Masukkan Jumlah Makanan Yang Di Buat : ");
            orderQty = inputan.nextInt();

            Waiters w = new Waiters(customerID, orderQty);

            Thread t1 = new Thread(r);
            Thread t2 = new Thread(w);

            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Inputan Harus Tipe Integer");
        }
    }
}
