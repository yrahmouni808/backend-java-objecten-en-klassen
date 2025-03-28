package src;

import Bonus.Film;
import Bonus.Product;
import Bonus.Store;

import java.time.LocalDate;

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
        Film idk = new Film("Robert-Jan", "Rowan", LocalDate.of(2025, 3, 26), "Adult");
        idk.printInfo();
        Store winkel = new Store();
        winkel.addProduct(new Product("telefoon", 699.99), 500);
        winkel.printInfo();
        winkel.removeItem("telefoon", 200);
        winkel.printInfo();
        winkel.removeItem("telefoon", 0);
    }
}
