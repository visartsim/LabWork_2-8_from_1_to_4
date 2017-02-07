package testshapes;

/**
 * Created by visartsim on 13.07.16.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString(){
        return "This is Rectangle, color - " + super.getShapeColor()
                + ", width = " + width
                + ", height = " + height;
    }

    @Override
    public double calcArea(){
        return width*height;
    }

    public void draw(){
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    public int compareTo(Object obj){
        if(obj instanceof Rectangle){
            if(this.calcArea() == ((Rectangle) obj).calcArea())
                return 0;
            if(this.calcArea() > ((Rectangle) obj).calcArea())
                return 1;
            else
                return -1;
        }
        return -100;
    }
}
