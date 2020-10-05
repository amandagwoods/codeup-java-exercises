import java.sql.SQLOutput;

public class DishTest {
    public static void main(String[] args) {
        Dish d = new Dish ();
        d.costInCents = 500;
        d.nameOfDish = "ice cream";
        d.wouldRecommend = true;
        d.printSummary();
    }
}
