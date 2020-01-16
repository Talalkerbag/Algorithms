/**
 * Java program to find maximum are of a quadrilateral
 *
 * @author Talal Kerbag, kerbagtalal94@gmail.com
 */
package com.williamfiset.algorithms.geometry;

public class QuadrilateralMaxArea {
    static double maxArea(double a, double b, double c, double d){
        //Calculating the semi-perimeter of the given Quadrilatera
        double semiperimeter = (a + b + c + d) / 2;

        //Applying Brahmagupta's formula to get maximum area of quadrilateral
        return Math.sqrt((semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c) * (semiperimeter - d));

    }

    //Test
    public static void main(String [] args){
        double a = 1, b = 2, c = 1, d = 2;
        System.out.println("Max area of the quadrilateral: " + maxArea(a,b,c,d));
    }
}
