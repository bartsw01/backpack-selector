package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Guest on 8/9/17.
 */
public class Backpack {

    private Map<String, Object> allItems = new HashMap<>();


    public Backpack(String typeOfBackpack){
        allItems = Item.getItems(typeOfBackpack);
    }

    public Map<String, Object> getAll(){
        return allItems;
    }
}
