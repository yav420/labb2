package geometry3d;

import geometry2d.Figure;

public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure base, double height) {
        if (height <= 0) {
            throw new exceptions.InvalidHeightException("Высота должна быть положительной");
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Цилиндр объемом: " + volume();
    }
}