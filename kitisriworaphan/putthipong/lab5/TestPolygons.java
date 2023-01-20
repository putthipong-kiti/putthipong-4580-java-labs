/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 19, 2022 
 *
 * This is a Java program named TestPolygons.
 * Two objects are created in this program:
 * First one using PolygonType.RECTANGLE
 * Second one using PolygonType.TRIANGLE
 * In this program, static variables are called and used. 
 * It can be seen that the static variables of all objects have the same value.
**/

package kitisriworaphan.putthipong.lab5;

import kitisriworaphan.putthipong.lab5.Polygon.PolygonType;

public class TestPolygons {
    public static void main(String[] args) {
        Polygon polygon1 = new Polygon();
        polygon1.width = 2;
        polygon1.height = 3;
        polygon1.type = PolygonType.RECTANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon1.getArea());
        Polygon polygon2 = new Polygon();
        polygon2.width = 3;
        polygon2.height = 4;
        polygon2.type = PolygonType.TRIANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon2.getArea());
        System.out.println("The number of polygons is " + Polygon.numPolygons + " or "
                + polygon1.numPolygons + " or " + polygon2.numPolygons);
        System.out.println("The width of polygon1 is " + polygon1.width
                + " the width of polygon2 is " + polygon2.width);
        System.out.println("The sum of polygons area is " + Polygon.sumPolygonsArea);
    }
}
