package com.convexhull.utils;

import java.util.List;
import java.util.Vector;

public class ConvexHull {

    public ConvexHull() {
    }

    private static int orientation(Point p,Point q, Point r){
        int val = (q.getY() - p.getY()) * (r.getX() - q.getX()) - (q.getX() - p.getX()) * (r.getY() - q.getY());
        if (val == 0) {return 0;}
        return (val >0)? 1:2;
    }

    public static Vector<Point> convexHull(List<Point> points, int n){
        if (n < 3) {return null;}
        Vector<Point> hull = new Vector<>();
        int l=0;

        for (int i = 0; i <n ; i++) {
            if (points.get(i).getX() < points.get(l).getX()){
                l = i;
            }
        }
        int p = l, q;
        do {
            hull.add(points.get(p));
            q=(p+1)%n;
            for (int i = 0; i <n ; i++) {
                if (orientation(points.get(p), points.get(i), points.get(q)) == 2) {
                    q = i;
                }
            }
            p = q;
        }while (p!=l);


        return hull;
    }

}
