public class Calculation implements Runnable {
    double radius;
    double side;
    double area;
    double phi = 3.14;

    public void setSquare(double side) {
        try {
            double square = side * side;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public double getSquare() {
        return area;
    }

    public void setCircle(double phi, double radius) {
        try {
            double circle = phi * radius * radius;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public double getCircle() {
        return area;
    }

    public void setTrapezoid(double a, double b, double t) {
        try {
            double trapezoid = ((a + b) * t / 2);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public double getTrapezoid() {
        return area;
    }

    @Override
    public void run() {
        System.out.println("Program will start in ");
        for (int i = 3; i < 1;) {
            System.out.println("Starting with Thread " + i--);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
