package pl.sda.javastart.day6.day6Homework;

public class Rectangle extends Figure {
    private double width;
    private double height;
    private Point p1;

    public Rectangle(double width, double height, Point p1) {
        this.width = width;
        this.height = height;

    }
    @Override
    public double getArea(){
        return width * height;
    }

}
