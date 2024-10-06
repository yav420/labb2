package geometry3d;

import geometry2d.Circle;
import geometry2d.Figure;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {

        ArrayList<Double> list = new ArrayList<>();
        ArrayList<Double> expected = new ArrayList<>();
        Figure circle = new Circle(2);

        Cylinder cylinder = new Cylinder(circle, 8);
        Cylinder cylinder2 = new Cylinder(circle, 4);

        list.add(cylinder.volume());
        list.add(cylinder2.volume());

        expected.add(circle.area() * 8);
        expected.add(circle.area() * 4);

        assertEquals(expected, list);

    }
}