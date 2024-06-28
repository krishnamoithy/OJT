import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) // This annotation can be applied to methods only
@interface MyCustomAnnotation {
    String author() default "unknown";
    String date();
    String description() default "";
}

// Apply the custom annotation
public class AnnotationExample {

    @MyCustomAnnotation(author = "KRISHNAMOORTHY", date = "2024-06-26", description = "ANNOTATION")
    public void sampleMethod() {
        System.out.println("This is MyCustomAnnotation.");
    }

    @MyCustomAnnotation(date = "2024-06-26")
    public void anotherMethod() {
        System.out.println("This is another MyCustomAnnotation.");
    }

    public static void main(String[] args) throws Exception {
        AnnotationExample example = new AnnotationExample();
        example.sampleMethod();
        example.anotherMethod();

        // Accessing annotations
        Method[] methods = example.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
                MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Author: " + annotation.author());
                System.out.println("Date: " + annotation.date());
                System.out.println("Description: " + annotation.description());
                // System.out.println("------------------------------------");
            }
        }
    }
}
