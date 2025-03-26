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
    Ingredient[] ingredients = {roomBoter, bakMeel, basterdSuiker, kaneel, paneerMeel, appel, kristalSuiker, zout, ei, vanilleSuiker};
    public void printIngredients(){
        int i = 1;
        for (Ingredient ingredient : ingredients){
            System.out.println(i + " - " + ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
            i++;
        }
    }
    public void voorverwarmen(){
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
    public void eiKloppen(){
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }
    public void mengen(){
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }
    public void schillenEnMengen(){
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }
    public void invetten(){
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }
    public void bekledenMetDeeg(){
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public void suikerStrooien(){
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public void deegRollen(){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public void leggenEnBestrijken(){
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }
    public void inDeOven(){
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
    public void printSteps(){
        voorverwarmen();
        eiKloppen();
        mengen();
        schillenEnMengen();
        invetten();
        bekledenMetDeeg();
        suikerStrooien();
        deegRollen();
        leggenEnBestrijken();
        inDeOven();
    }
}
