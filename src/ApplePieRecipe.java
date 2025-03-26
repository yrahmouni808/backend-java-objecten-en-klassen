package src;

public class ApplePieRecipe {
    public ApplePieRecipe(){

    }
    Ingredient roomBoter = new Ingredient(
            "ongezouten roomboter",
            200,
            "gram"
    );
    Ingredient basterdSuiker = new Ingredient(
            "witte bastard suiker",
            200,
            "gram"
    );
    Ingredient bakMeel = new Ingredient(
            "zelfrijzend bakmeel",
            400,
            "gram"
    );
    Ingredient ei = new Ingredient(
            "ei",
            1,
            "stuk"
    );
    Ingredient vanilleSuiker = new Ingredient(
            "vanillesuiker",
            8,
            "gram"
    );
    Ingredient zout = new Ingredient(
            "zout",
            1,
            "snuf"
    );
    Ingredient appel = new Ingredient(
            "zoetzure appels",
            1.5f,
            "kilo"
    );
    Ingredient kristalSuiker = new Ingredient(
            "kristal suiker",
            75,
            "gram"
    );
    Ingredient kaneel = new Ingredient(
            "kaneel",
            3,
            "theelepels"
    );
    Ingredient paneerMeel = new Ingredient(
            "paneermeel",
            15,
            "gram"
    );
    public void voorVerwarmen(){
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven " +
                "en onderwarmte)");
    }
    public void eiKloppen(){
        System.out.println(
                "Klop het " + ei.getName() + " los en verdeel deze in 2 delen. De ene helft"
                + " voor het deeg"
        );
    }
}
