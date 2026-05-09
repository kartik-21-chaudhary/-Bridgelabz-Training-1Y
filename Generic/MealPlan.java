interface MealPlan {
}

class VegetarianMeal implements MealPlan {
}

class VeganMeal implements MealPlan {
}

class Meal<T extends MealPlan> {

    T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    static <T extends MealPlan> void generate(T meal) {
        System.out.println(meal);
    }
}

class Main15 {

    public static void main(String[] args) {

        Meal<VegetarianMeal> m =
                new Meal<>(new VegetarianMeal());

        Meal.generate(m.meal);
    }
}