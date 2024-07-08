import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat =
                applicationContext.getBean("catBean", Cat.class);
        Cat beanCat2 =
                applicationContext.getBean("catBean", Cat.class);
        System.out.println("Результат сравнения бинов Hello world: " + (bean == bean2));
        System.out.println("Результат сравнения бинов Cat: " + (beanCat == beanCat2));
        System.out.println(bean.getMessage());
    }
}