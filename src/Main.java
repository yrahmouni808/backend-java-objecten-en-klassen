package src;

public class Main {
    public static void main(String[] args) {
//        ApplePieRecipe applePieRecipe = new ApplePieRecipe();
//        applePieRecipe.printIngredients();
//        applePieRecipe.printSteps();
        Recipe brownie = new Recipe();
        brownie.addIngredient("Chocolate", 100, "gram");
        brownie.printIngredients();
        brownie.addStep("Throw it at the wall.");
        brownie.printSteps();
    }
}
