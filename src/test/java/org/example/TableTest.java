package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void rows() {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();

        Table table = new Table(3, 3);
        Table table1 = new Table(5, 5);

        list.add(table.rows());
        list.add(table1.rows());

        expected.add(3);
        expected.add(5);

        assertEquals(expected, list);
    }

    @Test
    void cols() {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();

        Table table = new Table(3, 3);
        Table table1 = new Table(5, 5);

        list.add(table.cols());
        list.add(table1.cols());

        expected.add(3);
        expected.add(5);

        assertEquals(expected, list);
    }

    @Test
    void average() {

        double list;
        double expected;
        Table table = new Table(3, 3);

        for (int i = 0; i < table.rows(); i++) {
            for (int j = 0; j < table.cols(); j++) {
                table.setValue(i, j, 5);
            }
        }

        list = table.average();
        expected = (3.0 * 3 * 5) / (3 * 3);
        assertEquals(expected, list);
    }
}