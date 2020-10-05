public class DishTools {
    public static void main(String[] args) {
        public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;

        public static void shoutDishName(Dish d){
            System.out.println(d.nameOfDish.toUpperCase());
        }

        public static void analyzeDishCost(Dish d){
            String message = (d.costInCents < AVERAGE_COST_OF_DISH_IN_CENTS) ?
                    "Less expensive than average" : "More expensive than average";
            System.out.println(message);
        }

        public static Dish flipRecommendation(Dish d){
            d.wouldRecommend = !d.wouldRecommend;
            return d;
        }
    }
}

//Create a class of static fields (properties and methods) called DishTools
//      - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000 (use the final keyword to make it a constant)
//      - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//      - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average”
//      or “Less expensive than average”, depending on the value of the dish costInCents compared to
//      AVERAGE_COST_OF_DISH_IN_CENTS
//      - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//    Try out the DishTools methods with Dish objects in the DishTest main method