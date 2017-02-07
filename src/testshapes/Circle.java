package testshapes;

/**
 * Created by visartsim on 13.07.16.
 */
public class Circle extends Shape {
    private double radius;

    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "This is Circle, color - " + super.getShapeColor()
                + ", radius = " + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void draw(){
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    public int compareTo(Object obj){
        if(obj instanceof Circle){
            if(this.calcArea() == ((Circle) obj).calcArea())
                return 0;
            if(this.calcArea() > ((Circle) obj).calcArea())
                return 1;
            else
                return -1;
        }
        return -100;
    }
}
