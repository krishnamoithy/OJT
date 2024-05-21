public class vehicle {
    private int maxSpeed;
    private double mileage;

    public vehicle(int maxSpeed, double mileage) {
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void displayDetails() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Mileage: " + mileage + " km/l");
    }

    public static void main(String[] args) {
        vehicle bus = new vehicle(200,50);
        bus.displayDetails();
    }
}