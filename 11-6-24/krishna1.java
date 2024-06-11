abstract class cars{
    public abstract void carname();
    public void model(){
        System.out.println("The model is :x7 (2028)");
    }
}

class BMW extends cars{
    public void carname() {
        System.out.println("BMW");
    }
}

public class krishna1 {
    public static void main(String[] args) {
        BMW car = new BMW();
        car.carname();
        car.model();
    }
}