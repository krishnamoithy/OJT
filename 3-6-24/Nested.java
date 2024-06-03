public class Nested {
    public static void main(String[] args) {
        int x = 30;
        int y = 10;

        if (x > 20) {
            System.out.println("X is greater than 20");
            if (y > 5) {
                System.out.println("Y is greater than 5");
            } else {
                System.out.println("Y is 5 or less");
            }
        } else {
            System.out.println("X is 20 or less");
        }
    }
}
