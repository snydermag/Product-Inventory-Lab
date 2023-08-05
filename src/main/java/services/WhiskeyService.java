package services;

import models.Sneaker;
import models.Whiskey;

import java.util.ArrayList;
import java.util.List;

public class WhiskeyService {

    private static Integer nextId = 1;

    public List<Whiskey> getInventory() {
        return inventory;
    }

    private List<Whiskey> inventory = new ArrayList<>();

    public Whiskey create(String name, String brand, String location, int size, int quantity, float price) {

        Whiskey createdWhiskey = new Whiskey(nextId++, name, brand, location, size, quantity, price);

        inventory.add(createdWhiskey);

        return createdWhiskey;
    }



    //read
    public Whiskey findWhiskey(Integer id) {
        for (Whiskey w : inventory){
            if (id.equals(w.getId())){
                return w;
            }
        }
        return null;
    }

    //read all
    public Whiskey[] findAll() {
        Whiskey[] array = new Whiskey[inventory.size()];
        array = inventory.toArray(array);
        return array;
    }

    //delete
    public boolean delete(Integer id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false

        for (Whiskey w : inventory){
            if (id.equals(w.getId())){
                inventory.remove(w);
                return true;
            }
        }
        return false;
    }
}
