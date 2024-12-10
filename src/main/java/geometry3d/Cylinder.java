// Пакет geometry3d
package geometry3d;

import exceptions.InvalidHeightException;
import geometry2d.Figure;

public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure base, double height) throws InvalidHeightException, IllegalArgumentException {
        if (height <= 0)
            throw new InvalidHeightException("Высота должна быть положительной");
        if (base == null)
            throw new IllegalArgumentException("Основа не должна быть пустой");

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
