package models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Guest on 8/9/17.
 */
public class Item {
    private static Map<String, Object> allItems = new HashMap<>();

    private String name;
    private Double price;
    private boolean purchased;
    private Double weight;
    private String manufacturer;
    private boolean packed;

    public Item(String name, Double price, Double weight, String manufacturer){
        this.name = name;
        this.price = price;
        this.purchased = false;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.packed = false;
    }

    public static Map<String, Object> getItems(String type){
        if(type.equals("Camping")){
            allItems.put("Sleeping Bag", new Item("Sleeping Bag", 70.00, 5.00, "Coleman"));
            allItems.put("Towel", new Item("Towel", 5.50, .75, "Pendleton"));
            allItems.put("Camp Stove", new Item("Camp Stove", 19.99, 3.5, "Coleman"));
            return allItems;
        }else if(type.equals("Backpacking")){
            allItems.put("Sleeping Bag", new Item("Sleeping Bag", 70.00, 5.00, "Coleman"));
            allItems.put("Towel", new Item("Towel", 5.50, .75, "Pendleton"));
            return allItems;
        }else if(type.equals("Bike Touring")){
            allItems.put("Sleeping Bag", new Item("Sleeping Bag", 70.00, 5.00, "Coleman"));
            allItems.put("Towel", new Item("Towel", 5.50, .75, "Pendleton"));
            return allItems;
        }else if(type.equals("Rock Climbing")){
            allItems.put("Sleeping Bag", new Item("Sleeping Bag", 70.00, 5.00, "Coleman"));
            allItems.put("Towel", new Item("Towel", 5.50, .75, "Pendleton"));
            return allItems;
        }else{
            return allItems;
        }
    }

    public static Map<String, Object> getAllItems(){
        return allItems;
    }
}
