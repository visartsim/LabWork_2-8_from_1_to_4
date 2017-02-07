package testshapes;

/**
 * Created by visartsim on 13.07.16.
 */

public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;
    public static final String shapeArea = "Shape area is: ";
    public static final String[] shapeColors = {"RED", "BLACK", "GREEN", "YELLOW", "WHITE", "GREY"};

    Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String getShapeColor(){
        return shapeColor;
    }

    @Override
    public String toString(){
        return "Shape, color is: " + shapeColor;
    }

    public abstract double calcArea();
}
