/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 19, 2022 
 *
 * This is a Java class named Polygon. 
 * It contains three instance variables: width, height, and type.
 * And two static variables: numPolygons and sumPolygonsArea. 
 * type variable uses PolygonType enum type, which has two values: RECTANGLE and TRIANGLE.
 * numPolygons variable is used to collect the number of polygons entered using the static method setNumPolygons.
 * sumPolygonsArea variable is used to collect the sum of all polygon areas entered using the static method setSumPolygonsArea.
**/

package kitisriworaphan.putthipong.lab5;

public class Polygon {
    double width;
    double height;
    PolygonType type;

    enum PolygonType {
        RECTANGLE, TRIANGLE
    }

    static int numPolygons;
    static double sumPolygonsArea;

    public double getArea() {
        double area = 0;
        switch (type) {
            case RECTANGLE:
                area = width * height;
                break;
            case TRIANGLE:
                area = (width * height) / 2;
                break;
            default:
                break;
        }
        return area;
    }

    public static void setNumPolygons(int numNewPolygons) {
        numPolygons += numNewPolygons;
    }

    public static void setSumPolygonsArea(double newPolygonsArea) {
        sumPolygonsArea += newPolygonsArea;
    }
}
