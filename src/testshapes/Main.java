package testshapes;

import java.util.Arrays;

//main class
public class Main {
    //entry point
    public static void main(String[] args) {
	// write your code here
        //Circle object
        Circle cr = new Circle("YELLOW", 2);
        System.out.println(cr.toString());
        System.out.println(Shape.shapeArea + Math.round(cr.calcArea()));

        //Rectangle object
        Rectangle rect;
        rect = new Rectangle("GREEN", 2, 3);
        System.out.println(rect.toString());
        System.out.println(Shape.shapeArea + rect.calcArea());

        //Triangle object
        Triangle tr = new Triangle("BLACK", 1, 2, 3);
        System.out.println(tr.toString());
        System.out.println(Shape.shapeArea + tr.calcArea());

        //Array of Shapes
        Shape[] masShapes = new Shape[9];
        int i=0,j=0;
        //part Array of Triangles
        for(; i<5; i++, j++){
            masShapes[i] = new Triangle(Shape.shapeColors[j], i+1, i+2, i+3);
        }
        //part Array of Circles
        for(j=0; i<7; i++, j++){
            masShapes[i] = new Circle(Shape.shapeColors[j], i);
        }
        //part Array of Rectangles
        for(; i<9; i++, j++){
            masShapes[i] = new Rectangle(Shape.shapeColors[j], i, i);
        }
        //compare two rectangles by method compareTo and print result
        if(masShapes[7].compareTo(masShapes[8]) == -100)
            System.out.println("Objects cannot be compared");
        if(masShapes[7].compareTo(masShapes[8]) == 0)
            System.out.println("Objects have the same area");
        j = masShapes[8].getClass().toString().indexOf('.');
        if(masShapes[7].compareTo(masShapes[8]) == 1)
            System.out.println("Second " + masShapes[8].getClass().toString().substring(j+1) + " is less than first " + masShapes[7].getClass().toString().substring(j+1));
        else
            System.out.println("Second " + masShapes[8].getClass().toString().substring(j+1) + " is more than first " + masShapes[7].getClass().toString().substring(j+1));
        //print Array of Shapes (color and sizes) and their areas
        System.out.println("***************************************************");
        for(Drawable shp : masShapes){
            shp.draw();
        }
        //create and initialization of massive of rectangles
        Rectangle[] arr2 = new Rectangle[6];
        for(i=0; i<6; i++){
            arr2[i] = new Rectangle(Shape.shapeColors[i], i+2, i+3);
        }
        arr2[3] = new Rectangle("BLUE", 100, 30);

        //sort array of rectangles by result of working calcArea method
        System.out.println("***Sort rectangles by calcArea***");
        Arrays.sort(arr2);

        for(Rectangle r : arr2) {
            r.draw();
        }

        //sort array of rectangles by shapeColor field
        System.out.println("***Sort rectangles by color***");
        Arrays.sort(arr2, new ShapeColorComparator());

        for (Rectangle r : arr2) {
            r.draw();
        }

    }
}
