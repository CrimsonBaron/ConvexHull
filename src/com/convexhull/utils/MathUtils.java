package com.convexhull.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class MathUtils {

    public static int vectorAngle(Point vector1, Point vector2){
        int num = (vector1.getX()*vector2.getX() + vector1.getY()*vector2.getY());
        double den = (Math.sqrt(Math.pow(vector1.getX(), 2) + Math.pow(vector1.getY(), 2)) * (Math.sqrt(Math.pow(vector2.getX(), 2) + Math.pow(vector2.getY(), 2))) );
        double cos =  num / den;
        return (int) (Math.acos(cos)*180/Math.PI);
    }

    public static boolean isShapeConvex(List<Point> points){
        Vector<Point> hull = ConvexHull.convexHull(points, points.size());
        for (Point p : hull) {
            System.out.println(p.getX()+" | "+p.getY());

        }
        return hull.size() == points.size();
    }
}
