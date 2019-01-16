package pl.sda.javastart.day4;

public class TankObject {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.setName("Rudy");
        System.out.println(tank.getName());
        tank.setCapacity(60);
        System.out.println(tank.getCapacity());
        tank.setFuelConsumption(13);
        System.out.println(tank.getFuelConsumption());
        tank.setWeight(1000);
        System.out.println(tank.getWeight());

        System.out.println(tank.toString());
        System.out.println(tank);
        System.out.println("Na baku przejade " + tank.howfar() + " km");

}}
