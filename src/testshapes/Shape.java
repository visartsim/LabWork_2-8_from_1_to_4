package testshapes;

import java.util.Comparator;

/**
 * Created by visartsim on 13.07.16.
 */

class ShapeColorComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Shape shp1 = (Shape) o1;
        Shape shp2 = (Shape) o2;
        if (shp1.getShapeColor().compareTo(shp2.getShapeColor()) > 0)
            return 1;
        if (shp1.getShapeColor().compareTo(shp2.getShapeColor()) < 0)
            return -1;
        return 0;
    }
}

public abstract class Shape implements Drawable, Comparable {
    public static final String shapeArea = "Shape area is: ";
    public static final String[] shapeColors = {"RED", "BLACK", "GREEN", "YELLOW", "WHITE", "GREY"};
    private String shapeColor;

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
