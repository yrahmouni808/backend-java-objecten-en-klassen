package Bonus;

import java.util.ArrayList;

public class Zoo {
    private final ArrayList<Animal> animals;
    private final String name;

    public Zoo(String name){
        animals = new ArrayList<>();
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void printInfo(){
        StringBuilder temp = new StringBuilder("Welcome to ").append(name).append("\n");
        if(animals.isEmpty()){
            temp.append("We currently don't have any animals. Please come back later!");
        }else{
            temp.append("These are the animals in our zoo: \n");
            int i = 1;
            for(Animal animal : animals){
                temp.append("Animal ").append(i).append(":\n");
                temp.append("Name: ").append(animal.getName()).append(".\n");
                temp.append("Kind: ").append(animal.getKind()).append(".\n");
                temp.append("Stay: ").append(animal.getStay()).append(".\n");
                temp.append("Feed: ").append(animal.getFeed()).append(".\n");
                i++;
            }
        }
        System.out.println(temp);
    }
}
