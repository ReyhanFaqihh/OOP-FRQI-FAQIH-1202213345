public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 15000;

    public Waiters(int customerID, int orderQty) {
        this.orderQty = orderQty;
        this.customerID = customerID;
    }

    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("====================");
        System.out.println("Customer Id : " + customerID);
        System.out.println("Number of Food : " + orderQty);
        System.out.println("Total Price : " + orderQty * foodPrice);
        System.out.println("====================");
    }

    public void getFood() {
        synchronized (Restaurant.getLock()) {
            System.out.println("Waiters : Makanan siap diantarkan");
            Restaurant r = new Restaurant();
            r.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiters : Memberitahu restauran untuk membuat makanan lain\n");
        }
    }
}
