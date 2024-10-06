package geometry2d;

import org.example.Main;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {

        ArrayList<Double> list = new ArrayList<>();
        ArrayList<Double> expected = new ArrayList<>();

        Circle circle = new Circle(2);
        Circle circle2 = new Circle(5);

        list.add(circle.area());
        list.add(circle2.area());

        expected.add(Math.PI*2*2);
        expected.add(Math.PI*5*5);

        assertEquals(expected, list);
    }
}