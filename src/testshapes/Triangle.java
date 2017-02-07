package testshapes;

/**
 * Created by visartsim on 13.07.16.
 */
public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    Triangle(String color, double a, double b, double c){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString(){
        return "This is Triangle, color - " + super.getShapeColor()
                + ", a = " + a
                + ", b = " + b
                + ", c = " + c;
    }

    @Override
    public double calcArea(){
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public void draw(){
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    public int compareTo(Object obj){
        if(obj instanceof Triangle){
            if(this.calcArea() == ((Triangle) obj).calcArea())
                return 0;
            if(this.calcArea() > ((Triangle) obj).calcArea())
                return 1;
            else
                return -1;
        }
        return -100;
    }
}
