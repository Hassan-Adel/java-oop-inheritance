package com.tutorial;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Generated by IntelliJ
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        //same reference
//        if(this == obj)
//            return true;
//
//        if (!(obj instanceof Point))
//            return false;
//
//        //same value
//        var other = (Point)obj;
//        return other.x == x && other.y==y;
//    }
//
//    //hashed based on the value instead of reference
//    @Override
//    public int hashCode() {
//        //generate a hash value
//        return Objects.hash(x, y);
//    }

}
