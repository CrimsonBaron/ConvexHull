package com.convexhull;

import com.convexhull.utils.ConvexHull;
import com.convexhull.utils.MathUtils;
import com.convexhull.utils.Point;

import java.util.ArrayList;
import java.util.List;

public class App {
    public App() {
    }

    /*
    * první napad byl ze spočitam uhly ale pak my došlo že convex hull tvoři jen konvexní tvary
    * takže stači jen zjistit zdaly všechny body jsou v ve tvaru nebo ne
    * nevim zdaly toto je dobře ale budiš
    * */

    public void Run(String[] args){
        List<Point> points = new ArrayList<>();

        System.out.println("convex n shape:");
        points.add(new Point(0,0));
        points.add(new Point(9,-3));
        points.add(new Point(0, 5));
        points.add(new Point(1,7));
        points.add(new Point(17,3));
        System.out.println("isConvex: "+MathUtils.isShapeConvex(points));

        points.clear();

        System.out.println("convex square shape:");
        points.add(new Point(0,0));
        points.add(new Point(2,0));
        points.add(new Point(0,2));
        points.add(new Point(2,2));
        System.out.println("isConvex: "+MathUtils.isShapeConvex(points));

        points.clear();

        System.out.println("convex triangle shape:");
        points.add(new Point(0,0));
        points.add(new Point(2,-2));
        points.add(new Point(2,2));
        System.out.println("isConvex: "+MathUtils.isShapeConvex(points));

        points.clear();

        System.out.println("non convex n shape:");
        points.add(new Point(0,0));
        points.add(new Point(5,4));
        points.add(new Point(16, 8));
        points.add(new Point(1,7));
        points.add(new Point(0,6));
        System.out.println("isConvex: "+MathUtils.isShapeConvex(points));

    }

}
