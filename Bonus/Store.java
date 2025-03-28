package Bonus;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private final ArrayList<Product> inventory;
    private int totalCola;
    private int totalCassis;

    public Store(){
        // gets initialized with 1000 cokes and 1000 cassis
        inventory = new ArrayList<>();
        inventory.addAll(createListOfProducts(new Product("Coca Cola", 1.68), 1000));
        addProduct(new Product("Cassis", 1.79), 1000);
    }
    public void addProduct(Product prod, int times){
        inventory.addAll(createListOfProducts(prod, times));
    }
    private List<Product> createListOfProducts(Product prod, int times){
        if(times < 1){
            throw new IllegalArgumentException("Times can't be less than one.");
        } else if (prod == null) {
            throw new IllegalArgumentException("Can't construct a list with null-products.");
        } else{
            ArrayList<Product> temp = new ArrayList<>();
            for(int i = 0; i < times; i++){
                if((Objects.equals(prod.getName(), "Coca Cola"))&&(prod.getPrice() == 1.68)){
                    totalCola++;
                }
                if((Objects.equals(prod.getName(), "Cassis"))&&(prod.getPrice() == 1.79)){
                    totalCassis++;
                }
                temp.add(prod);
            }
            return temp.stream().toList();
        }
    }
    public void printInfo(){
        StringBuilder temp = new StringBuilder("Information about this product: \n");
        String[] differentItems = getDifferentItems();

        temp.append("This store has ").append(inventory.size()).append(" products.\n");
        temp.append("These are the products that it offers: \n");

        for(int i = 0; i < differentItems.length; i++){
            temp.append(differentItems[i]).append("[").append(getNumItem(differentItems[i])).append("]");
            if(i == differentItems.length - 1){
                temp.append(".");
            }else{
                temp.append(", ");
            }
        }

        System.out.println(temp);
    }
    private String[] getDifferentItems(){
        ArrayList<String> differentItems = new ArrayList<>();
        differentItems.add("Coca Cola");
        differentItems.add("Cassis");
        for (Product product : inventory) {
            String temp1 = product.getName();
            if (!differentItems.contains(temp1)) {
                differentItems.add(temp1);
            }
        }
        return differentItems.toArray(new String[0]);
    }
    public void getNumItemVoid(String name){
        int num = 0;
        for(Product prod : inventory){
            if(Objects.equals(prod.getName(), name)){
                num++;
            }
        }
        String item = "items";
        if(num == 1){
            item = "item";
        }
        System.out.println("This store has " + num + " " + item + " of " + name);
    }
    private int getNumItem(String name){
        int num = 0;
        for(Product prod : inventory){
            if(Objects.equals(prod.getName(), name)){
                num++;
            }
        }
        return num;
    }
    public void removeItem(String productName, int times){
        int nums = getNumItem(productName);
        if(nums < times){
            System.out.println("There aren't even that many items of " + productName + ".\nThis store has " +
                    nums + " of " + productName);
        } else if (times < 1) {
            System.out.println("How am I supposed to remove something less than 1 times? That's " +
                    "either just doing nothing or adding.\nTry using addProduct().");
        } else{
            int i = 0;
            while(times > 0){
                if(Objects.equals(inventory.get(i).getName(), productName)){
                    inventory.remove(i);
                    times --;
                }
                i++;
            }
        }
    }

    public int getTotalCola() {
        return totalCola;
    }

    public int getTotalCassis() {
        return totalCassis;
    }
}
