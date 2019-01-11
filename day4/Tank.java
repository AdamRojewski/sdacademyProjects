package pl.sda.javastart.day4;

import java.math.BigDecimal;

public class Tank {
    private int weight;
    private String name;
    private int capacity;
    private int fuelConsumption;

    public int howfar(){
       int howfar  = (capacity / fuelConsumption) * 100;
       return howfar;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public int getFuelConsumption(){
        return fuelConsumption;
    }
    public void setFuelConsumption(int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }
    @Override public String toString(){
        return "Jestem czolgiem o masie " + weight + "kg, nazwie " + name + " i spalam " + fuelConsumption + "L na 100km";
    }


}

