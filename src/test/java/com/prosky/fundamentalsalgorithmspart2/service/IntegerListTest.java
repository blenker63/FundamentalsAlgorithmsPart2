package com.prosky.fundamentalsalgorithmspart2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerListTest {
    private final IntegerList IntegerList = new IntegerList();

    @BeforeEach
    public void List() {
        IntegerList.add(33);
        IntegerList.add(15);
        IntegerList.add(1);
    }

    @Test
    public void addTest() {
        Integer expected = 7;
        Integer actual = IntegerList.add(7);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addExceptionTest() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            IntegerList.add(44);
            IntegerList.add(66);
            IntegerList.add(77);
        });
    }

    @Test
    public void addIndexTest() {
        assertEquals(66, IntegerList.add(1, 66));
    }

    @Test
    public void addIndexExceptionTest() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            IntegerList.add(4, 90);
        });
    }

    @Test
    public void setTest() {
        assertEquals(85, IntegerList.set(1, 85));
    }

    @Test
    public void setIndexExceptionTest() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            IntegerList.set(4, 76);
//            IntegerList.add(1, "n");
        });
    }

    @Test
    public void removeTest() {
        Integer actual = 15;
        assertEquals(15, IntegerList.remove(actual));
    }

    @Test
    public void removeIndexTest() {
        assertEquals(15, IntegerList.remove(1));
    }

    @Test
    public void removeIndexExceptionTest() {
        assertThrows(ElementMissingException.class, () -> {
            IntegerList.remove(4);
        });
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            IntegerList.remove(5);
        });
    }

    @Test
    public void containsTest() {
        Assertions.assertTrue(IntegerList.contains(33));
        Assertions.assertFalse(IntegerList.contains(75));
    }

    @Test
    public void indexOfTest() {
        assertEquals(-1, IntegerList.indexOf(76));
        assertEquals(0, IntegerList.indexOf(33));
    }
    @Test
    public void LastIndexOfTest() {
        assertEquals(-1, IntegerList.indexOf(76));
    }

    @Test
    public void getTest() {
        assertEquals(15, IntegerList.get(1));
        assertEquals(null, IntegerList.get(4));
    }
    @Test
    public void getTestException() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            IntegerList.get(6);
        });
    }

    @Test
    public void sizeTest() {
        assertEquals(3, IntegerList.size());
    }

    @Test
    public void clearTest() {
        Assertions.assertNull(IntegerList.clear());
    }


    @Test
    public void isEmptyTest() {
        Assertions.assertFalse(IntegerList.isEmpty());

    }

    @Test
    public void toArrayTest() {
        Integer[] expected = {33, 15, 1, null, null};
        Integer[] actual = IntegerList.toArray();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void sortingTest() {
//        IntegerList.add(85);
        IntegerList.add(3);
        Integer[] expected = {1, 3, 15, 33, null};
        Integer[] actual = IntegerList.sorting();
        Assertions.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void containsBinaryTest() {
//        Assertions.assertTrue(IntegerList.containsBinary(33));
//        Assertions.assertFalse(IntegerList.containsBinary(75));
//    }

}
