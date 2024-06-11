
import java.util.HashMap;

public class hasmapex {
    public static void main(String[] args) {
        HashMap<Integer,String> m1 = new HashMap<>();
        m1.put(1,"krishna");
        m1.put(2,"moorthy");
        m1.put(3,"kd");

        System.out.println("value at key number 1:"+m1.get(1));
        
        for(Integer key:m1.keySet()){
            System.out.println("key"+key+",vakue:"+m1.get(key));
        }
        System.out.println("************************");
        m1.replace(3, "kd","kd__krishna");
          
        for(Integer key:m1.keySet()){
            System.out.println("key"+key+",vakue:"+m1.get(key));
        }
    }
}
