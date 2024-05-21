public class task10 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 0;
        
        boolean a = (x == 2);

        boolean b = (x != 5);

        boolean c = (x != 5 && y >= 5);
 
        boolean d = (z != 0 || x == 2);

        boolean e = !(y < 10);

        System.out.println("a. x == 2 :" + a);
        System.out.println("b. x != 5 : " + b);
        System.out.println("c. x != 5 && y >= 5 : " + c);
        System.out.println("d. z != 0 || x == 2 : " + d);
        System.out.println("e. !(y < 10) : " + e);
    }
}
