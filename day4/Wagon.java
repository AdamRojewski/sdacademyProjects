package pl.sda.javastart.day4;

public class Wagon {
    private int weight;
    private int klasa;
    private int passengersCapacity;
    private boolean food;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getKlasa() {
        return klasa;
    }

    public void setKlasa(int klasa) {
        this.klasa = klasa;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public boolean getFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;

    }

        public static void main (String[]args){
            Wagon wagon = new Wagon();
            wagon.setWeight(2000);
            wagon.setKlasa(3);
            wagon.setPassengersCapacity(350);
            wagon.setFood(true);
            System.out.println(wagon);
        }


        @Override
        public String toString () {
            return "masa " + weight + "\nklasa " + klasa + "\nliczba pasazerow " + passengersCapacity + "\ndostepne jedzenie";
        }
    }

