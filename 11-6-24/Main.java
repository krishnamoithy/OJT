abstract class Krishna {
    public abstract void stuname();

    public void section() {
        System.out.println("ADIT (CALICUT)");
    }
}

class Moorthy extends Krishna {
    public void stuname() {
        System.out.println("I am KRISHNAMOORTHY");
    }
}

public class Main {  
    public static void main(String[] args) {
        Moorthy kd = new Moorthy();
        kd.stuname();
        kd.section();
    }
}
