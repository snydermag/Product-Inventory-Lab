package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {
    private static Integer nextId = 1;

    public List<Sneaker> getInventory() {
        return inventory;
    }

    private List<Sneaker> inventory = new ArrayList<>();

    public Sneaker create(String name, String brand, String sport, int size, int quantity, float price) {

        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);

        inventory.add(createdSneaker);

        return createdSneaker;
    }



    //read
    public Sneaker findSneaker(Integer id) {
        for (Sneaker s : inventory){
            if (id.equals(s.getId())){
                return s;
            }
        }
        return null;
    }

    //read all
    public Sneaker[] findAll() {
        Sneaker[] array = new Sneaker[inventory.size()];
        array = inventory.toArray(array);
        return array;
    }

    //delete
    public boolean delete(Integer id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false

        for (Sneaker s : inventory){
            if (id.equals(s.getId())){
                inventory.remove(s);
                return true;
            }
        }
        return false;
    }
}
