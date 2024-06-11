// import java.lang.reflect.Method;
 
// @interface myannotation {
//     String value();
// }
 
// public class customann {
//     @myannotation("custom annotation")
//     public void annmethod() {
//         System.out.println("This is an annotated method");
//     }
 
//     public static void main(String[] args) throws Exception {
//         customann obj = new customann();
//         obj.annmethod();
//         Method method = obj.getClass().getMethod("annmethod");
//         myannotation ann = method.getAnnotation(myannotation.class);
//         System.out.println("annotation value: " + ann.value());
//     }
// }

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
 
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface myannotation {
    String value();
}
 
public class customann {
    @myannotation("custom annotation")
    public void annmethod() {
        System.out.println("This is an annotated method");
    }
 
    public static void main(String[] args) throws Exception {
        customann obj = new customann();
        obj.annmethod();
        Method method = obj.getClass().getMethod("annmethod");
        myannotation ann = method.getAnnotation(myannotation.class);
        System.out.println("annotation value: " + ann.value());
        System.out.println("annotation name: " + ann.annotationType().getSimpleName());
    }
}