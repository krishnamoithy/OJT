interface Vehicle {
    void move();
}

interface Engine {
    void start();
}

class Car implements Vehicle, Engine{
    @Override
    public void move(){
        System.out.println("The car is moving");
    }

    @Override
    public void start() {
        System.out.println("The car enggine is starting");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.move();
    }
}