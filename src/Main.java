
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ann", 4);
        Cat cat2 = new Cat("Bob", 2);
        Cat cat3 = new Cat("Can", 1);
        Cat cat4 = new Cat("Dag", 4);
        Cat cat5 = new Cat("Ema", 3);
        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
        System.out.println("initial cats list:\n" + cats);

        Predicate<Cat> pr1 = a -> a.getAge() < 4;
        Predicate<Cat> pr2 = a -> a.getName().charAt(0) > 'A';
        cats.removeIf(pr1.and(pr2));

        System.out.println("transformed cats list:\n" + cats);
    }
}
