package com.java.oop.polymorphism;

public class VolumeUtils extends AreaUtils {
    int height;

    public void calcVolume(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("Volume of Cube / Cuboid is "+(this.length* this.width* this.height));
    }

    public void calcVolume(int r) {
        this.radius = r;
        System.out.println("Volume of Sphere is "+((4/3)*Math.PI*Math.pow(r,3)));
    }

    public static void main(String[] args) {
        VolumeUtils utils = new VolumeUtils();
        utils.calcVolume(4, 5, 6);
    }
}
