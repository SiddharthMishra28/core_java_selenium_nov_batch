package com.java.oop.polymorphism;

public class AreaUtils {
    int length;
    int width;
    int radius;


    public void calcArea(int l, int w) {
        this.length = l;
        this.width = w;
        System.out.println("Area is square / rectangle is "+(length*width));
    }

    public void calcArea(int r) {
        this.radius = r;
        System.out.println("Area of circle is "+(Math.PI*r*r));
    }

    public void calcArea(int l, int w, boolean isTriangle) {
        this.length = l;
        this.width = w;
        System.out.println("Area of Triangle is "+(0.5*this.length*this.width));
    }

    public static void main(String[] args) {
        AreaUtils utils = new AreaUtils();
        utils.calcArea(5, 6, true);
    }
}
