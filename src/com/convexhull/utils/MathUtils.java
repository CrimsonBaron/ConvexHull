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
       /* for (int i = 0; i < hull.size() ; i++) {
            int prevI = i==0 ? hull.size()-1 : i-1;
            int nextI = i == hull.size()-1 ? 0 : i+1;

            Point v1 = new Point((hull.get(i).getX() - hull.get(prevI).getX()),(hull.get(i).getY() - hull.get(prevI).getY()));
            Point v2 = new Point((hull.get(nextI).getX() - hull.get(i).getX()),(hull.get(nextI).getY() - hull.get(i).getY()));

            angleMap.put(hull.get(i),vectorAngle(v1,v2));
        }

        boolean isConvex = true;


        for (Point p : angleMap.keySet()) {
            System.out.println(p.getX()+" | "+p.getY()+"=> "+angleMap.get(p));
            if (angleMap.get(p) > 180) {
                isConvex = false;
            }
        }
        return isConvex;*/
        for (Point p : hull) {
            System.out.println(p.getX()+" | "+p.getY());

        }
        return hull.size() == points.size();
    }
}
