package pl.sda.javastart.day6.day6Homework;

public class Circle extends Figure {
    private double r;
    final double pi = Math.PI;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getCircuit(){
        return pi * r;
    }
}
