package pl.sda.javastart.day6;

public abstract class Figure {
    private abstract String toString();

    private abstract double getArea();

    private abstract double getCircuit();

    private abstract Point[] getEdges();
}
