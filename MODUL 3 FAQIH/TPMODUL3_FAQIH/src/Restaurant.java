public class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return foodNumber;
    }

    public void makeFood() {
        synchronized (Restaurant.lock) {
            if (waitingForPickup) {
                try {
                    System.out.println("Restaurant : Tunggu pelayan mengantarkan pesanan");
                    Restaurant.lock.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            waitingForPickup = true;
            System.out.println("Restaurant : Membuat makanan nomor " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant : Memberi tahu pelayan untuk mengambil pesanan\n");
        }
    }

    public static Object getLock() {
        return lock;
    }

}
